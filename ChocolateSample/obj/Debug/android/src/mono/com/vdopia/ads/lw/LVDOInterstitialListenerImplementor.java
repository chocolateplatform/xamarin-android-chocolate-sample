package mono.com.vdopia.ads.lw;


public class LVDOInterstitialListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.vdopia.ads.lw.LVDOInterstitialListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInterstitialClicked:(Lcom/vdopia/ads/lw/LVDOInterstitialAd;)V:GetOnInterstitialClicked_Lcom_vdopia_ads_lw_LVDOInterstitialAd_Handler:Com.Vdopia.Ads.LW.ILVDOInterstitialListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onInterstitialDismissed:(Lcom/vdopia/ads/lw/LVDOInterstitialAd;)V:GetOnInterstitialDismissed_Lcom_vdopia_ads_lw_LVDOInterstitialAd_Handler:Com.Vdopia.Ads.LW.ILVDOInterstitialListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onInterstitialFailed:(Lcom/vdopia/ads/lw/LVDOInterstitialAd;Lcom/vdopia/ads/lw/LVDOConstants$LVDOErrorCode;)V:GetOnInterstitialFailed_Lcom_vdopia_ads_lw_LVDOInterstitialAd_Lcom_vdopia_ads_lw_LVDOConstants_LVDOErrorCode_Handler:Com.Vdopia.Ads.LW.ILVDOInterstitialListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onInterstitialLoaded:(Lcom/vdopia/ads/lw/LVDOInterstitialAd;)V:GetOnInterstitialLoaded_Lcom_vdopia_ads_lw_LVDOInterstitialAd_Handler:Com.Vdopia.Ads.LW.ILVDOInterstitialListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onInterstitialShown:(Lcom/vdopia/ads/lw/LVDOInterstitialAd;)V:GetOnInterstitialShown_Lcom_vdopia_ads_lw_LVDOInterstitialAd_Handler:Com.Vdopia.Ads.LW.ILVDOInterstitialListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"";
		mono.android.Runtime.register ("Com.Vdopia.Ads.LW.ILVDOInterstitialListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", LVDOInterstitialListenerImplementor.class, __md_methods);
	}


	public LVDOInterstitialListenerImplementor ()
	{
		super ();
		if (getClass () == LVDOInterstitialListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Vdopia.Ads.LW.ILVDOInterstitialListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", "", this, new java.lang.Object[] {  });
	}


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
