package mono.com.applovin.sdk;


public class AppLovinUserService_OnConsentDialogDismissListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.applovin.sdk.AppLovinUserService.OnConsentDialogDismissListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDismiss:()V:GetOnDismissHandler:Com.Applovin.Sdk.IAppLovinUserServiceOnConsentDialogDismissListenerInvoker, chocolate_applovin_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Applovin.Sdk.IAppLovinUserServiceOnConsentDialogDismissListenerImplementor, chocolate_applovin_adapter", AppLovinUserService_OnConsentDialogDismissListenerImplementor.class, __md_methods);
	}


	public AppLovinUserService_OnConsentDialogDismissListenerImplementor ()
	{
		super ();
		if (getClass () == AppLovinUserService_OnConsentDialogDismissListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Applovin.Sdk.IAppLovinUserServiceOnConsentDialogDismissListenerImplementor, chocolate_applovin_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onDismiss ()
	{
		n_onDismiss ();
	}

	private native void n_onDismiss ();

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
