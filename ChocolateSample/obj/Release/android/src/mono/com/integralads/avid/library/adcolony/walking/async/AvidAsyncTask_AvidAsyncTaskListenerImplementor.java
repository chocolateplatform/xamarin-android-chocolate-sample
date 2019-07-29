package mono.com.integralads.avid.library.adcolony.walking.async;


public class AvidAsyncTask_AvidAsyncTaskListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.integralads.avid.library.adcolony.walking.async.AvidAsyncTask.AvidAsyncTaskListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTaskCompleted:(Lcom/integralads/avid/library/adcolony/walking/async/AvidAsyncTask;)V:GetOnTaskCompleted_Lcom_integralads_avid_library_adcolony_walking_async_AvidAsyncTask_Handler:Com.Integralads.Avid.Library.Adcolony.Walking.Async.AvidAsyncTask/IAvidAsyncTaskListenerInvoker, chocolate_adcolony_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Integralads.Avid.Library.Adcolony.Walking.Async.AvidAsyncTask+IAvidAsyncTaskListenerImplementor, chocolate_adcolony_adapter", AvidAsyncTask_AvidAsyncTaskListenerImplementor.class, __md_methods);
	}


	public AvidAsyncTask_AvidAsyncTaskListenerImplementor ()
	{
		super ();
		if (getClass () == AvidAsyncTask_AvidAsyncTaskListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Integralads.Avid.Library.Adcolony.Walking.Async.AvidAsyncTask+IAvidAsyncTaskListenerImplementor, chocolate_adcolony_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onTaskCompleted (com.integralads.avid.library.adcolony.walking.async.AvidAsyncTask p0)
	{
		n_onTaskCompleted (p0);
	}

	private native void n_onTaskCompleted (com.integralads.avid.library.adcolony.walking.async.AvidAsyncTask p0);

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
