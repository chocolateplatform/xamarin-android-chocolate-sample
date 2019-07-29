Chocolate Sample
=================

This sample demonstrates how to display different types of ads using Chocolate Mediation Ads SDK.
It also dislays an AdMob 320x50 banner ad (not part of the Chocolate sdk).

See MainActivity.cs
  - DO_ENABLE_TEST_ADS: initially set to 'false'.  If set 'true', you can specify particular desired sets of ad partners.

Ad Unit Types and corresponding mediation ad partners supported:

Native Inview (300x250)
  - Chocolate, AdMob, AppLovin, Amazon, Criteo
  
Fullscreen Rewarded Video
  - Chocolate, AdMob, AdColony, AppLovin, Amazon, Criteo, Unity Ads
  
Fullscreen Interstitial
  - Chocolate, AdMob, AdColony, AppLovin, Amazon, Criteo, Unity Ads
  
All dependencies are NuGet packages, including all Chocolate related packages.  Android and GooglePlayServices packages, including the GooglePlayServices ads packages, are also all NuGet packages.

All Chocolate packages have been built targeting MonoAndroid 8.1

- To get everything to build, you will need to remove the packages and re-add them via NuGet, one by one, including Android Support v4 and v7 App Compat version (28.0.0.1)  Re-build all.

  If you are targeting MonoAndroid 8.1, do not install GooglePlayServices higher than 60.1142.1
  
  package id="Xamarin.GooglePlayServices.Ads" version="60.1142.1" targetFramework="monoandroid81" 
  package id="Xamarin.GooglePlayServices.Ads.Lite" version="60.1142.1" targetFramework="monoandroid81"
  package id="Xamarin.GooglePlayServices.Base" version="60.1142.1" targetFramework="monoandroid81" 
  package id="Xamarin.GooglePlayServices.Basement" version="60.1142.1" targetFramework="monoandroid81" 
  package id="Xamarin.GooglePlayServices.Clearcut" version="60.1142.0" targetFramework="monoandroid81" 
  package id="Xamarin.GooglePlayServices.Gass" version="60.1142.1" targetFramework="monoandroid81" 
  package id="Xamarin.GooglePlayServices.Tasks" version="60.1142.1" targetFramework="monoandroid81" 
  
  Chocolate packages:
  package id="xam.android.chocolate_adcolony_adapter" version="1.0.1" targetFramework="monoandroid81" 
  package id="xam.android.chocolate_ads_admob_adapter" version="1.0.1" targetFramework="monoandroid81" 
  package id="xam.android.chocolate_amazon_adapter" version="1.0.2" targetFramework="monoandroid81" 
  package id="xam.android.chocolate_applovin_adapter" version="1.0.1" targetFramework="monoandroid81" 
  package id="xam.android.chocolate_criteo_adapter" version="1.0.1" targetFramework="monoandroid81" 
  package id="xam.android.chocolate_sdk_core" version="2.8.7" targetFramework="monoandroid81" 
  package id="xam.android.chocolate_unityads_adapter" version="1.0.1" targetFramework="monoandroid81" 

