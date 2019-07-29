package mono.com.unity3d.services.purchasing.core;


public class ITransactionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.unity3d.services.purchasing.core.ITransactionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTransactionComplete:(Lcom/unity3d/services/purchasing/core/TransactionDetails;)V:GetOnTransactionComplete_Lcom_unity3d_services_purchasing_core_TransactionDetails_Handler:Com.Unity3d.Services.Purchasing.Core.ITransactionListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"n_onTransactionError:(Lcom/unity3d/services/purchasing/core/TransactionErrorDetails;)V:GetOnTransactionError_Lcom_unity3d_services_purchasing_core_TransactionErrorDetails_Handler:Com.Unity3d.Services.Purchasing.Core.ITransactionListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Unity3d.Services.Purchasing.Core.ITransactionListenerImplementor, xam.android.chocolate_unityads_adapter", ITransactionListenerImplementor.class, __md_methods);
	}


	public ITransactionListenerImplementor ()
	{
		super ();
		if (getClass () == ITransactionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Unity3d.Services.Purchasing.Core.ITransactionListenerImplementor, xam.android.chocolate_unityads_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onTransactionComplete (com.unity3d.services.purchasing.core.TransactionDetails p0)
	{
		n_onTransactionComplete (p0);
	}

	private native void n_onTransactionComplete (com.unity3d.services.purchasing.core.TransactionDetails p0);


	public void onTransactionError (com.unity3d.services.purchasing.core.TransactionErrorDetails p0)
	{
		n_onTransactionError (p0);
	}

	private native void n_onTransactionError (com.unity3d.services.purchasing.core.TransactionErrorDetails p0);

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
