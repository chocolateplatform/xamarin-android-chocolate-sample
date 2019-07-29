package mono.com.adcolony.sdk;


public class AdColonyRewardListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.adcolony.sdk.AdColonyRewardListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onReward:(Lcom/adcolony/sdk/AdColonyReward;)V:GetOnReward_Lcom_adcolony_sdk_AdColonyReward_Handler:Com.Adcolony.Sdk.IAdColonyRewardListenerInvoker, chocolate_adcolony_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Adcolony.Sdk.IAdColonyRewardListenerImplementor, chocolate_adcolony_adapter", AdColonyRewardListenerImplementor.class, __md_methods);
	}


	public AdColonyRewardListenerImplementor ()
	{
		super ();
		if (getClass () == AdColonyRewardListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Adcolony.Sdk.IAdColonyRewardListenerImplementor, chocolate_adcolony_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onReward (com.adcolony.sdk.AdColonyReward p0)
	{
		n_onReward (p0);
	}

	private native void n_onReward (com.adcolony.sdk.AdColonyReward p0);

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
