package mono.com.applovin.sdk;


public class AppLovinVariableService_OnVariablesUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.applovin.sdk.AppLovinVariableService.OnVariablesUpdateListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onVariablesUpdate:(Landroid/os/Bundle;)V:GetOnVariablesUpdate_Landroid_os_Bundle_Handler:Com.Applovin.Sdk.IAppLovinVariableServiceOnVariablesUpdateListenerInvoker, chocolate_applovin_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Applovin.Sdk.IAppLovinVariableServiceOnVariablesUpdateListenerImplementor, chocolate_applovin_adapter", AppLovinVariableService_OnVariablesUpdateListenerImplementor.class, __md_methods);
	}


	public AppLovinVariableService_OnVariablesUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == AppLovinVariableService_OnVariablesUpdateListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Applovin.Sdk.IAppLovinVariableServiceOnVariablesUpdateListenerImplementor, chocolate_applovin_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onVariablesUpdate (android.os.Bundle p0)
	{
		n_onVariablesUpdate (p0);
	}

	private native void n_onVariablesUpdate (android.os.Bundle p0);

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
