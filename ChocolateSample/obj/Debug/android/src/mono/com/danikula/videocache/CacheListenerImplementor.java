package mono.com.danikula.videocache;


public class CacheListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.danikula.videocache.CacheListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCacheAvailable:(Ljava/io/File;Ljava/lang/String;I)V:GetOnCacheAvailable_Ljava_io_File_Ljava_lang_String_IHandler:Com.Danikula.Videocache.ICacheListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"";
		mono.android.Runtime.register ("Com.Danikula.Videocache.ICacheListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", CacheListenerImplementor.class, __md_methods);
	}


	public CacheListenerImplementor ()
	{
		super ();
		if (getClass () == CacheListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Danikula.Videocache.ICacheListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", "", this, new java.lang.Object[] {  });
	}


	public void onCacheAvailable (java.io.File p0, java.lang.String p1, int p2)
	{
		n_onCacheAvailable (p0, p1, p2);
	}

	private native void n_onCacheAvailable (java.io.File p0, java.lang.String p1, int p2);

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
