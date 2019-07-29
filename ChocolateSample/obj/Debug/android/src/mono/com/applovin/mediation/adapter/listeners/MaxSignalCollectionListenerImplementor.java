package mono.com.applovin.mediation.adapter.listeners;


public class MaxSignalCollectionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSignalCollected:(Ljava/lang/String;)V:GetOnSignalCollected_Ljava_lang_String_Handler:Com.Applovin.Mediation.Adapter.Listeners.IMaxSignalCollectionListenerInvoker, chocolate_applovin_adapter\n" +
			"n_onSignalCollectionFailed:(Ljava/lang/String;)V:GetOnSignalCollectionFailed_Ljava_lang_String_Handler:Com.Applovin.Mediation.Adapter.Listeners.IMaxSignalCollectionListenerInvoker, chocolate_applovin_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Applovin.Mediation.Adapter.Listeners.IMaxSignalCollectionListenerImplementor, chocolate_applovin_adapter", MaxSignalCollectionListenerImplementor.class, __md_methods);
	}


	public MaxSignalCollectionListenerImplementor ()
	{
		super ();
		if (getClass () == MaxSignalCollectionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Applovin.Mediation.Adapter.Listeners.IMaxSignalCollectionListenerImplementor, chocolate_applovin_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onSignalCollected (java.lang.String p0)
	{
		n_onSignalCollected (p0);
	}

	private native void n_onSignalCollected (java.lang.String p0);


	public void onSignalCollectionFailed (java.lang.String p0)
	{
		n_onSignalCollectionFailed (p0);
	}

	private native void n_onSignalCollectionFailed (java.lang.String p0);

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
