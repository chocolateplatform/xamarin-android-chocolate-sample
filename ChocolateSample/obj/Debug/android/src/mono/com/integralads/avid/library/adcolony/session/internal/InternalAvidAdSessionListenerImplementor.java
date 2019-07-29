package mono.com.integralads.avid.library.adcolony.session.internal;


public class InternalAvidAdSessionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.integralads.avid.library.adcolony.session.internal.InternalAvidAdSessionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_sessionDidEnd:(Lcom/integralads/avid/library/adcolony/session/internal/InternalAvidAdSession;)V:GetSessionDidEnd_Lcom_integralads_avid_library_adcolony_session_internal_InternalAvidAdSession_Handler:Com.Integralads.Avid.Library.Adcolony.Session.Internal.IInternalAvidAdSessionListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_sessionHasBecomeActive:(Lcom/integralads/avid/library/adcolony/session/internal/InternalAvidAdSession;)V:GetSessionHasBecomeActive_Lcom_integralads_avid_library_adcolony_session_internal_InternalAvidAdSession_Handler:Com.Integralads.Avid.Library.Adcolony.Session.Internal.IInternalAvidAdSessionListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_sessionHasResignedActive:(Lcom/integralads/avid/library/adcolony/session/internal/InternalAvidAdSession;)V:GetSessionHasResignedActive_Lcom_integralads_avid_library_adcolony_session_internal_InternalAvidAdSession_Handler:Com.Integralads.Avid.Library.Adcolony.Session.Internal.IInternalAvidAdSessionListenerInvoker, chocolate_adcolony_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Integralads.Avid.Library.Adcolony.Session.Internal.IInternalAvidAdSessionListenerImplementor, chocolate_adcolony_adapter", InternalAvidAdSessionListenerImplementor.class, __md_methods);
	}


	public InternalAvidAdSessionListenerImplementor ()
	{
		super ();
		if (getClass () == InternalAvidAdSessionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Integralads.Avid.Library.Adcolony.Session.Internal.IInternalAvidAdSessionListenerImplementor, chocolate_adcolony_adapter", "", this, new java.lang.Object[] {  });
	}


	public void sessionDidEnd (com.integralads.avid.library.adcolony.session.internal.InternalAvidAdSession p0)
	{
		n_sessionDidEnd (p0);
	}

	private native void n_sessionDidEnd (com.integralads.avid.library.adcolony.session.internal.InternalAvidAdSession p0);


	public void sessionHasBecomeActive (com.integralads.avid.library.adcolony.session.internal.InternalAvidAdSession p0)
	{
		n_sessionHasBecomeActive (p0);
	}

	private native void n_sessionHasBecomeActive (com.integralads.avid.library.adcolony.session.internal.InternalAvidAdSession p0);


	public void sessionHasResignedActive (com.integralads.avid.library.adcolony.session.internal.InternalAvidAdSession p0)
	{
		n_sessionHasResignedActive (p0);
	}

	private native void n_sessionHasResignedActive (com.integralads.avid.library.adcolony.session.internal.InternalAvidAdSession p0);

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
