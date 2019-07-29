package mono.com.amazon.device.ads;


public class AdListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.amazon.device.ads.AdListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdCollapsed:(Lcom/amazon/device/ads/Ad;)V:GetOnAdCollapsed_Lcom_amazon_device_ads_Ad_Handler:Com.Amazon.Device.Ads.IAdListenerInvoker, chocolate_amazon_adapter\n" +
			"n_onAdDismissed:(Lcom/amazon/device/ads/Ad;)V:GetOnAdDismissed_Lcom_amazon_device_ads_Ad_Handler:Com.Amazon.Device.Ads.IAdListenerInvoker, chocolate_amazon_adapter\n" +
			"n_onAdExpanded:(Lcom/amazon/device/ads/Ad;)V:GetOnAdExpanded_Lcom_amazon_device_ads_Ad_Handler:Com.Amazon.Device.Ads.IAdListenerInvoker, chocolate_amazon_adapter\n" +
			"n_onAdFailedToLoad:(Lcom/amazon/device/ads/Ad;Lcom/amazon/device/ads/AdError;)V:GetOnAdFailedToLoad_Lcom_amazon_device_ads_Ad_Lcom_amazon_device_ads_AdError_Handler:Com.Amazon.Device.Ads.IAdListenerInvoker, chocolate_amazon_adapter\n" +
			"n_onAdLoaded:(Lcom/amazon/device/ads/Ad;Lcom/amazon/device/ads/AdProperties;)V:GetOnAdLoaded_Lcom_amazon_device_ads_Ad_Lcom_amazon_device_ads_AdProperties_Handler:Com.Amazon.Device.Ads.IAdListenerInvoker, chocolate_amazon_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Amazon.Device.Ads.IAdListenerImplementor, chocolate_amazon_adapter", AdListenerImplementor.class, __md_methods);
	}


	public AdListenerImplementor ()
	{
		super ();
		if (getClass () == AdListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Amazon.Device.Ads.IAdListenerImplementor, chocolate_amazon_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onAdCollapsed (com.amazon.device.ads.Ad p0)
	{
		n_onAdCollapsed (p0);
	}

	private native void n_onAdCollapsed (com.amazon.device.ads.Ad p0);


	public void onAdDismissed (com.amazon.device.ads.Ad p0)
	{
		n_onAdDismissed (p0);
	}

	private native void n_onAdDismissed (com.amazon.device.ads.Ad p0);


	public void onAdExpanded (com.amazon.device.ads.Ad p0)
	{
		n_onAdExpanded (p0);
	}

	private native void n_onAdExpanded (com.amazon.device.ads.Ad p0);


	public void onAdFailedToLoad (com.amazon.device.ads.Ad p0, com.amazon.device.ads.AdError p1)
	{
		n_onAdFailedToLoad (p0, p1);
	}

	private native void n_onAdFailedToLoad (com.amazon.device.ads.Ad p0, com.amazon.device.ads.AdError p1);


	public void onAdLoaded (com.amazon.device.ads.Ad p0, com.amazon.device.ads.AdProperties p1)
	{
		n_onAdLoaded (p0, p1);
	}

	private native void n_onAdLoaded (com.amazon.device.ads.Ad p0, com.amazon.device.ads.AdProperties p1);

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
