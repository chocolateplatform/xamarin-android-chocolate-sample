package md595d0bd5a166ca636c080964d11f9945d;


public class MainActivity_AdListener
	extends com.google.android.gms.ads.AdListener
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdClosed:()V:GetOnAdClosedHandler\n" +
			"";
		mono.android.Runtime.register ("ChocolateSample.MainActivity+AdListener, ChocolateSample", MainActivity_AdListener.class, __md_methods);
	}


	public MainActivity_AdListener ()
	{
		super ();
		if (getClass () == MainActivity_AdListener.class)
			mono.android.TypeManager.Activate ("ChocolateSample.MainActivity+AdListener, ChocolateSample", "", this, new java.lang.Object[] {  });
	}

	public MainActivity_AdListener (md595d0bd5a166ca636c080964d11f9945d.MainActivity p0)
	{
		super ();
		if (getClass () == MainActivity_AdListener.class)
			mono.android.TypeManager.Activate ("ChocolateSample.MainActivity+AdListener, ChocolateSample", "ChocolateSample.MainActivity, ChocolateSample", this, new java.lang.Object[] { p0 });
	}


	public void onAdClosed ()
	{
		n_onAdClosed ();
	}

	private native void n_onAdClosed ();

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
