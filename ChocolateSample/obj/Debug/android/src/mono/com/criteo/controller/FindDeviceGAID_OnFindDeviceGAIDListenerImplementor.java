package mono.com.criteo.controller;


public class FindDeviceGAID_OnFindDeviceGAIDListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.criteo.controller.FindDeviceGAID.OnFindDeviceGAIDListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFindDeviceGAIDFailed:()V:GetOnFindDeviceGAIDFailedHandler:Com.Criteo.Controller.FindDeviceGAID/IOnFindDeviceGAIDListenerInvoker, chocolate_criteo_adapter\n" +
			"n_onFindDeviceGAIDSuccess:(Ljava/lang/String;)V:GetOnFindDeviceGAIDSuccess_Ljava_lang_String_Handler:Com.Criteo.Controller.FindDeviceGAID/IOnFindDeviceGAIDListenerInvoker, chocolate_criteo_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Criteo.Controller.FindDeviceGAID+IOnFindDeviceGAIDListenerImplementor, chocolate_criteo_adapter", FindDeviceGAID_OnFindDeviceGAIDListenerImplementor.class, __md_methods);
	}


	public FindDeviceGAID_OnFindDeviceGAIDListenerImplementor ()
	{
		super ();
		if (getClass () == FindDeviceGAID_OnFindDeviceGAIDListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Criteo.Controller.FindDeviceGAID+IOnFindDeviceGAIDListenerImplementor, chocolate_criteo_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onFindDeviceGAIDFailed ()
	{
		n_onFindDeviceGAIDFailed ();
	}

	private native void n_onFindDeviceGAIDFailed ();


	public void onFindDeviceGAIDSuccess (java.lang.String p0)
	{
		n_onFindDeviceGAIDSuccess (p0);
	}

	private native void n_onFindDeviceGAIDSuccess (java.lang.String p0);

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
