package md595d0bd5a166ca636c080964d11f9945d;


public class MainActivity
	extends android.support.v7.app.AppCompatActivity
	implements
		mono.android.IGCUserPeer,
		com.vdopia.ads.lw.InitCallback,
		com.vdopia.ads.lw.RewardedAdListener,
		com.vdopia.ads.lw.LVDOBannerAdListener,
		com.vdopia.ads.lw.LVDOInterstitialListener,
		android.content.DialogInterface.OnClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onPause:()V:GetOnPauseHandler\n" +
			"n_onResume:()V:GetOnResumeHandler\n" +
			"n_onDestroy:()V:GetOnDestroyHandler\n" +
			"n_onError:(Ljava/lang/String;)V:GetOnError_Ljava_lang_String_Handler:Com.Vdopia.Ads.LW.IInitCallbackInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onSuccess:()V:GetOnSuccessHandler:Com.Vdopia.Ads.LW.IInitCallbackInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onRewardedVideoCompleted:(Lcom/vdopia/ads/lw/LVDORewardedAd;)V:GetOnRewardedVideoCompleted_Lcom_vdopia_ads_lw_LVDORewardedAd_Handler:Com.Vdopia.Ads.LW.IRewardedAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onRewardedVideoDismissed:(Lcom/vdopia/ads/lw/LVDORewardedAd;)V:GetOnRewardedVideoDismissed_Lcom_vdopia_ads_lw_LVDORewardedAd_Handler:Com.Vdopia.Ads.LW.IRewardedAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onRewardedVideoFailed:(Lcom/vdopia/ads/lw/LVDORewardedAd;Lcom/vdopia/ads/lw/LVDOConstants$LVDOErrorCode;)V:GetOnRewardedVideoFailed_Lcom_vdopia_ads_lw_LVDORewardedAd_Lcom_vdopia_ads_lw_LVDOConstants_LVDOErrorCode_Handler:Com.Vdopia.Ads.LW.IRewardedAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onRewardedVideoLoaded:(Lcom/vdopia/ads/lw/LVDORewardedAd;)V:GetOnRewardedVideoLoaded_Lcom_vdopia_ads_lw_LVDORewardedAd_Handler:Com.Vdopia.Ads.LW.IRewardedAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onRewardedVideoShown:(Lcom/vdopia/ads/lw/LVDORewardedAd;)V:GetOnRewardedVideoShown_Lcom_vdopia_ads_lw_LVDORewardedAd_Handler:Com.Vdopia.Ads.LW.IRewardedAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onRewardedVideoShownError:(Lcom/vdopia/ads/lw/LVDORewardedAd;Lcom/vdopia/ads/lw/LVDOConstants$LVDOErrorCode;)V:GetOnRewardedVideoShownError_Lcom_vdopia_ads_lw_LVDORewardedAd_Lcom_vdopia_ads_lw_LVDOConstants_LVDOErrorCode_Handler:Com.Vdopia.Ads.LW.IRewardedAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onBannerAdClicked:(Landroid/view/View;)V:GetOnBannerAdClicked_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.ILVDOBannerAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onBannerAdClosed:(Landroid/view/View;)V:GetOnBannerAdClosed_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.ILVDOBannerAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onBannerAdFailed:(Landroid/view/View;Lcom/vdopia/ads/lw/LVDOConstants$LVDOErrorCode;)V:GetOnBannerAdFailed_Landroid_view_View_Lcom_vdopia_ads_lw_LVDOConstants_LVDOErrorCode_Handler:Com.Vdopia.Ads.LW.ILVDOBannerAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onBannerAdLoaded:(Landroid/view/View;)V:GetOnBannerAdLoaded_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.ILVDOBannerAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onInterstitialClicked:(Lcom/vdopia/ads/lw/LVDOInterstitialAd;)V:GetOnInterstitialClicked_Lcom_vdopia_ads_lw_LVDOInterstitialAd_Handler:Com.Vdopia.Ads.LW.ILVDOInterstitialListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onInterstitialDismissed:(Lcom/vdopia/ads/lw/LVDOInterstitialAd;)V:GetOnInterstitialDismissed_Lcom_vdopia_ads_lw_LVDOInterstitialAd_Handler:Com.Vdopia.Ads.LW.ILVDOInterstitialListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onInterstitialFailed:(Lcom/vdopia/ads/lw/LVDOInterstitialAd;Lcom/vdopia/ads/lw/LVDOConstants$LVDOErrorCode;)V:GetOnInterstitialFailed_Lcom_vdopia_ads_lw_LVDOInterstitialAd_Lcom_vdopia_ads_lw_LVDOConstants_LVDOErrorCode_Handler:Com.Vdopia.Ads.LW.ILVDOInterstitialListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onInterstitialLoaded:(Lcom/vdopia/ads/lw/LVDOInterstitialAd;)V:GetOnInterstitialLoaded_Lcom_vdopia_ads_lw_LVDOInterstitialAd_Handler:Com.Vdopia.Ads.LW.ILVDOInterstitialListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onInterstitialShown:(Lcom/vdopia/ads/lw/LVDOInterstitialAd;)V:GetOnInterstitialShown_Lcom_vdopia_ads_lw_LVDOInterstitialAd_Handler:Com.Vdopia.Ads.LW.ILVDOInterstitialListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onClick:(Landroid/content/DialogInterface;I)V:GetOnClick_Landroid_content_DialogInterface_IHandler:Android.Content.IDialogInterfaceOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("ChocolateSample.MainActivity, ChocolateSample", MainActivity.class, __md_methods);
	}


	public MainActivity ()
	{
		super ();
		if (getClass () == MainActivity.class)
			mono.android.TypeManager.Activate ("ChocolateSample.MainActivity, ChocolateSample", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onPause ()
	{
		n_onPause ();
	}

	private native void n_onPause ();


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();


	public void onDestroy ()
	{
		n_onDestroy ();
	}

	private native void n_onDestroy ();


	public void onError (java.lang.String p0)
	{
		n_onError (p0);
	}

	private native void n_onError (java.lang.String p0);


	public void onSuccess ()
	{
		n_onSuccess ();
	}

	private native void n_onSuccess ();


	public void onRewardedVideoCompleted (com.vdopia.ads.lw.LVDORewardedAd p0)
	{
		n_onRewardedVideoCompleted (p0);
	}

	private native void n_onRewardedVideoCompleted (com.vdopia.ads.lw.LVDORewardedAd p0);


	public void onRewardedVideoDismissed (com.vdopia.ads.lw.LVDORewardedAd p0)
	{
		n_onRewardedVideoDismissed (p0);
	}

	private native void n_onRewardedVideoDismissed (com.vdopia.ads.lw.LVDORewardedAd p0);


	public void onRewardedVideoFailed (com.vdopia.ads.lw.LVDORewardedAd p0, com.vdopia.ads.lw.LVDOConstants.LVDOErrorCode p1)
	{
		n_onRewardedVideoFailed (p0, p1);
	}

	private native void n_onRewardedVideoFailed (com.vdopia.ads.lw.LVDORewardedAd p0, com.vdopia.ads.lw.LVDOConstants.LVDOErrorCode p1);


	public void onRewardedVideoLoaded (com.vdopia.ads.lw.LVDORewardedAd p0)
	{
		n_onRewardedVideoLoaded (p0);
	}

	private native void n_onRewardedVideoLoaded (com.vdopia.ads.lw.LVDORewardedAd p0);


	public void onRewardedVideoShown (com.vdopia.ads.lw.LVDORewardedAd p0)
	{
		n_onRewardedVideoShown (p0);
	}

	private native void n_onRewardedVideoShown (com.vdopia.ads.lw.LVDORewardedAd p0);


	public void onRewardedVideoShownError (com.vdopia.ads.lw.LVDORewardedAd p0, com.vdopia.ads.lw.LVDOConstants.LVDOErrorCode p1)
	{
		n_onRewardedVideoShownError (p0, p1);
	}

	private native void n_onRewardedVideoShownError (com.vdopia.ads.lw.LVDORewardedAd p0, com.vdopia.ads.lw.LVDOConstants.LVDOErrorCode p1);


	public void onBannerAdClicked (android.view.View p0)
	{
		n_onBannerAdClicked (p0);
	}

	private native void n_onBannerAdClicked (android.view.View p0);


	public void onBannerAdClosed (android.view.View p0)
	{
		n_onBannerAdClosed (p0);
	}

	private native void n_onBannerAdClosed (android.view.View p0);


	public void onBannerAdFailed (android.view.View p0, com.vdopia.ads.lw.LVDOConstants.LVDOErrorCode p1)
	{
		n_onBannerAdFailed (p0, p1);
	}

	private native void n_onBannerAdFailed (android.view.View p0, com.vdopia.ads.lw.LVDOConstants.LVDOErrorCode p1);


	public void onBannerAdLoaded (android.view.View p0)
	{
		n_onBannerAdLoaded (p0);
	}

	private native void n_onBannerAdLoaded (android.view.View p0);


	public void onInterstitialClicked (com.vdopia.ads.lw.LVDOInterstitialAd p0)
	{
		n_onInterstitialClicked (p0);
	}

	private native void n_onInterstitialClicked (com.vdopia.ads.lw.LVDOInterstitialAd p0);


	public void onInterstitialDismissed (com.vdopia.ads.lw.LVDOInterstitialAd p0)
	{
		n_onInterstitialDismissed (p0);
	}

	private native void n_onInterstitialDismissed (com.vdopia.ads.lw.LVDOInterstitialAd p0);


	public void onInterstitialFailed (com.vdopia.ads.lw.LVDOInterstitialAd p0, com.vdopia.ads.lw.LVDOConstants.LVDOErrorCode p1)
	{
		n_onInterstitialFailed (p0, p1);
	}

	private native void n_onInterstitialFailed (com.vdopia.ads.lw.LVDOInterstitialAd p0, com.vdopia.ads.lw.LVDOConstants.LVDOErrorCode p1);


	public void onInterstitialLoaded (com.vdopia.ads.lw.LVDOInterstitialAd p0)
	{
		n_onInterstitialLoaded (p0);
	}

	private native void n_onInterstitialLoaded (com.vdopia.ads.lw.LVDOInterstitialAd p0);


	public void onInterstitialShown (com.vdopia.ads.lw.LVDOInterstitialAd p0)
	{
		n_onInterstitialShown (p0);
	}

	private native void n_onInterstitialShown (com.vdopia.ads.lw.LVDOInterstitialAd p0);


	public void onClick (android.content.DialogInterface p0, int p1)
	{
		n_onClick (p0, p1);
	}

	private native void n_onClick (android.content.DialogInterface p0, int p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
