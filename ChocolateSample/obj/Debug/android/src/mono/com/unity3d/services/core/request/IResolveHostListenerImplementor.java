package mono.com.unity3d.services.core.request;


public class IResolveHostListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.unity3d.services.core.request.IResolveHostListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFailed:(Ljava/lang/String;Lcom/unity3d/services/core/request/ResolveHostError;Ljava/lang/String;)V:GetOnFailed_Ljava_lang_String_Lcom_unity3d_services_core_request_ResolveHostError_Ljava_lang_String_Handler:Com.Unity3d.Services.Core.Request.IResolveHostListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"n_onResolve:(Ljava/lang/String;Ljava/lang/String;)V:GetOnResolve_Ljava_lang_String_Ljava_lang_String_Handler:Com.Unity3d.Services.Core.Request.IResolveHostListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Unity3d.Services.Core.Request.IResolveHostListenerImplementor, xam.android.chocolate_unityads_adapter", IResolveHostListenerImplementor.class, __md_methods);
	}


	public IResolveHostListenerImplementor ()
	{
		super ();
		if (getClass () == IResolveHostListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Unity3d.Services.Core.Request.IResolveHostListenerImplementor, xam.android.chocolate_unityads_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onFailed (java.lang.String p0, com.unity3d.services.core.request.ResolveHostError p1, java.lang.String p2)
	{
		n_onFailed (p0, p1, p2);
	}

	private native void n_onFailed (java.lang.String p0, com.unity3d.services.core.request.ResolveHostError p1, java.lang.String p2);


	public void onResolve (java.lang.String p0, java.lang.String p1)
	{
		n_onResolve (p0, p1);
	}

	private native void n_onResolve (java.lang.String p0, java.lang.String p1);

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
