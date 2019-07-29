package mono.com.applovin.sdk;


public class AppLovinPostbackListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.applovin.sdk.AppLovinPostbackListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPostbackFailure:(Ljava/lang/String;I)V:GetOnPostbackFailure_Ljava_lang_String_IHandler:Com.Applovin.Sdk.IAppLovinPostbackListenerInvoker, chocolate_applovin_adapter\n" +
			"n_onPostbackSuccess:(Ljava/lang/String;)V:GetOnPostbackSuccess_Ljava_lang_String_Handler:Com.Applovin.Sdk.IAppLovinPostbackListenerInvoker, chocolate_applovin_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Applovin.Sdk.IAppLovinPostbackListenerImplementor, chocolate_applovin_adapter", AppLovinPostbackListenerImplementor.class, __md_methods);
	}


	public AppLovinPostbackListenerImplementor ()
	{
		super ();
		if (getClass () == AppLovinPostbackListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Applovin.Sdk.IAppLovinPostbackListenerImplementor, chocolate_applovin_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onPostbackFailure (java.lang.String p0, int p1)
	{
		n_onPostbackFailure (p0, p1);
	}

	private native void n_onPostbackFailure (java.lang.String p0, int p1);


	public void onPostbackSuccess (java.lang.String p0)
	{
		n_onPostbackSuccess (p0);
	}

	private native void n_onPostbackSuccess (java.lang.String p0);

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
