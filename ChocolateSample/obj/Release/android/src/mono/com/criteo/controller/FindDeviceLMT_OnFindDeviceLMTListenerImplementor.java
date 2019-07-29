package mono.com.criteo.controller;


public class FindDeviceLMT_OnFindDeviceLMTListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.criteo.controller.FindDeviceLMT.OnFindDeviceLMTListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFindDeviceLMTFailed:()V:GetOnFindDeviceLMTFailedHandler:Com.Criteo.Controller.FindDeviceLMT/IOnFindDeviceLMTListenerInvoker, chocolate_criteo_adapter\n" +
			"n_onFindDeviceLMTSuccess:(Ljava/lang/String;)V:GetOnFindDeviceLMTSuccess_Ljava_lang_String_Handler:Com.Criteo.Controller.FindDeviceLMT/IOnFindDeviceLMTListenerInvoker, chocolate_criteo_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Criteo.Controller.FindDeviceLMT+IOnFindDeviceLMTListenerImplementor, chocolate_criteo_adapter", FindDeviceLMT_OnFindDeviceLMTListenerImplementor.class, __md_methods);
	}


	public FindDeviceLMT_OnFindDeviceLMTListenerImplementor ()
	{
		super ();
		if (getClass () == FindDeviceLMT_OnFindDeviceLMTListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Criteo.Controller.FindDeviceLMT+IOnFindDeviceLMTListenerImplementor, chocolate_criteo_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onFindDeviceLMTFailed ()
	{
		n_onFindDeviceLMTFailed ();
	}

	private native void n_onFindDeviceLMTFailed ();


	public void onFindDeviceLMTSuccess (java.lang.String p0)
	{
		n_onFindDeviceLMTSuccess (p0);
	}

	private native void n_onFindDeviceLMTSuccess (java.lang.String p0);

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
