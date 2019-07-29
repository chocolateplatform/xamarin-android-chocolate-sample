package mono.com.unity3d.services.purchasing.core;


public class IRetrieveProductsListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.unity3d.services.purchasing.core.IRetrieveProductsListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onProductsRetrieved:(Ljava/util/List;)V:GetOnProductsRetrieved_Ljava_util_List_Handler:Com.Unity3d.Services.Purchasing.Core.IRetrieveProductsListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Unity3d.Services.Purchasing.Core.IRetrieveProductsListenerImplementor, xam.android.chocolate_unityads_adapter", IRetrieveProductsListenerImplementor.class, __md_methods);
	}


	public IRetrieveProductsListenerImplementor ()
	{
		super ();
		if (getClass () == IRetrieveProductsListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Unity3d.Services.Purchasing.Core.IRetrieveProductsListenerImplementor, xam.android.chocolate_unityads_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onProductsRetrieved (java.util.List p0)
	{
		n_onProductsRetrieved (p0);
	}

	private native void n_onProductsRetrieved (java.util.List p0);

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
