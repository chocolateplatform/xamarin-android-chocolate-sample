package mono.com.unity3d.services.core.connectivity;


public class IConnectivityListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.unity3d.services.core.connectivity.IConnectivityListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConnected:()V:GetOnConnectedHandler:Com.Unity3d.Services.Core.Connectivity.IConnectivityListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"n_onDisconnected:()V:GetOnDisconnectedHandler:Com.Unity3d.Services.Core.Connectivity.IConnectivityListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Unity3d.Services.Core.Connectivity.IConnectivityListenerImplementor, xam.android.chocolate_unityads_adapter", IConnectivityListenerImplementor.class, __md_methods);
	}


	public IConnectivityListenerImplementor ()
	{
		super ();
		if (getClass () == IConnectivityListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Unity3d.Services.Core.Connectivity.IConnectivityListenerImplementor, xam.android.chocolate_unityads_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onConnected ()
	{
		n_onConnected ();
	}

	private native void n_onConnected ();


	public void onDisconnected ()
	{
		n_onDisconnected ();
	}

	private native void n_onDisconnected ();

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
