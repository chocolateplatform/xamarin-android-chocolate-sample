package mono.com.unity3d.services.banners;


public class IUnityBannerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.unity3d.services.banners.IUnityBannerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onUnityBannerClick:(Ljava/lang/String;)V:GetOnUnityBannerClick_Ljava_lang_String_Handler:Com.Unity3d.Services.Banners.IUnityBannerListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"n_onUnityBannerError:(Ljava/lang/String;)V:GetOnUnityBannerError_Ljava_lang_String_Handler:Com.Unity3d.Services.Banners.IUnityBannerListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"n_onUnityBannerHide:(Ljava/lang/String;)V:GetOnUnityBannerHide_Ljava_lang_String_Handler:Com.Unity3d.Services.Banners.IUnityBannerListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"n_onUnityBannerLoaded:(Ljava/lang/String;Landroid/view/View;)V:GetOnUnityBannerLoaded_Ljava_lang_String_Landroid_view_View_Handler:Com.Unity3d.Services.Banners.IUnityBannerListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"n_onUnityBannerShow:(Ljava/lang/String;)V:GetOnUnityBannerShow_Ljava_lang_String_Handler:Com.Unity3d.Services.Banners.IUnityBannerListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"n_onUnityBannerUnloaded:(Ljava/lang/String;)V:GetOnUnityBannerUnloaded_Ljava_lang_String_Handler:Com.Unity3d.Services.Banners.IUnityBannerListenerInvoker, xam.android.chocolate_unityads_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Unity3d.Services.Banners.IUnityBannerListenerImplementor, xam.android.chocolate_unityads_adapter", IUnityBannerListenerImplementor.class, __md_methods);
	}


	public IUnityBannerListenerImplementor ()
	{
		super ();
		if (getClass () == IUnityBannerListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Unity3d.Services.Banners.IUnityBannerListenerImplementor, xam.android.chocolate_unityads_adapter", "", this, new java.lang.Object[] {  });
	}


	public void onUnityBannerClick (java.lang.String p0)
	{
		n_onUnityBannerClick (p0);
	}

	private native void n_onUnityBannerClick (java.lang.String p0);


	public void onUnityBannerError (java.lang.String p0)
	{
		n_onUnityBannerError (p0);
	}

	private native void n_onUnityBannerError (java.lang.String p0);


	public void onUnityBannerHide (java.lang.String p0)
	{
		n_onUnityBannerHide (p0);
	}

	private native void n_onUnityBannerHide (java.lang.String p0);


	public void onUnityBannerLoaded (java.lang.String p0, android.view.View p1)
	{
		n_onUnityBannerLoaded (p0, p1);
	}

	private native void n_onUnityBannerLoaded (java.lang.String p0, android.view.View p1);


	public void onUnityBannerShow (java.lang.String p0)
	{
		n_onUnityBannerShow (p0);
	}

	private native void n_onUnityBannerShow (java.lang.String p0);


	public void onUnityBannerUnloaded (java.lang.String p0)
	{
		n_onUnityBannerUnloaded (p0);
	}

	private native void n_onUnityBannerUnloaded (java.lang.String p0);

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
