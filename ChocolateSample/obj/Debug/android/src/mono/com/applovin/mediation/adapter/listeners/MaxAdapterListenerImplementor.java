package mono.com.applovin.mediation.adapter.listeners;


public class MaxAdapterListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.applovin.mediation.adapter.listeners.MaxAdapterListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Com.Applovin.Mediation.Adapter.Listeners.IMaxAdapterListenerImplementor, chocolate_applovin_adapter", MaxAdapterListenerImplementor.class, __md_methods);
	}


	public MaxAdapterListenerImplementor ()
	{
		super ();
		if (getClass () == MaxAdapterListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Applovin.Mediation.Adapter.Listeners.IMaxAdapterListenerImplementor, chocolate_applovin_adapter", "", this, new java.lang.Object[] {  });
	}

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
