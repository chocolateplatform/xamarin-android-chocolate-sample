package mono.com.vdopia.ads.lw;


public class VideoAspectRatioView_OnMeasureCompletionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.vdopia.ads.lw.VideoAspectRatioView.OnMeasureCompletionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMeasureCompleted:(II)V:GetOnMeasureCompleted_IIHandler:Com.Vdopia.Ads.LW.VideoAspectRatioView/IOnMeasureCompletionListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"";
		mono.android.Runtime.register ("Com.Vdopia.Ads.LW.VideoAspectRatioView+IOnMeasureCompletionListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", VideoAspectRatioView_OnMeasureCompletionListenerImplementor.class, __md_methods);
	}


	public VideoAspectRatioView_OnMeasureCompletionListenerImplementor ()
	{
		super ();
		if (getClass () == VideoAspectRatioView_OnMeasureCompletionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Vdopia.Ads.LW.VideoAspectRatioView+IOnMeasureCompletionListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", "", this, new java.lang.Object[] {  });
	}


	public void onMeasureCompleted (int p0, int p1)
	{
		n_onMeasureCompleted (p0, p1);
	}

	private native void n_onMeasureCompleted (int p0, int p1);

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
