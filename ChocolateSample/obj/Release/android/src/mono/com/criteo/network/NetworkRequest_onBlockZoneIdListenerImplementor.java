package mono.com.criteo.network;


public class NetworkRequest_onBlockZoneIdListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.criteo.network.NetworkRequest.onBlockZoneIdListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBlockZoneID:(Ljava/lang/String;)V:GetOnBlockZoneID_Ljava_lang_String_Handler:Com.Criteo.Network.NetworkRequest/IOnBlockZoneIdListenerInvoker, chocolate_criteo_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Criteo.Network.NetworkRequest+IOnBlockZoneIdListenerImplementor, chocolate_criteo_adapter", NetworkRequest_onBlockZoneIdListenerImplementor.class, __md_methods);
	}


	public NetworkRequest_onBlockZoneIdListenerImplementor ()
	{
		super ();
		if (getClass () == NetworkRequest_onBlockZoneIdListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Criteo.Network.NetworkRequest+IOnBlockZoneIdListenerImplementor, chocolate_criteo_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onBlockZoneID (java.lang.String p0)
	{
		n_onBlockZoneID (p0);
	}

	private native void n_onBlockZoneID (java.lang.String p0);

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
