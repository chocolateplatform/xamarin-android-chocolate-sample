Chocolate Sample
=================

This sample demonstrates how to display different types of ads using Chocolate Mediation Ads SDK.
It also dislays an AdMob 320x50 banner ad (not part of the Chocolate sdk).  If you want to build this project, please keep reading.

See MainActivity.cs
  - DO_ENABLE_TEST_ADS: If set 'true', you can specify particular desired sets of ad partners.  If set 'false' will run in production mode.
  
You may also download the full project (which builds fine): https://www.dropbox.com/s/k2a1qvni7l1fwom/xamarin-android-chocolate-sample.zip?dl=1

Ad Unit Types and corresponding mediation ad partners supported:

Native Inview (300x250)
  - Chocolate, AdMob, AppLovin, Amazon, Criteo
  
Fullscreen Rewarded Video
  - Chocolate, AdMob, AdColony, AppLovin, Amazon, Criteo, Unity Ads
  
Fullscreen Interstitial
  - Chocolate, AdMob, AdColony, AppLovin, Amazon, Criteo, Unity Ads
 
BUILD INSTRUCTIONS:
If you want to build the project via git clone, you will need to add all package dependencies manually via NuGet package manager in Visual Studio.  This is because the packages directory was not pushed to git since these are mostly binary dll files.

This project is targetted for MonoAndroid 8.1.

IMPORTANT NOTE:  You must install version 60.1142.1 GooglePlayServices packages, since that version is compatable with MonoAndroid 8.1

Then, proceed to add the following packages listed in:

https://github.com/chocolateplatform/xamarin-android-chocolate-sample/blob/master/ChocolateSample/packages.config

You may need to clean and rebuild frequently at first while installing the packages.

