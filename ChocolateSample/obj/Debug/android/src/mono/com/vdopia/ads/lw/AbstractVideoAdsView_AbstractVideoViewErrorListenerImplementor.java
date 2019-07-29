package mono.com.vdopia.ads.lw;


public class AbstractVideoAdsView_AbstractVideoViewErrorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.vdopia.ads.lw.AbstractVideoAdsView.AbstractVideoViewErrorListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onError:(Ljava/lang/Exception;)Z:GetOnError_Ljava_lang_Exception_Handler:Com.Vdopia.Ads.LW.AbstractVideoAdsView/IAbstractVideoViewErrorListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"";
		mono.android.Runtime.register ("Com.Vdopia.Ads.LW.AbstractVideoAdsView+IAbstractVideoViewErrorListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", AbstractVideoAdsView_AbstractVideoViewErrorListenerImplementor.class, __md_methods);
	}


	public AbstractVideoAdsView_AbstractVideoViewErrorListenerImplementor ()
	{
		super ();
		if (getClass () == AbstractVideoAdsView_AbstractVideoViewErrorListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Vdopia.Ads.LW.AbstractVideoAdsView+IAbstractVideoViewErrorListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", "", this, new java.lang.Object[] {  });
	}


	public boolean onError (java.lang.Exception p0)
	{
		return n_onError (p0);
	}

	private native boolean n_onError (java.lang.Exception p0);

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
