package mono.com.integralads.avid.library.adcolony.session.internal.jsbridge;


public class AvidBridgeManager_AvidBridgeManagerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.integralads.avid.library.adcolony.session.internal.jsbridge.AvidBridgeManager.AvidBridgeManagerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_avidBridgeManagerDidInjectAvidJs:()V:GetAvidBridgeManagerDidInjectAvidJsHandler:Com.Integralads.Avid.Library.Adcolony.Session.Internal.Jsbridge.AvidBridgeManager/IAvidBridgeManagerListenerInvoker, chocolate_adcolony_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Integralads.Avid.Library.Adcolony.Session.Internal.Jsbridge.AvidBridgeManager+IAvidBridgeManagerListenerImplementor, chocolate_adcolony_adapter", AvidBridgeManager_AvidBridgeManagerListenerImplementor.class, __md_methods);
	}


	public AvidBridgeManager_AvidBridgeManagerListenerImplementor ()
	{
		super ();
		if (getClass () == AvidBridgeManager_AvidBridgeManagerListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Integralads.Avid.Library.Adcolony.Session.Internal.Jsbridge.AvidBridgeManager+IAvidBridgeManagerListenerImplementor, chocolate_adcolony_adapter", "", this, new java.lang.Object[] {  });
	}


	public void avidBridgeManagerDidInjectAvidJs ()
	{
		n_avidBridgeManagerDidInjectAvidJs ();
	}

	private native void n_avidBridgeManagerDidInjectAvidJs ();

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
