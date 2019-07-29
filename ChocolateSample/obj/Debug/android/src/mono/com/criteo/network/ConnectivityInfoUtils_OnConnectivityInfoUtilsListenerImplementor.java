package mono.com.criteo.network;


public class ConnectivityInfoUtils_OnConnectivityInfoUtilsListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.criteo.network.ConnectivityInfoUtils.OnConnectivityInfoUtilsListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConnectivityInfoUtilsNetworkConnected:()V:GetOnConnectivityInfoUtilsNetworkConnectedHandler:Com.Criteo.Network.ConnectivityInfoUtils/IOnConnectivityInfoUtilsListenerInvoker, chocolate_criteo_adapter\n" +
			"n_onConnectivityInfoUtilsNetworkDisconnected:(ILjava/lang/String;)V:GetOnConnectivityInfoUtilsNetworkDisconnected_ILjava_lang_String_Handler:Com.Criteo.Network.ConnectivityInfoUtils/IOnConnectivityInfoUtilsListenerInvoker, chocolate_criteo_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Criteo.Network.ConnectivityInfoUtils+IOnConnectivityInfoUtilsListenerImplementor, chocolate_criteo_adapter", ConnectivityInfoUtils_OnConnectivityInfoUtilsListenerImplementor.class, __md_methods);
	}


	public ConnectivityInfoUtils_OnConnectivityInfoUtilsListenerImplementor ()
	{
		super ();
		if (getClass () == ConnectivityInfoUtils_OnConnectivityInfoUtilsListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Criteo.Network.ConnectivityInfoUtils+IOnConnectivityInfoUtilsListenerImplementor, chocolate_criteo_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onConnectivityInfoUtilsNetworkConnected ()
	{
		n_onConnectivityInfoUtilsNetworkConnected ();
	}

	private native void n_onConnectivityInfoUtilsNetworkConnected ();


	public void onConnectivityInfoUtilsNetworkDisconnected (int p0, java.lang.String p1)
	{
		n_onConnectivityInfoUtilsNetworkDisconnected (p0, p1);
	}

	private native void n_onConnectivityInfoUtilsNetworkDisconnected (int p0, java.lang.String p1);

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
