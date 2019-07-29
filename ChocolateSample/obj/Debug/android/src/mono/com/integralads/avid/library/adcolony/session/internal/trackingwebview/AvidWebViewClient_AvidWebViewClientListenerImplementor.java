package mono.com.integralads.avid.library.adcolony.session.internal.trackingwebview;


public class AvidWebViewClient_AvidWebViewClientListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.integralads.avid.library.adcolony.session.internal.trackingwebview.AvidWebViewClient.AvidWebViewClientListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_webViewDidLoadData:()V:GetWebViewDidLoadDataHandler:Com.Integralads.Avid.Library.Adcolony.Session.Internal.Trackingwebview.AvidWebViewClient/IAvidWebViewClientListenerInvoker, chocolate_adcolony_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Integralads.Avid.Library.Adcolony.Session.Internal.Trackingwebview.AvidWebViewClient+IAvidWebViewClientListenerImplementor, chocolate_adcolony_adapter", AvidWebViewClient_AvidWebViewClientListenerImplementor.class, __md_methods);
	}


	public AvidWebViewClient_AvidWebViewClientListenerImplementor ()
	{
		super ();
		if (getClass () == AvidWebViewClient_AvidWebViewClientListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Integralads.Avid.Library.Adcolony.Session.Internal.Trackingwebview.AvidWebViewClient+IAvidWebViewClientListenerImplementor, chocolate_adcolony_adapter", "", this, new java.lang.Object[] {  });
	}


	public void webViewDidLoadData ()
	{
		n_webViewDidLoadData ();
	}

	private native void n_webViewDidLoadData ();

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
