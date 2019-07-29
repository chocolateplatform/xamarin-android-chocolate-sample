package mono.com.vdopia.ads.lw;


public class RewardedAdListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.vdopia.ads.lw.RewardedAdListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRewardedVideoCompleted:(Lcom/vdopia/ads/lw/LVDORewardedAd;)V:GetOnRewardedVideoCompleted_Lcom_vdopia_ads_lw_LVDORewardedAd_Handler:Com.Vdopia.Ads.LW.IRewardedAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onRewardedVideoDismissed:(Lcom/vdopia/ads/lw/LVDORewardedAd;)V:GetOnRewardedVideoDismissed_Lcom_vdopia_ads_lw_LVDORewardedAd_Handler:Com.Vdopia.Ads.LW.IRewardedAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onRewardedVideoFailed:(Lcom/vdopia/ads/lw/LVDORewardedAd;Lcom/vdopia/ads/lw/LVDOConstants$LVDOErrorCode;)V:GetOnRewardedVideoFailed_Lcom_vdopia_ads_lw_LVDORewardedAd_Lcom_vdopia_ads_lw_LVDOConstants_LVDOErrorCode_Handler:Com.Vdopia.Ads.LW.IRewardedAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onRewardedVideoLoaded:(Lcom/vdopia/ads/lw/LVDORewardedAd;)V:GetOnRewardedVideoLoaded_Lcom_vdopia_ads_lw_LVDORewardedAd_Handler:Com.Vdopia.Ads.LW.IRewardedAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onRewardedVideoShown:(Lcom/vdopia/ads/lw/LVDORewardedAd;)V:GetOnRewardedVideoShown_Lcom_vdopia_ads_lw_LVDORewardedAd_Handler:Com.Vdopia.Ads.LW.IRewardedAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onRewardedVideoShownError:(Lcom/vdopia/ads/lw/LVDORewardedAd;Lcom/vdopia/ads/lw/LVDOConstants$LVDOErrorCode;)V:GetOnRewardedVideoShownError_Lcom_vdopia_ads_lw_LVDORewardedAd_Lcom_vdopia_ads_lw_LVDOConstants_LVDOErrorCode_Handler:Com.Vdopia.Ads.LW.IRewardedAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"";
		mono.android.Runtime.register ("Com.Vdopia.Ads.LW.IRewardedAdListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", RewardedAdListenerImplementor.class, __md_methods);
	}


	public RewardedAdListenerImplementor ()
	{
		super ();
		if (getClass () == RewardedAdListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Vdopia.Ads.LW.IRewardedAdListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", "", this, new java.lang.Object[] {  });
	}


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
