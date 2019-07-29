package mono.com.adcolony.sdk;


public class AdColonyCustomMessageListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.adcolony.sdk.AdColonyCustomMessageListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdColonyCustomMessage:(Lcom/adcolony/sdk/AdColonyCustomMessage;)V:GetOnAdColonyCustomMessage_Lcom_adcolony_sdk_AdColonyCustomMessage_Handler:Com.Adcolony.Sdk.IAdColonyCustomMessageListenerInvoker, chocolate_adcolony_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Adcolony.Sdk.IAdColonyCustomMessageListenerImplementor, chocolate_adcolony_adapter", AdColonyCustomMessageListenerImplementor.class, __md_methods);
	}


	public AdColonyCustomMessageListenerImplementor ()
	{
		super ();
		if (getClass () == AdColonyCustomMessageListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Adcolony.Sdk.IAdColonyCustomMessageListenerImplementor, chocolate_adcolony_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onAdColonyCustomMessage (com.adcolony.sdk.AdColonyCustomMessage p0)
	{
		n_onAdColonyCustomMessage (p0);
	}

	private native void n_onAdColonyCustomMessage (com.adcolony.sdk.AdColonyCustomMessage p0);

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
