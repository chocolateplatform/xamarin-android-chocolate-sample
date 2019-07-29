package mono.com.criteo.network;


public class NetworkRequest_OnNetworkRequestListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.criteo.network.NetworkRequest.OnNetworkRequestListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onNetworkRequestCompleted:(Lorg/json/JSONObject;Ljava/lang/String;)V:GetOnNetworkRequestCompleted_Lorg_json_JSONObject_Ljava_lang_String_Handler:Com.Criteo.Network.NetworkRequest/IOnNetworkRequestListenerInvoker, chocolate_criteo_adapter\n" +
			"n_onNetworkRequestFailed:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V:GetOnNetworkRequestFailed_ILjava_lang_String_Ljava_lang_String_Ljava_lang_String_Handler:Com.Criteo.Network.NetworkRequest/IOnNetworkRequestListenerInvoker, chocolate_criteo_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Criteo.Network.NetworkRequest+IOnNetworkRequestListenerImplementor, chocolate_criteo_adapter", NetworkRequest_OnNetworkRequestListenerImplementor.class, __md_methods);
	}


	public NetworkRequest_OnNetworkRequestListenerImplementor ()
	{
		super ();
		if (getClass () == NetworkRequest_OnNetworkRequestListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Criteo.Network.NetworkRequest+IOnNetworkRequestListenerImplementor, chocolate_criteo_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onNetworkRequestCompleted (org.json.JSONObject p0, java.lang.String p1)
	{
		n_onNetworkRequestCompleted (p0, p1);
	}

	private native void n_onNetworkRequestCompleted (org.json.JSONObject p0, java.lang.String p1);


	public void onNetworkRequestFailed (int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3)
	{
		n_onNetworkRequestFailed (p0, p1, p2, p3);
	}

	private native void n_onNetworkRequestFailed (int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3);

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
