using System;

using Android.App;
using Android.Content;

using Android.Views;
using Android.Widget;
using Android.OS;
using Android.Support.V7.App;
using Android.Gms.Ads;

using Com.Vdopia.Ads.LW;


namespace ChocolateSample
{
	[Activity (Label = "@string/app_name", MainLauncher = true)]
	public class MainActivity : AppCompatActivity, IInitCallback, IRewardedAdListener, ILVDOBannerAdListener, ILVDOInterstitialListener, IDialogInterfaceOnClickListener
    {
		protected AdView admobBannerAd;
		//protected InterstitialAd admobInterstitialAd;
		protected Button loadInterstitialButton, loadRewardedButton, loadInviewButton;
        private ViewGroup chocolateInviewAdContainer;
        private LVDOInterstitialAd chocolateInterstitialAd;
        private LVDORewardedAd chocolateRewardedAd;
        private LVDOBannerAd chocolateInviewAd;
        private LVDOAdRequest chocolateAdRequest;
        private int requestedAdType;

        const string CHOCOLATE_API_KEY = "XqjhRR";
        const int ADTYPE_INTERSTITIAL = 0;
        const int ADTYPE_REWARDED = 1;
        const int ADTYPE_INVIEW = 2;

        protected override void OnCreate (Bundle savedInstanceState)
		{
			base.OnCreate (savedInstanceState);
            enableTestAds(true);

            SetContentView (Resource.Layout.activity_main);

			admobBannerAd = FindViewById<AdView> (Resource.Id.adView);
            chocolateInviewAdContainer = FindViewById<ViewGroup>(Resource.Id.chocolateInviewAdContainer);
            var adRequest = new AdRequest.Builder ().Build ();
			admobBannerAd.LoadAd (adRequest);

			//admobInterstitialAd = new InterstitialAd (this);
			//admobInterstitialAd.AdUnitId = GetString (Resource.String.test_interstitial_ad_unit_id);

			//admobInterstitialAd.AdListener = new AdListener (this);

			loadInterstitialButton = FindViewById<Button> (Resource.Id.load_interstitial_button);
			loadInterstitialButton.SetOnClickListener (new OnClickListener (this, ADTYPE_INTERSTITIAL));
            loadRewardedButton = FindViewById<Button>(Resource.Id.load_rewarded_button);
            loadRewardedButton.SetOnClickListener(new OnClickListener(this, ADTYPE_REWARDED));
            loadInviewButton = FindViewById<Button>(Resource.Id.load_inview_button);
            loadInviewButton.SetOnClickListener(new OnClickListener(this, ADTYPE_INVIEW));

            chocolateAdRequest = new LVDOAdRequest(this);

            Chocolate.Init(this, CHOCOLATE_API_KEY, chocolateAdRequest, this);
            chocolateRewardedAd = new LVDORewardedAd(this, CHOCOLATE_API_KEY, this);
            chocolateInterstitialAd = new LVDOInterstitialAd(this, CHOCOLATE_API_KEY, this);
            chocolateInviewAd = new LVDOBannerAd(this, LVDOAdSize.IabMrect, CHOCOLATE_API_KEY, this);
        }

        public void OnSuccess()
        {

        }

        public void OnError(String message)
        {

        }

        //Enables ~some~ ad providing partners to show test ads
        //in particular Chocolate and Amazon
        //Other partners either don't allow test ads
        //or there is some other way to enabled them.  
        private void enableTestAds(bool enable)
        {
            VdopiaLogger.Enable(enable);
            Chocolate.EnableChocolateTestAds(enable);
        }

        public void OnRewardedVideoLoaded(LVDORewardedAd var1)
        {
            chocolateRewardedAd.ShowRewardAd("qj5ebyZ0F0vzW6yg", "Chocolate1", "coin", "30");
        }

        public void OnRewardedVideoFailed(LVDORewardedAd var1, LVDOConstants.LVDOErrorCode var2)
        {

        }

        public void OnRewardedVideoShown(LVDORewardedAd var1)
        {

        }

        public void OnRewardedVideoShownError(LVDORewardedAd var1, LVDOConstants.LVDOErrorCode var2)
        {

        }

        public void OnRewardedVideoDismissed(LVDORewardedAd var1)
        {

        }

        public void OnRewardedVideoCompleted(LVDORewardedAd var1)
        {

        }

        // The interstitial has been cached and is ready to be shown.
        public void OnInterstitialLoaded(LVDOInterstitialAd interstitialAd)
        {
            chocolateInterstitialAd.Show();
        }

        // The interstitial has failed to load. Inspect errorCode for additional information.
        public void OnInterstitialFailed(LVDOInterstitialAd interstitialAd, LVDOConstants.LVDOErrorCode errorCode)
        {

        }

        // The interstitial has been shown. Pause / save state accordingly.
        public void OnInterstitialShown(LVDOInterstitialAd interstitialAd)
        {

        }

        // The interstitial has been clicked and take actions accordingly.
        public void OnInterstitialClicked(LVDOInterstitialAd interstitialAd)
        {

        }

        // The interstitial has being dismissed. Resume / load state accordingly.
        public void OnInterstitialDismissed(LVDOInterstitialAd interstitialAd)
        {

        }

        // Banner has successfully loaded.
        public void OnBannerAdLoaded(View banner)
        {
            if (banner != null)
            {
                chocolateInviewAdContainer.RemoveAllViews();
                chocolateInviewAdContainer.AddView(banner);
            }
        }

        // Banner has failed to retrieve an ad.
        public void OnBannerAdFailed(View banner, LVDOConstants.LVDOErrorCode errorCode)
        {

        }

        // The user has tapped on the banner.
        public void OnBannerAdClicked(View banner)
        {

        }

        // Banner is closed back.
        public void OnBannerAdClosed(View banner)
        {

        }

        public void OnClick(IDialogInterface var1, int var2)
        {
            if (requestedAdType == ADTYPE_INTERSTITIAL)
            {
                ChocolatePartners.SetInterstitialPartners(chocolateAdRequest);
                chocolateInterstitialAd.LoadAd(chocolateAdRequest);
            }
            else if (requestedAdType == ADTYPE_REWARDED)
            {
                ChocolatePartners.SetRewardedPartners(chocolateAdRequest);
                chocolateRewardedAd.LoadAd(chocolateAdRequest);
            }
            else if (requestedAdType == ADTYPE_INVIEW)
            {
                ChocolatePartners.SetInviewPartners(chocolateAdRequest);
                chocolateInviewAd.LoadAd(chocolateAdRequest);
            }
        }

        protected void RequestNewInterstitial ()
		{
            requestedAdType = ADTYPE_INTERSTITIAL;
            ChocolatePartners.ChoosePartners(requestedAdType, this, this);
        }

        protected void RequestNewRewarded()
        {
            requestedAdType = ADTYPE_REWARDED;
            ChocolatePartners.ChoosePartners(requestedAdType, this, this);
        }

        protected void RequestInview()
        {
            requestedAdType = ADTYPE_INVIEW;
            ChocolatePartners.ChoosePartners(requestedAdType, this, this);
        }

		protected override void OnPause ()
		{
			if (admobBannerAd != null) {
				admobBannerAd.Pause ();
			}
			base.OnPause ();
		}

		protected override void OnResume ()
		{
			base.OnResume ();
			if (admobBannerAd != null) {
				admobBannerAd.Resume ();
			}
            /*  kkawai
			if (!mInterstitialAd.IsLoaded) {
				RequestNewInterstitial ();
			}
			*/
        }

		protected override void OnDestroy ()
		{
			if (admobBannerAd != null) {
				admobBannerAd.Destroy ();
			}
			base.OnDestroy ();
		}

		class AdListener : Android.Gms.Ads.AdListener
		{
			MainActivity that;

			public AdListener (MainActivity t)
			{
				that = t;
			}

			public override void OnAdClosed ()
			{

			}
		}

		class OnClickListener : Java.Lang.Object, View.IOnClickListener
		{
			MainActivity that;
            int adType;

			public OnClickListener (MainActivity t, int adType)
			{
				that = t;
                this.adType = adType;
			}

			public void OnClick (View v)
			{
                if (adType == ADTYPE_INTERSTITIAL)
                {
                    that.RequestNewInterstitial();
                } else if (adType == ADTYPE_REWARDED)
                {
                    that.RequestNewRewarded();
                } else if (adType == ADTYPE_INVIEW)
                {
                    that.RequestInview();
                }

            }
		}
	}
}


