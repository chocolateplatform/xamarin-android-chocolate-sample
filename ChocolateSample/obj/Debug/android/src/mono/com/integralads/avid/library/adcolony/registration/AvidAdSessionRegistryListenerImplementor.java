package mono.com.integralads.avid.library.adcolony.registration;


public class AvidAdSessionRegistryListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.integralads.avid.library.adcolony.registration.AvidAdSessionRegistryListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_registryHasActiveSessionsChanged:(Lcom/integralads/avid/library/adcolony/registration/AvidAdSessionRegistry;)V:GetRegistryHasActiveSessionsChanged_Lcom_integralads_avid_library_adcolony_registration_AvidAdSessionRegistry_Handler:Com.Integralads.Avid.Library.Adcolony.Registration.IAvidAdSessionRegistryListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_registryHasSessionsChanged:(Lcom/integralads/avid/library/adcolony/registration/AvidAdSessionRegistry;)V:GetRegistryHasSessionsChanged_Lcom_integralads_avid_library_adcolony_registration_AvidAdSessionRegistry_Handler:Com.Integralads.Avid.Library.Adcolony.Registration.IAvidAdSessionRegistryListenerInvoker, chocolate_adcolony_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Integralads.Avid.Library.Adcolony.Registration.IAvidAdSessionRegistryListenerImplementor, chocolate_adcolony_adapter", AvidAdSessionRegistryListenerImplementor.class, __md_methods);
	}


	public AvidAdSessionRegistryListenerImplementor ()
	{
		super ();
		if (getClass () == AvidAdSessionRegistryListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Integralads.Avid.Library.Adcolony.Registration.IAvidAdSessionRegistryListenerImplementor, chocolate_adcolony_adapter", "", this, new java.lang.Object[] {  });
	}


	public void registryHasActiveSessionsChanged (com.integralads.avid.library.adcolony.registration.AvidAdSessionRegistry p0)
	{
		n_registryHasActiveSessionsChanged (p0);
	}

	private native void n_registryHasActiveSessionsChanged (com.integralads.avid.library.adcolony.registration.AvidAdSessionRegistry p0);


	public void registryHasSessionsChanged (com.integralads.avid.library.adcolony.registration.AvidAdSessionRegistry p0)
	{
		n_registryHasSessionsChanged (p0);
	}

	private native void n_registryHasSessionsChanged (com.integralads.avid.library.adcolony.registration.AvidAdSessionRegistry p0);

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
