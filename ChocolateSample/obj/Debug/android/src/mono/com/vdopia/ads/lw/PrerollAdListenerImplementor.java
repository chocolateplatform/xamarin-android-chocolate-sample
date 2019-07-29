package mono.com.vdopia.ads.lw;


public class PrerollAdListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.vdopia.ads.lw.PrerollAdListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCompleteMainContent:(Landroid/media/MediaPlayer;)V:GetOnCompleteMainContent_Landroid_media_MediaPlayer_Handler:Com.Vdopia.Ads.LW.IPrerollAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onErrorMainContent:(Landroid/media/MediaPlayer;I)V:GetOnErrorMainContent_Landroid_media_MediaPlayer_IHandler:Com.Vdopia.Ads.LW.IPrerollAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onPrepareMainContent:(Landroid/media/MediaPlayer;)V:GetOnPrepareMainContent_Landroid_media_MediaPlayer_Handler:Com.Vdopia.Ads.LW.IPrerollAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onPrerollAdClicked:(Landroid/view/View;)V:GetOnPrerollAdClicked_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.IPrerollAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onPrerollAdCompleted:(Landroid/view/View;)V:GetOnPrerollAdCompleted_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.IPrerollAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onPrerollAdFailed:(Landroid/view/View;Lcom/vdopia/ads/lw/LVDOConstants$LVDOErrorCode;)V:GetOnPrerollAdFailed_Landroid_view_View_Lcom_vdopia_ads_lw_LVDOConstants_LVDOErrorCode_Handler:Com.Vdopia.Ads.LW.IPrerollAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onPrerollAdLoaded:(Landroid/view/View;)V:GetOnPrerollAdLoaded_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.IPrerollAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onPrerollAdShown:(Landroid/view/View;)V:GetOnPrerollAdShown_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.IPrerollAdListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"";
		mono.android.Runtime.register ("Com.Vdopia.Ads.LW.IPrerollAdListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", PrerollAdListenerImplementor.class, __md_methods);
	}


	public PrerollAdListenerImplementor ()
	{
		super ();
		if (getClass () == PrerollAdListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Vdopia.Ads.LW.IPrerollAdListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", "", this, new java.lang.Object[] {  });
	}


	public void onCompleteMainContent (android.media.MediaPlayer p0)
	{
		n_onCompleteMainContent (p0);
	}

	private native void n_onCompleteMainContent (android.media.MediaPlayer p0);


	public void onErrorMainContent (android.media.MediaPlayer p0, int p1)
	{
		n_onErrorMainContent (p0, p1);
	}

	private native void n_onErrorMainContent (android.media.MediaPlayer p0, int p1);


	public void onPrepareMainContent (android.media.MediaPlayer p0)
	{
		n_onPrepareMainContent (p0);
	}

	private native void n_onPrepareMainContent (android.media.MediaPlayer p0);


	public void onPrerollAdClicked (android.view.View p0)
	{
		n_onPrerollAdClicked (p0);
	}

	private native void n_onPrerollAdClicked (android.view.View p0);


	public void onPrerollAdCompleted (android.view.View p0)
	{
		n_onPrerollAdCompleted (p0);
	}

	private native void n_onPrerollAdCompleted (android.view.View p0);


	public void onPrerollAdFailed (android.view.View p0, com.vdopia.ads.lw.LVDOConstants.LVDOErrorCode p1)
	{
		n_onPrerollAdFailed (p0, p1);
	}

	private native void n_onPrerollAdFailed (android.view.View p0, com.vdopia.ads.lw.LVDOConstants.LVDOErrorCode p1);


	public void onPrerollAdLoaded (android.view.View p0)
	{
		n_onPrerollAdLoaded (p0);
	}

	private native void n_onPrerollAdLoaded (android.view.View p0);


	public void onPrerollAdShown (android.view.View p0)
	{
		n_onPrerollAdShown (p0);
	}

	private native void n_onPrerollAdShown (android.view.View p0);

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
