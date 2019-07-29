package mono.com.unity3d.services.core.request;


public class IWebRequestListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.unity3d.services.core.request.IWebRequestListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onComplete:(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;)V:GetOnComplete_Ljava_lang_String_Ljava_lang_String_ILjava_util_Map_Handler:Com.Unity3d.Services.Core.Request.IWebRequestListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"n_onFailed:(Ljava/lang/String;Ljava/lang/String;)V:GetOnFailed_Ljava_lang_String_Ljava_lang_String_Handler:Com.Unity3d.Services.Core.Request.IWebRequestListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Unity3d.Services.Core.Request.IWebRequestListenerImplementor, xam.android.chocolate_unityads_adapter", IWebRequestListenerImplementor.class, __md_methods);
	}


	public IWebRequestListenerImplementor ()
	{
		super ();
		if (getClass () == IWebRequestListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Unity3d.Services.Core.Request.IWebRequestListenerImplementor, xam.android.chocolate_unityads_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onComplete (java.lang.String p0, java.lang.String p1, int p2, java.util.Map p3)
	{
		n_onComplete (p0, p1, p2, p3);
	}

	private native void n_onComplete (java.lang.String p0, java.lang.String p1, int p2, java.util.Map p3);


	public void onFailed (java.lang.String p0, java.lang.String p1)
	{
		n_onFailed (p0, p1);
	}

	private native void n_onFailed (java.lang.String p0, java.lang.String p1);

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
