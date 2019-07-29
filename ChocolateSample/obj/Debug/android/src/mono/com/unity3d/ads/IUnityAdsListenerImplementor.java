package mono.com.unity3d.ads;


public class IUnityAdsListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.unity3d.ads.IUnityAdsListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onUnityAdsError:(Lcom/unity3d/ads/UnityAds$UnityAdsError;Ljava/lang/String;)V:GetOnUnityAdsError_Lcom_unity3d_ads_UnityAds_UnityAdsError_Ljava_lang_String_Handler:Com.Unity3d.Ads.IUnityAdsListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"n_onUnityAdsFinish:(Ljava/lang/String;Lcom/unity3d/ads/UnityAds$FinishState;)V:GetOnUnityAdsFinish_Ljava_lang_String_Lcom_unity3d_ads_UnityAds_FinishState_Handler:Com.Unity3d.Ads.IUnityAdsListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"n_onUnityAdsReady:(Ljava/lang/String;)V:GetOnUnityAdsReady_Ljava_lang_String_Handler:Com.Unity3d.Ads.IUnityAdsListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"n_onUnityAdsStart:(Ljava/lang/String;)V:GetOnUnityAdsStart_Ljava_lang_String_Handler:Com.Unity3d.Ads.IUnityAdsListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Unity3d.Ads.IUnityAdsListenerImplementor, xam.android.chocolate_unityads_adapter", IUnityAdsListenerImplementor.class, __md_methods);
	}


	public IUnityAdsListenerImplementor ()
	{
		super ();
		if (getClass () == IUnityAdsListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Unity3d.Ads.IUnityAdsListenerImplementor, xam.android.chocolate_unityads_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onUnityAdsError (com.unity3d.ads.UnityAds.UnityAdsError p0, java.lang.String p1)
	{
		n_onUnityAdsError (p0, p1);
	}

	private native void n_onUnityAdsError (com.unity3d.ads.UnityAds.UnityAdsError p0, java.lang.String p1);


	public void onUnityAdsFinish (java.lang.String p0, com.unity3d.ads.UnityAds.FinishState p1)
	{
		n_onUnityAdsFinish (p0, p1);
	}

	private native void n_onUnityAdsFinish (java.lang.String p0, com.unity3d.ads.UnityAds.FinishState p1);


	public void onUnityAdsReady (java.lang.String p0)
	{
		n_onUnityAdsReady (p0);
	}

	private native void n_onUnityAdsReady (java.lang.String p0);


	public void onUnityAdsStart (java.lang.String p0)
	{
		n_onUnityAdsStart (p0);
	}

	private native void n_onUnityAdsStart (java.lang.String p0);

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
