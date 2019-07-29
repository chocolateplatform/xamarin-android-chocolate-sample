package mono.com.applovin.nativeAds;


public class AppLovinNativeAdLoadListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.applovin.nativeAds.AppLovinNativeAdLoadListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onNativeAdsFailedToLoad:(I)V:GetOnNativeAdsFailedToLoad_IHandler:Com.Applovin.NativeAds.IAppLovinNativeAdLoadListenerInvoker, chocolate_applovin_adapter\n" +
			"n_onNativeAdsLoaded:(Ljava/util/List;)V:GetOnNativeAdsLoaded_Ljava_util_List_Handler:Com.Applovin.NativeAds.IAppLovinNativeAdLoadListenerInvoker, chocolate_applovin_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Applovin.NativeAds.IAppLovinNativeAdLoadListenerImplementor, chocolate_applovin_adapter", AppLovinNativeAdLoadListenerImplementor.class, __md_methods);
	}


	public AppLovinNativeAdLoadListenerImplementor ()
	{
		super ();
		if (getClass () == AppLovinNativeAdLoadListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Applovin.NativeAds.IAppLovinNativeAdLoadListenerImplementor, chocolate_applovin_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onNativeAdsFailedToLoad (int p0)
	{
		n_onNativeAdsFailedToLoad (p0);
	}

	private native void n_onNativeAdsFailedToLoad (int p0);


	public void onNativeAdsLoaded (java.util.List p0)
	{
		n_onNativeAdsLoaded (p0);
	}

	private native void n_onNativeAdsLoaded (java.util.List p0);

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
