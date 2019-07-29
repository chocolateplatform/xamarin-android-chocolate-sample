package mono.com.unity3d.services;


public class IUnityServicesListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.unity3d.services.IUnityServicesListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onUnityServicesError:(Lcom/unity3d/services/UnityServices$UnityServicesError;Ljava/lang/String;)V:GetOnUnityServicesError_Lcom_unity3d_services_UnityServices_UnityServicesError_Ljava_lang_String_Handler:Com.Unity3d.Services.IUnityServicesListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Unity3d.Services.IUnityServicesListenerImplementor, xam.android.chocolate_unityads_adapter", IUnityServicesListenerImplementor.class, __md_methods);
	}


	public IUnityServicesListenerImplementor ()
	{
		super ();
		if (getClass () == IUnityServicesListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Unity3d.Services.IUnityServicesListenerImplementor, xam.android.chocolate_unityads_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onUnityServicesError (com.unity3d.services.UnityServices.UnityServicesError p0, java.lang.String p1)
	{
		n_onUnityServicesError (p0, p1);
	}

	private native void n_onUnityServicesError (com.unity3d.services.UnityServices.UnityServicesError p0, java.lang.String p1);

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
