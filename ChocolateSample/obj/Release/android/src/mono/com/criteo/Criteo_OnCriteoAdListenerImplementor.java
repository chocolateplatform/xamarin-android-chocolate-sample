package mono.com.criteo;


public class Criteo_OnCriteoAdListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.criteo.Criteo.OnCriteoAdListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdClicked:(Lcom/criteo/Criteo$ADType;)V:GetOnAdClicked_Lcom_criteo_Criteo_ADType_Handler:Com.Criteo.Criteo/IOnCriteoAdListenerInvoker, chocolate_criteo_adapter\n" +
			"n_onAdClosed:(Lcom/criteo/Criteo$ADType;)V:GetOnAdClosed_Lcom_criteo_Criteo_ADType_Handler:Com.Criteo.Criteo/IOnCriteoAdListenerInvoker, chocolate_criteo_adapter\n" +
			"n_onAdDisplayNoAd:(Lcom/criteo/Criteo$ADType;)V:GetOnAdDisplayNoAd_Lcom_criteo_Criteo_ADType_Handler:Com.Criteo.Criteo/IOnCriteoAdListenerInvoker, chocolate_criteo_adapter\n" +
			"n_onAdDisplayed:(Lcom/criteo/Criteo$ADType;)V:GetOnAdDisplayed_Lcom_criteo_Criteo_ADType_Handler:Com.Criteo.Criteo/IOnCriteoAdListenerInvoker, chocolate_criteo_adapter\n" +
			"n_onAdFetched:(Lcom/criteo/Criteo$ADType;)V:GetOnAdFetched_Lcom_criteo_Criteo_ADType_Handler:Com.Criteo.Criteo/IOnCriteoAdListenerInvoker, chocolate_criteo_adapter\n" +
			"n_onAdRequest:(Lcom/criteo/Criteo$ADType;)V:GetOnAdRequest_Lcom_criteo_Criteo_ADType_Handler:Com.Criteo.Criteo/IOnCriteoAdListenerInvoker, chocolate_criteo_adapter\n" +
			"n_onAdRequestFailed:(Lcom/criteo/Criteo$ADType;)V:GetOnAdRequestFailed_Lcom_criteo_Criteo_ADType_Handler:Com.Criteo.Criteo/IOnCriteoAdListenerInvoker, chocolate_criteo_adapter\n" +
			"n_onAdRequestFiltered:(Lcom/criteo/Criteo$ADType;)V:GetOnAdRequestFiltered_Lcom_criteo_Criteo_ADType_Handler:Com.Criteo.Criteo/IOnCriteoAdListenerInvoker, chocolate_criteo_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Criteo.Criteo+IOnCriteoAdListenerImplementor, chocolate_criteo_adapter", Criteo_OnCriteoAdListenerImplementor.class, __md_methods);
	}


	public Criteo_OnCriteoAdListenerImplementor ()
	{
		super ();
		if (getClass () == Criteo_OnCriteoAdListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Criteo.Criteo+IOnCriteoAdListenerImplementor, chocolate_criteo_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onAdClicked (com.criteo.Criteo.ADType p0)
	{
		n_onAdClicked (p0);
	}

	private native void n_onAdClicked (com.criteo.Criteo.ADType p0);


	public void onAdClosed (com.criteo.Criteo.ADType p0)
	{
		n_onAdClosed (p0);
	}

	private native void n_onAdClosed (com.criteo.Criteo.ADType p0);


	public void onAdDisplayNoAd (com.criteo.Criteo.ADType p0)
	{
		n_onAdDisplayNoAd (p0);
	}

	private native void n_onAdDisplayNoAd (com.criteo.Criteo.ADType p0);


	public void onAdDisplayed (com.criteo.Criteo.ADType p0)
	{
		n_onAdDisplayed (p0);
	}

	private native void n_onAdDisplayed (com.criteo.Criteo.ADType p0);


	public void onAdFetched (com.criteo.Criteo.ADType p0)
	{
		n_onAdFetched (p0);
	}

	private native void n_onAdFetched (com.criteo.Criteo.ADType p0);


	public void onAdRequest (com.criteo.Criteo.ADType p0)
	{
		n_onAdRequest (p0);
	}

	private native void n_onAdRequest (com.criteo.Criteo.ADType p0);


	public void onAdRequestFailed (com.criteo.Criteo.ADType p0)
	{
		n_onAdRequestFailed (p0);
	}

	private native void n_onAdRequestFailed (com.criteo.Criteo.ADType p0);


	public void onAdRequestFiltered (com.criteo.Criteo.ADType p0)
	{
		n_onAdRequestFiltered (p0);
	}

	private native void n_onAdRequestFiltered (com.criteo.Criteo.ADType p0);

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
