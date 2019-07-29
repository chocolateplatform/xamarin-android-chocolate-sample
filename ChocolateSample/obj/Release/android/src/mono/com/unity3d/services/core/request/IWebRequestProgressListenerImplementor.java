package mono.com.unity3d.services.core.request;


public class IWebRequestProgressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.unity3d.services.core.request.IWebRequestProgressListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRequestProgress:(Ljava/lang/String;JJ)V:GetOnRequestProgress_Ljava_lang_String_JJHandler:Com.Unity3d.Services.Core.Request.IWebRequestProgressListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"n_onRequestStart:(Ljava/lang/String;JILjava/util/Map;)V:GetOnRequestStart_Ljava_lang_String_JILjava_util_Map_Handler:Com.Unity3d.Services.Core.Request.IWebRequestProgressListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Unity3d.Services.Core.Request.IWebRequestProgressListenerImplementor, xam.android.chocolate_unityads_adapter", IWebRequestProgressListenerImplementor.class, __md_methods);
	}


	public IWebRequestProgressListenerImplementor ()
	{
		super ();
		if (getClass () == IWebRequestProgressListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Unity3d.Services.Core.Request.IWebRequestProgressListenerImplementor, xam.android.chocolate_unityads_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onRequestProgress (java.lang.String p0, long p1, long p2)
	{
		n_onRequestProgress (p0, p1, p2);
	}

	private native void n_onRequestProgress (java.lang.String p0, long p1, long p2);


	public void onRequestStart (java.lang.String p0, long p1, int p2, java.util.Map p3)
	{
		n_onRequestStart (p0, p1, p2, p3);
	}

	private native void n_onRequestStart (java.lang.String p0, long p1, int p2, java.util.Map p3);

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
