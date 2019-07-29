package mono.com.vdopia.ads.lw;


public class AbstractVideoAdsView_AbstractVideoViewCompletionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.vdopia.ads.lw.AbstractVideoAdsView.AbstractVideoViewCompletionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCompletion:()V:GetOnCompletionHandler:Com.Vdopia.Ads.LW.AbstractVideoAdsView/IAbstractVideoViewCompletionListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"";
		mono.android.Runtime.register ("Com.Vdopia.Ads.LW.AbstractVideoAdsView+IAbstractVideoViewCompletionListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", AbstractVideoAdsView_AbstractVideoViewCompletionListenerImplementor.class, __md_methods);
	}


	public AbstractVideoAdsView_AbstractVideoViewCompletionListenerImplementor ()
	{
		super ();
		if (getClass () == AbstractVideoAdsView_AbstractVideoViewCompletionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Vdopia.Ads.LW.AbstractVideoAdsView+IAbstractVideoViewCompletionListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", "", this, new java.lang.Object[] {  });
	}


	public void onCompletion ()
	{
		n_onCompletion ();
	}

	private native void n_onCompletion ();

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
