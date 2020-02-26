Chocolate Sample
=================

This sample demonstrates how to display Interstitial, Rewarded, and 300x250 MREC Banner Ads using the Chocolate Mediation Ads SDK for Xamarin.
It also dislays an AdMob 320x50 banner ad (not part of the Chocolate sdk).  If you want to build this project, please keep reading.

See MainActivity.cs
  - DO_ENABLE_TEST_ADS: If set 'true', you can specify particular desired sets of ad partners.  If set 'false' will run in production mode.
  
Ad Unit Types and corresponding mediation ad partners supported:

Native Inview (300x250)
  - Chocolate, AdMob, AppLovin, Amazon, Criteo
  
Fullscreen Rewarded Video
  - Chocolate, AdMob, AdColony, AppLovin, Amazon, Criteo, Unity Ads
  
Fullscreen Interstitial
  - Chocolate, AdMob, AdColony, AppLovin, Amazon, Criteo, Unity Ads
 
BUILD INSTRUCTIONS:
1) Git clone this repo.   
2) In Visual Studio 8.3.0 or higher, you will need to uninstall and RE-INSTALL all package dependencies manually via NuGet package manager in Visual Studio.  
3) Install GooglePlayServices version 60.1142.1 packages, since that version is compatable with MonoAndroid 8.1
The higher versions will not work since this project is targeted for MonoAndroid 8.1.

BUILD NOTE:  You will need to uninstall and RE-INSTALL the chocolate packages as seen in the following screenshot:

<image src="https://github.com/chocolateplatform/xamarin-android-chocolate-sample/blob/master/Screenshots/reinstall.png">

