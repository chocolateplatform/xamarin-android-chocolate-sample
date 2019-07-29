package mono.com.vdopia.ads.lw;


public class MediationInterstitialListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.vdopia.ads.lw.MediationInterstitialListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInterstitialClicked:(Lcom/vdopia/ads/lw/Mediator;Ljava/lang/Object;)V:GetOnInterstitialClicked_Lcom_vdopia_ads_lw_Mediator_Ljava_lang_Object_Handler:Com.Vdopia.Ads.LW.IMediationInterstitialListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onInterstitialDismissed:(Lcom/vdopia/ads/lw/Mediator;Ljava/lang/Object;)V:GetOnInterstitialDismissed_Lcom_vdopia_ads_lw_Mediator_Ljava_lang_Object_Handler:Com.Vdopia.Ads.LW.IMediationInterstitialListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onInterstitialFailed:(Lcom/vdopia/ads/lw/Mediator;Ljava/lang/Object;Lcom/vdopia/ads/lw/LVDOConstants$LVDOErrorCode;)V:GetOnInterstitialFailed_Lcom_vdopia_ads_lw_Mediator_Ljava_lang_Object_Lcom_vdopia_ads_lw_LVDOConstants_LVDOErrorCode_Handler:Com.Vdopia.Ads.LW.IMediationInterstitialListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onInterstitialLoaded:(Lcom/vdopia/ads/lw/Mediator;Ljava/lang/Object;)V:GetOnInterstitialLoaded_Lcom_vdopia_ads_lw_Mediator_Ljava_lang_Object_Handler:Com.Vdopia.Ads.LW.IMediationInterstitialListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onInterstitialShown:(Lcom/vdopia/ads/lw/Mediator;Ljava/lang/Object;)V:GetOnInterstitialShown_Lcom_vdopia_ads_lw_Mediator_Ljava_lang_Object_Handler:Com.Vdopia.Ads.LW.IMediationInterstitialListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"";
		mono.android.Runtime.register ("Com.Vdopia.Ads.LW.IMediationInterstitialListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", MediationInterstitialListenerImplementor.class, __md_methods);
	}


	public MediationInterstitialListenerImplementor ()
	{
		super ();
		if (getClass () == MediationInterstitialListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Vdopia.Ads.LW.IMediationInterstitialListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", "", this, new java.lang.Object[] {  });
	}


	public void onInterstitialClicked (com.vdopia.ads.lw.Mediator p0, java.lang.Object p1)
	{
		n_onInterstitialClicked (p0, p1);
	}

	private native void n_onInterstitialClicked (com.vdopia.ads.lw.Mediator p0, java.lang.Object p1);


	public void onInterstitialDismissed (com.vdopia.ads.lw.Mediator p0, java.lang.Object p1)
	{
		n_onInterstitialDismissed (p0, p1);
	}

	private native void n_onInterstitialDismissed (com.vdopia.ads.lw.Mediator p0, java.lang.Object p1);


	public void onInterstitialFailed (com.vdopia.ads.lw.Mediator p0, java.lang.Object p1, com.vdopia.ads.lw.LVDOConstants.LVDOErrorCode p2)
	{
		n_onInterstitialFailed (p0, p1, p2);
	}

	private native void n_onInterstitialFailed (com.vdopia.ads.lw.Mediator p0, java.lang.Object p1, com.vdopia.ads.lw.LVDOConstants.LVDOErrorCode p2);


	public void onInterstitialLoaded (com.vdopia.ads.lw.Mediator p0, java.lang.Object p1)
	{
		n_onInterstitialLoaded (p0, p1);
	}

	private native void n_onInterstitialLoaded (com.vdopia.ads.lw.Mediator p0, java.lang.Object p1);


	public void onInterstitialShown (com.vdopia.ads.lw.Mediator p0, java.lang.Object p1)
	{
		n_onInterstitialShown (p0, p1);
	}

	private native void n_onInterstitialShown (com.vdopia.ads.lw.Mediator p0, java.lang.Object p1);

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
