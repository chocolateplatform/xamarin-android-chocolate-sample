package mono.com.integralads.avid.library.adcolony;


public class AvidStateWatcher_AvidStateWatcherListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.integralads.avid.library.adcolony.AvidStateWatcher.AvidStateWatcherListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAppStateChanged:(Z)V:GetOnAppStateChanged_ZHandler:Com.Integralads.Avid.Library.Adcolony.AvidStateWatcher/IAvidStateWatcherListenerInvoker, chocolate_adcolony_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Integralads.Avid.Library.Adcolony.AvidStateWatcher+IAvidStateWatcherListenerImplementor, chocolate_adcolony_adapter", AvidStateWatcher_AvidStateWatcherListenerImplementor.class, __md_methods);
	}


	public AvidStateWatcher_AvidStateWatcherListenerImplementor ()
	{
		super ();
		if (getClass () == AvidStateWatcher_AvidStateWatcherListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Integralads.Avid.Library.Adcolony.AvidStateWatcher+IAvidStateWatcherListenerImplementor, chocolate_adcolony_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onAppStateChanged (boolean p0)
	{
		n_onAppStateChanged (p0);
	}

	private native void n_onAppStateChanged (boolean p0);

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
