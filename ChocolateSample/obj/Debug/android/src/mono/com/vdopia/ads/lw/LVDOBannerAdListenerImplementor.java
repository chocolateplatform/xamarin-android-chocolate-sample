package mono.com.vdopia.ads.lw;


public class LVDOBannerAdListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.vdopia.ads.lw.LVDOBannerAdListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBannerAdClicked:(Landroid/view/View;)V:GetOnBannerAdClicked_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.ILVDOBannerAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onBannerAdClosed:(Landroid/view/View;)V:GetOnBannerAdClosed_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.ILVDOBannerAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onBannerAdFailed:(Landroid/view/View;Lcom/vdopia/ads/lw/LVDOConstants$LVDOErrorCode;)V:GetOnBannerAdFailed_Landroid_view_View_Lcom_vdopia_ads_lw_LVDOConstants_LVDOErrorCode_Handler:Com.Vdopia.Ads.LW.ILVDOBannerAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onBannerAdLoaded:(Landroid/view/View;)V:GetOnBannerAdLoaded_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.ILVDOBannerAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"";
		mono.android.Runtime.register ("Com.Vdopia.Ads.LW.ILVDOBannerAdListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", LVDOBannerAdListenerImplementor.class, __md_methods);
	}


	public LVDOBannerAdListenerImplementor ()
	{
		super ();
		if (getClass () == LVDOBannerAdListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Vdopia.Ads.LW.ILVDOBannerAdListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", "", this, new java.lang.Object[] {  });
	}


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
