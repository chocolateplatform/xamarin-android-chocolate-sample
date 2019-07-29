package mono.com.integralads.avid.library.adcolony.video;


public class AvidVideoPlaybackListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.integralads.avid.library.adcolony.video.AvidVideoPlaybackListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_recordAdClickThruEvent:()V:GetRecordAdClickThruEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdCompleteEvent:()V:GetRecordAdCompleteEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdDurationChangeEvent:(Ljava/lang/String;Ljava/lang/String;)V:GetRecordAdDurationChangeEvent_Ljava_lang_String_Ljava_lang_String_Handler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdEnteredFullscreenEvent:()V:GetRecordAdEnteredFullscreenEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdError:(Ljava/lang/String;)V:GetRecordAdError_Ljava_lang_String_Handler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdExitedFullscreenEvent:()V:GetRecordAdExitedFullscreenEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdExpandedChangeEvent:()V:GetRecordAdExpandedChangeEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdImpressionEvent:()V:GetRecordAdImpressionEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdLoadedEvent:()V:GetRecordAdLoadedEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdPausedEvent:()V:GetRecordAdPausedEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdPlayingEvent:()V:GetRecordAdPlayingEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdSkippedEvent:()V:GetRecordAdSkippedEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdStartedEvent:()V:GetRecordAdStartedEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdStoppedEvent:()V:GetRecordAdStoppedEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdUserAcceptInvitationEvent:()V:GetRecordAdUserAcceptInvitationEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdUserCloseEvent:()V:GetRecordAdUserCloseEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdUserMinimizeEvent:()V:GetRecordAdUserMinimizeEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdVideoFirstQuartileEvent:()V:GetRecordAdVideoFirstQuartileEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdVideoMidpointEvent:()V:GetRecordAdVideoMidpointEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdVideoStartEvent:()V:GetRecordAdVideoStartEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdVideoThirdQuartileEvent:()V:GetRecordAdVideoThirdQuartileEventHandler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"n_recordAdVolumeChangeEvent:(Ljava/lang/Integer;)V:GetRecordAdVolumeChangeEvent_Ljava_lang_Integer_Handler:Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerInvoker, chocolate_adcolony_adapter\n" +
			"";
		mono.android.Runtime.register ("Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerImplementor, chocolate_adcolony_adapter", AvidVideoPlaybackListenerImplementor.class, __md_methods);
	}


	public AvidVideoPlaybackListenerImplementor ()
	{
		super ();
		if (getClass () == AvidVideoPlaybackListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Integralads.Avid.Library.Adcolony.Video.IAvidVideoPlaybackListenerImplementor, chocolate_adcolony_adapter", "", this, new java.lang.Object[] {  });
	}


	public void recordAdClickThruEvent ()
	{
		n_recordAdClickThruEvent ();
	}

	private native void n_recordAdClickThruEvent ();


	public void recordAdCompleteEvent ()
	{
		n_recordAdCompleteEvent ();
	}

	private native void n_recordAdCompleteEvent ();


	public void recordAdDurationChangeEvent (java.lang.String p0, java.lang.String p1)
	{
		n_recordAdDurationChangeEvent (p0, p1);
	}

	private native void n_recordAdDurationChangeEvent (java.lang.String p0, java.lang.String p1);


	public void recordAdEnteredFullscreenEvent ()
	{
		n_recordAdEnteredFullscreenEvent ();
	}

	private native void n_recordAdEnteredFullscreenEvent ();


	public void recordAdError (java.lang.String p0)
	{
		n_recordAdError (p0);
	}

	private native void n_recordAdError (java.lang.String p0);


	public void recordAdExitedFullscreenEvent ()
	{
		n_recordAdExitedFullscreenEvent ();
	}

	private native void n_recordAdExitedFullscreenEvent ();


	public void recordAdExpandedChangeEvent ()
	{
		n_recordAdExpandedChangeEvent ();
	}

	private native void n_recordAdExpandedChangeEvent ();


	public void recordAdImpressionEvent ()
	{
		n_recordAdImpressionEvent ();
	}

	private native void n_recordAdImpressionEvent ();


	public void recordAdLoadedEvent ()
	{
		n_recordAdLoadedEvent ();
	}

	private native void n_recordAdLoadedEvent ();


	public void recordAdPausedEvent ()
	{
		n_recordAdPausedEvent ();
	}

	private native void n_recordAdPausedEvent ();


	public void recordAdPlayingEvent ()
	{
		n_recordAdPlayingEvent ();
	}

	private native void n_recordAdPlayingEvent ();


	public void recordAdSkippedEvent ()
	{
		n_recordAdSkippedEvent ();
	}

	private native void n_recordAdSkippedEvent ();


	public void recordAdStartedEvent ()
	{
		n_recordAdStartedEvent ();
	}

	private native void n_recordAdStartedEvent ();


	public void recordAdStoppedEvent ()
	{
		n_recordAdStoppedEvent ();
	}

	private native void n_recordAdStoppedEvent ();


	public void recordAdUserAcceptInvitationEvent ()
	{
		n_recordAdUserAcceptInvitationEvent ();
	}

	private native void n_recordAdUserAcceptInvitationEvent ();


	public void recordAdUserCloseEvent ()
	{
		n_recordAdUserCloseEvent ();
	}

	private native void n_recordAdUserCloseEvent ();


	public void recordAdUserMinimizeEvent ()
	{
		n_recordAdUserMinimizeEvent ();
	}

	private native void n_recordAdUserMinimizeEvent ();


	public void recordAdVideoFirstQuartileEvent ()
	{
		n_recordAdVideoFirstQuartileEvent ();
	}

	private native void n_recordAdVideoFirstQuartileEvent ();


	public void recordAdVideoMidpointEvent ()
	{
		n_recordAdVideoMidpointEvent ();
	}

	private native void n_recordAdVideoMidpointEvent ();


	public void recordAdVideoStartEvent ()
	{
		n_recordAdVideoStartEvent ();
	}

	private native void n_recordAdVideoStartEvent ();


	public void recordAdVideoThirdQuartileEvent ()
	{
		n_recordAdVideoThirdQuartileEvent ();
	}

	private native void n_recordAdVideoThirdQuartileEvent ();


	public void recordAdVolumeChangeEvent (java.lang.Integer p0)
	{
		n_recordAdVolumeChangeEvent (p0);
	}

	private native void n_recordAdVolumeChangeEvent (java.lang.Integer p0);

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
