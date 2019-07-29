package mono.com.unity3d.services.monetization.placementcontent.ads;


public class IShowAdListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.unity3d.services.monetization.placementcontent.ads.IShowAdListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdFinished:(Ljava/lang/String;Lcom/unity3d/ads/UnityAds$FinishState;)V:GetOnAdFinished_Ljava_lang_String_Lcom_unity3d_ads_UnityAds_FinishState_Handler:Com.Unity3d.Services.Monetization.Placementcontent.Ads.IShowAdListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"n_onAdStarted:(Ljava/lang/String;)V:GetOnAdStarted_Ljava_lang_String_Handler:Com.Unity3d.Services.Monetization.Placementcontent.Ads.IShowAdListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Unity3d.Services.Monetization.Placementcontent.Ads.IShowAdListenerImplementor, xam.android.chocolate_unityads_adapter", IShowAdListenerImplementor.class, __md_methods);
	}


	public IShowAdListenerImplementor ()
	{
		super ();
		if (getClass () == IShowAdListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Unity3d.Services.Monetization.Placementcontent.Ads.IShowAdListenerImplementor, xam.android.chocolate_unityads_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onAdFinished (java.lang.String p0, com.unity3d.ads.UnityAds.FinishState p1)
	{
		n_onAdFinished (p0, p1);
	}

	private native void n_onAdFinished (java.lang.String p0, com.unity3d.ads.UnityAds.FinishState p1);


	public void onAdStarted (java.lang.String p0)
	{
		n_onAdStarted (p0);
	}

	private native void n_onAdStarted (java.lang.String p0);

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
