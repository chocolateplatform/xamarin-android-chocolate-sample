package mono.com.vdopia.ads.lw;


public class MediationBannerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.vdopia.ads.lw.MediationBannerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBannerAdClicked:(Lcom/vdopia/ads/lw/Mediator;Landroid/view/View;)V:GetOnBannerAdClicked_Lcom_vdopia_ads_lw_Mediator_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.IMediationBannerListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onBannerAdClosed:(Lcom/vdopia/ads/lw/Mediator;Landroid/view/View;)V:GetOnBannerAdClosed_Lcom_vdopia_ads_lw_Mediator_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.IMediationBannerListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onBannerAdFailed:(Lcom/vdopia/ads/lw/Mediator;Landroid/view/View;Lcom/vdopia/ads/lw/LVDOConstants$LVDOErrorCode;)V:GetOnBannerAdFailed_Lcom_vdopia_ads_lw_Mediator_Landroid_view_View_Lcom_vdopia_ads_lw_LVDOConstants_LVDOErrorCode_Handler:Com.Vdopia.Ads.LW.IMediationBannerListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onBannerAdLoaded:(Lcom/vdopia/ads/lw/Mediator;Landroid/view/View;)V:GetOnBannerAdLoaded_Lcom_vdopia_ads_lw_Mediator_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.IMediationBannerListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"";
		mono.android.Runtime.register ("Com.Vdopia.Ads.LW.IMediationBannerListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", MediationBannerListenerImplementor.class, __md_methods);
	}


	public MediationBannerListenerImplementor ()
	{
		super ();
		if (getClass () == MediationBannerListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Vdopia.Ads.LW.IMediationBannerListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", "", this, new java.lang.Object[] {  });
	}


	public void onBannerAdClicked (com.vdopia.ads.lw.Mediator p0, android.view.View p1)
	{
		n_onBannerAdClicked (p0, p1);
	}

	private native void n_onBannerAdClicked (com.vdopia.ads.lw.Mediator p0, android.view.View p1);


	public void onBannerAdClosed (com.vdopia.ads.lw.Mediator p0, android.view.View p1)
	{
		n_onBannerAdClosed (p0, p1);
	}

	private native void n_onBannerAdClosed (com.vdopia.ads.lw.Mediator p0, android.view.View p1);


	public void onBannerAdFailed (com.vdopia.ads.lw.Mediator p0, android.view.View p1, com.vdopia.ads.lw.LVDOConstants.LVDOErrorCode p2)
	{
		n_onBannerAdFailed (p0, p1, p2);
	}

	private native void n_onBannerAdFailed (com.vdopia.ads.lw.Mediator p0, android.view.View p1, com.vdopia.ads.lw.LVDOConstants.LVDOErrorCode p2);


	public void onBannerAdLoaded (com.vdopia.ads.lw.Mediator p0, android.view.View p1)
	{
		n_onBannerAdLoaded (p0, p1);
	}

	private native void n_onBannerAdLoaded (com.vdopia.ads.lw.Mediator p0, android.view.View p1);

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
