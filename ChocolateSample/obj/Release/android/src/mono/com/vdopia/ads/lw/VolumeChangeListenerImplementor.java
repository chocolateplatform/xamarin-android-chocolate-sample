package mono.com.vdopia.ads.lw;


public class VolumeChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.vdopia.ads.lw.VolumeChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPrepared:(I)V:GetOnPrepared_IHandler:Com.Vdopia.Ads.LW.IVolumeChangeListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onVolumeChange:(I)V:GetOnVolumeChange_IHandler:Com.Vdopia.Ads.LW.IVolumeChangeListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"";
		mono.android.Runtime.register ("Com.Vdopia.Ads.LW.IVolumeChangeListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", VolumeChangeListenerImplementor.class, __md_methods);
	}


	public VolumeChangeListenerImplementor ()
	{
		super ();
		if (getClass () == VolumeChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Vdopia.Ads.LW.IVolumeChangeListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", "", this, new java.lang.Object[] {  });
	}


	public void onPrepared (int p0)
	{
		n_onPrepared (p0);
	}

	private native void n_onPrepared (int p0);


	public void onVolumeChange (int p0)
	{
		n_onVolumeChange (p0);
	}

	private native void n_onVolumeChange (int p0);

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
