package md595d0bd5a166ca636c080964d11f9945d;


public class MainActivity_OnClickListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("ChocolateSample.MainActivity+OnClickListener, ChocolateSample", MainActivity_OnClickListener.class, __md_methods);
	}


	public MainActivity_OnClickListener ()
	{
		super ();
		if (getClass () == MainActivity_OnClickListener.class)
			mono.android.TypeManager.Activate ("ChocolateSample.MainActivity+OnClickListener, ChocolateSample", "", this, new java.lang.Object[] {  });
	}

	public MainActivity_OnClickListener (md595d0bd5a166ca636c080964d11f9945d.MainActivity p0, int p1)
	{
		super ();
		if (getClass () == MainActivity_OnClickListener.class)
			mono.android.TypeManager.Activate ("ChocolateSample.MainActivity+OnClickListener, ChocolateSample", "ChocolateSample.MainActivity, ChocolateSample:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1 });
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
