package mono.com.criteo.receiver;


public class ActionReceiver_OnActionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.criteo.receiver.ActionReceiver.OnActionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onActionData:(Ljava/lang/String;Ljava/lang/String;)V:GetOnActionData_Ljava_lang_String_Ljava_lang_String_Handler:Com.Criteo.Receiver.ActionReceiver/IOnActionListenerInvoker, chocolate_criteo_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Criteo.Receiver.ActionReceiver+IOnActionListenerImplementor, chocolate_criteo_adapter", ActionReceiver_OnActionListenerImplementor.class, __md_methods);
	}


	public ActionReceiver_OnActionListenerImplementor ()
	{
		super ();
		if (getClass () == ActionReceiver_OnActionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Criteo.Receiver.ActionReceiver+IOnActionListenerImplementor, chocolate_criteo_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onActionData (java.lang.String p0, java.lang.String p1)
	{
		n_onActionData (p0, p1);
	}

	private native void n_onActionData (java.lang.String p0, java.lang.String p1);

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
