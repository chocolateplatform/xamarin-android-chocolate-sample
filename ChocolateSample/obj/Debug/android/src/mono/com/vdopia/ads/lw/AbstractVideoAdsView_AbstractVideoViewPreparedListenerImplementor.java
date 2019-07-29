package mono.com.vdopia.ads.lw;


public class AbstractVideoAdsView_AbstractVideoViewPreparedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.vdopia.ads.lw.AbstractVideoAdsView.AbstractVideoViewPreparedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPrepared:()V:GetOnPreparedHandler:Com.Vdopia.Ads.LW.AbstractVideoAdsView/IAbstractVideoViewPreparedListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"";
		mono.android.Runtime.register ("Com.Vdopia.Ads.LW.AbstractVideoAdsView+IAbstractVideoViewPreparedListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", AbstractVideoAdsView_AbstractVideoViewPreparedListenerImplementor.class, __md_methods);
	}


	public AbstractVideoAdsView_AbstractVideoViewPreparedListenerImplementor ()
	{
		super ();
		if (getClass () == AbstractVideoAdsView_AbstractVideoViewPreparedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Vdopia.Ads.LW.AbstractVideoAdsView+IAbstractVideoViewPreparedListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", "", this, new java.lang.Object[] {  });
	}


	public void onPrepared ()
	{
		n_onPrepared ();
	}

	private native void n_onPrepared ();

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
