package mono.com.vdopia.ads.lw;


public class AbstractVideoAdsView_AbstractVideoViewClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.vdopia.ads.lw.AbstractVideoAdsView.AbstractVideoViewClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.AbstractVideoAdsView/IAbstractVideoViewClickListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"";
		mono.android.Runtime.register ("Com.Vdopia.Ads.LW.AbstractVideoAdsView+IAbstractVideoViewClickListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", AbstractVideoAdsView_AbstractVideoViewClickListenerImplementor.class, __md_methods);
	}


	public AbstractVideoAdsView_AbstractVideoViewClickListenerImplementor ()
	{
		super ();
		if (getClass () == AbstractVideoAdsView_AbstractVideoViewClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Vdopia.Ads.LW.AbstractVideoAdsView+IAbstractVideoViewClickListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", "", this, new java.lang.Object[] {  });
	}


	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);

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
