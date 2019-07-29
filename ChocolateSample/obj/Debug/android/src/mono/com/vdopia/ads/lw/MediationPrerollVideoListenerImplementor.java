package mono.com.vdopia.ads.lw;


public class MediationPrerollVideoListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.vdopia.ads.lw.MediationPrerollVideoListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMainContentCompleted:(Lcom/vdopia/ads/lw/Mediator;Landroid/media/MediaPlayer;)V:GetOnMainContentCompleted_Lcom_vdopia_ads_lw_Mediator_Landroid_media_MediaPlayer_Handler:Com.Vdopia.Ads.LW.IMediationPrerollVideoListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onMainContentFailed:(Lcom/vdopia/ads/lw/Mediator;Landroid/media/MediaPlayer;I)V:GetOnMainContentFailed_Lcom_vdopia_ads_lw_Mediator_Landroid_media_MediaPlayer_IHandler:Com.Vdopia.Ads.LW.IMediationPrerollVideoListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onMainContentPrepared:(Lcom/vdopia/ads/lw/Mediator;Landroid/media/MediaPlayer;)V:GetOnMainContentPrepared_Lcom_vdopia_ads_lw_Mediator_Landroid_media_MediaPlayer_Handler:Com.Vdopia.Ads.LW.IMediationPrerollVideoListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onPrerollAdClicked:(Lcom/vdopia/ads/lw/Mediator;Landroid/view/View;)V:GetOnPrerollAdClicked_Lcom_vdopia_ads_lw_Mediator_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.IMediationPrerollVideoListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onPrerollAdCompleted:(Lcom/vdopia/ads/lw/Mediator;Landroid/view/View;)V:GetOnPrerollAdCompleted_Lcom_vdopia_ads_lw_Mediator_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.IMediationPrerollVideoListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onPrerollAdFailed:(Lcom/vdopia/ads/lw/Mediator;Landroid/view/View;Lcom/vdopia/ads/lw/LVDOConstants$LVDOErrorCode;)V:GetOnPrerollAdFailed_Lcom_vdopia_ads_lw_Mediator_Landroid_view_View_Lcom_vdopia_ads_lw_LVDOConstants_LVDOErrorCode_Handler:Com.Vdopia.Ads.LW.IMediationPrerollVideoListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onPrerollAdLoaded:(Lcom/vdopia/ads/lw/Mediator;Landroid/view/View;)V:GetOnPrerollAdLoaded_Lcom_vdopia_ads_lw_Mediator_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.IMediationPrerollVideoListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"n_onPrerollAdShown:(Lcom/vdopia/ads/lw/Mediator;Landroid/view/View;)V:GetOnPrerollAdShown_Lcom_vdopia_ads_lw_Mediator_Landroid_view_View_Handler:Com.Vdopia.Ads.LW.IMediationPrerollVideoListenerInvoker, xam.android.chocolate_sdk_core.2.8.6\n" +
			"";
		mono.android.Runtime.register ("Com.Vdopia.Ads.LW.IMediationPrerollVideoListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", MediationPrerollVideoListenerImplementor.class, __md_methods);
	}


	public MediationPrerollVideoListenerImplementor ()
	{
		super ();
		if (getClass () == MediationPrerollVideoListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Vdopia.Ads.LW.IMediationPrerollVideoListenerImplementor, xam.android.chocolate_sdk_core.2.8.6", "", this, new java.lang.Object[] {  });
	}


	public void onMainContentCompleted (com.vdopia.ads.lw.Mediator p0, android.media.MediaPlayer p1)
	{
		n_onMainContentCompleted (p0, p1);
	}

	private native void n_onMainContentCompleted (com.vdopia.ads.lw.Mediator p0, android.media.MediaPlayer p1);


	public void onMainContentFailed (com.vdopia.ads.lw.Mediator p0, android.media.MediaPlayer p1, int p2)
	{
		n_onMainContentFailed (p0, p1, p2);
	}

	private native void n_onMainContentFailed (com.vdopia.ads.lw.Mediator p0, android.media.MediaPlayer p1, int p2);


	public void onMainContentPrepared (com.vdopia.ads.lw.Mediator p0, android.media.MediaPlayer p1)
	{
		n_onMainContentPrepared (p0, p1);
	}

	private native void n_onMainContentPrepared (com.vdopia.ads.lw.Mediator p0, android.media.MediaPlayer p1);


	public void onPrerollAdClicked (com.vdopia.ads.lw.Mediator p0, android.view.View p1)
	{
		n_onPrerollAdClicked (p0, p1);
	}

	private native void n_onPrerollAdClicked (com.vdopia.ads.lw.Mediator p0, android.view.View p1);


	public void onPrerollAdCompleted (com.vdopia.ads.lw.Mediator p0, android.view.View p1)
	{
		n_onPrerollAdCompleted (p0, p1);
	}

	private native void n_onPrerollAdCompleted (com.vdopia.ads.lw.Mediator p0, android.view.View p1);


	public void onPrerollAdFailed (com.vdopia.ads.lw.Mediator p0, android.view.View p1, com.vdopia.ads.lw.LVDOConstants.LVDOErrorCode p2)
	{
		n_onPrerollAdFailed (p0, p1, p2);
	}

	private native void n_onPrerollAdFailed (com.vdopia.ads.lw.Mediator p0, android.view.View p1, com.vdopia.ads.lw.LVDOConstants.LVDOErrorCode p2);


	public void onPrerollAdLoaded (com.vdopia.ads.lw.Mediator p0, android.view.View p1)
	{
		n_onPrerollAdLoaded (p0, p1);
	}

	private native void n_onPrerollAdLoaded (com.vdopia.ads.lw.Mediator p0, android.view.View p1);


	public void onPrerollAdShown (com.vdopia.ads.lw.Mediator p0, android.view.View p1)
	{
		n_onPrerollAdShown (p0, p1);
	}

	private native void n_onPrerollAdShown (com.vdopia.ads.lw.Mediator p0, android.view.View p1);

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
