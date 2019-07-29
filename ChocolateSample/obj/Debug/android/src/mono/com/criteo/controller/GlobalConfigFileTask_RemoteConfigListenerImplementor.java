package mono.com.criteo.controller;


public class GlobalConfigFileTask_RemoteConfigListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.criteo.controller.GlobalConfigFileTask.RemoteConfigListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRemoteFailed:(Ljava/lang/String;)V:GetOnRemoteFailed_Ljava_lang_String_Handler:Com.Criteo.Controller.GlobalConfigFileTask/IRemoteConfigListenerInvoker, chocolate_criteo_adapter\n" +
			"n_onRemoteSuccess:(Ljava/io/File;)V:GetOnRemoteSuccess_Ljava_io_File_Handler:Com.Criteo.Controller.GlobalConfigFileTask/IRemoteConfigListenerInvoker, chocolate_criteo_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Criteo.Controller.GlobalConfigFileTask+IRemoteConfigListenerImplementor, chocolate_criteo_adapter", GlobalConfigFileTask_RemoteConfigListenerImplementor.class, __md_methods);
	}


	public GlobalConfigFileTask_RemoteConfigListenerImplementor ()
	{
		super ();
		if (getClass () == GlobalConfigFileTask_RemoteConfigListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Criteo.Controller.GlobalConfigFileTask+IRemoteConfigListenerImplementor, chocolate_criteo_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onRemoteFailed (java.lang.String p0)
	{
		n_onRemoteFailed (p0);
	}

	private native void n_onRemoteFailed (java.lang.String p0);


	public void onRemoteSuccess (java.io.File p0)
	{
		n_onRemoteSuccess (p0);
	}

	private native void n_onRemoteSuccess (java.io.File p0);

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
