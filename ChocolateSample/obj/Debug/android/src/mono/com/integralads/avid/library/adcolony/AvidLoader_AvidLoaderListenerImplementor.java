package mono.com.integralads.avid.library.adcolony;


public class AvidLoader_AvidLoaderListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.integralads.avid.library.adcolony.AvidLoader.AvidLoaderListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAvidLoaded:()V:GetOnAvidLoadedHandler:Com.Integralads.Avid.Library.Adcolony.AvidLoader/IAvidLoaderListenerInvoker, chocolate_adcolony_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Integralads.Avid.Library.Adcolony.AvidLoader+IAvidLoaderListenerImplementor, chocolate_adcolony_adapter", AvidLoader_AvidLoaderListenerImplementor.class, __md_methods);
	}


	public AvidLoader_AvidLoaderListenerImplementor ()
	{
		super ();
		if (getClass () == AvidLoader_AvidLoaderListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Integralads.Avid.Library.Adcolony.AvidLoader+IAvidLoaderListenerImplementor, chocolate_adcolony_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onAvidLoaded ()
	{
		n_onAvidLoaded ();
	}

	private native void n_onAvidLoaded ();

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
