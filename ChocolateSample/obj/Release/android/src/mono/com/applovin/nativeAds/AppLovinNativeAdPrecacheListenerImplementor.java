package mono.com.applovin.nativeAds;


public class AppLovinNativeAdPrecacheListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.applovin.nativeAds.AppLovinNativeAdPrecacheListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onNativeAdImagePrecachingFailed:(Lcom/applovin/nativeAds/AppLovinNativeAd;I)V:GetOnNativeAdImagePrecachingFailed_Lcom_applovin_nativeAds_AppLovinNativeAd_IHandler:Com.Applovin.NativeAds.IAppLovinNativeAdPrecacheListenerInvoker, chocolate_applovin_adapter\n" +
			"n_onNativeAdImagesPrecached:(Lcom/applovin/nativeAds/AppLovinNativeAd;)V:GetOnNativeAdImagesPrecached_Lcom_applovin_nativeAds_AppLovinNativeAd_Handler:Com.Applovin.NativeAds.IAppLovinNativeAdPrecacheListenerInvoker, chocolate_applovin_adapter\n" +
			"n_onNativeAdVideoPrecachingFailed:(Lcom/applovin/nativeAds/AppLovinNativeAd;I)V:GetOnNativeAdVideoPrecachingFailed_Lcom_applovin_nativeAds_AppLovinNativeAd_IHandler:Com.Applovin.NativeAds.IAppLovinNativeAdPrecacheListenerInvoker, chocolate_applovin_adapter\n" +
			"n_onNativeAdVideoPreceached:(Lcom/applovin/nativeAds/AppLovinNativeAd;)V:GetOnNativeAdVideoPreceached_Lcom_applovin_nativeAds_AppLovinNativeAd_Handler:Com.Applovin.NativeAds.IAppLovinNativeAdPrecacheListenerInvoker, chocolate_applovin_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Applovin.NativeAds.IAppLovinNativeAdPrecacheListenerImplementor, chocolate_applovin_adapter", AppLovinNativeAdPrecacheListenerImplementor.class, __md_methods);
	}


	public AppLovinNativeAdPrecacheListenerImplementor ()
	{
		super ();
		if (getClass () == AppLovinNativeAdPrecacheListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Applovin.NativeAds.IAppLovinNativeAdPrecacheListenerImplementor, chocolate_applovin_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onNativeAdImagePrecachingFailed (com.applovin.nativeAds.AppLovinNativeAd p0, int p1)
	{
		n_onNativeAdImagePrecachingFailed (p0, p1);
	}

	private native void n_onNativeAdImagePrecachingFailed (com.applovin.nativeAds.AppLovinNativeAd p0, int p1);


	public void onNativeAdImagesPrecached (com.applovin.nativeAds.AppLovinNativeAd p0)
	{
		n_onNativeAdImagesPrecached (p0);
	}

	private native void n_onNativeAdImagesPrecached (com.applovin.nativeAds.AppLovinNativeAd p0);


	public void onNativeAdVideoPrecachingFailed (com.applovin.nativeAds.AppLovinNativeAd p0, int p1)
	{
		n_onNativeAdVideoPrecachingFailed (p0, p1);
	}

	private native void n_onNativeAdVideoPrecachingFailed (com.applovin.nativeAds.AppLovinNativeAd p0, int p1);


	public void onNativeAdVideoPreceached (com.applovin.nativeAds.AppLovinNativeAd p0)
	{
		n_onNativeAdVideoPreceached (p0);
	}

	private native void n_onNativeAdVideoPreceached (com.applovin.nativeAds.AppLovinNativeAd p0);

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
