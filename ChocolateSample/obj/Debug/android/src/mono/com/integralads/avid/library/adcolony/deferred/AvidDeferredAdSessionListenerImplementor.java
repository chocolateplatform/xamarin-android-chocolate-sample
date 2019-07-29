package mono.com.integralads.avid.library.adcolony.deferred;


public class AvidDeferredAdSessionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.integralads.avid.library.adcolony.deferred.AvidDeferredAdSessionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_recordReadyEvent:()V:GetRecordReadyEventHandler:Com.Integralads.Avid.Library.Adcolony.Deferred.IAvidDeferredAdSessionListenerInvoker, chocolate_adcolony_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Integralads.Avid.Library.Adcolony.Deferred.IAvidDeferredAdSessionListenerImplementor, chocolate_adcolony_adapter", AvidDeferredAdSessionListenerImplementor.class, __md_methods);
	}


	public AvidDeferredAdSessionListenerImplementor ()
	{
		super ();
		if (getClass () == AvidDeferredAdSessionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Integralads.Avid.Library.Adcolony.Deferred.IAvidDeferredAdSessionListenerImplementor, chocolate_adcolony_adapter", "", this, new java.lang.Object[] {  });
	}


	public void recordReadyEvent ()
	{
		n_recordReadyEvent ();
	}

	private native void n_recordReadyEvent ();

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
