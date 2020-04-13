
  
# Extensions  
  
## Installation  
[![](https://jitpack.io/v/applogistdev/ALExtensions-android.svg)](https://jitpack.io/#applogistdev/ALExtensions-android)  
```gradle  
allprojects {  
 repositories { ... maven { url 'https://jitpack.io' } }}  
  
dependencies {  
 implementation 'com.github.applogistdev:ALExtensions-android:lastVersion'}  
```  
## Extensions

  ## [ActivityUtils](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/ActivityUtils.kt)  
| function | description |
|--|--|
|[startActivityModal](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/ActivityUtils.kt#L14)|Open a new activity from bottom with animation|  
|[startActivityModalWithResult](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/ActivityUtils.kt#L19)|Open a new activity from bottom with animation| 
|[startActivityFromRight](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/ActivityUtils.kt#L27)|Open a new activity from right with animation|  
|[startActivityFromRightWithResult](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/ActivityUtils.kt#L32)|Open a new activity from right with animation| 
|[slideOutRight](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/ActivityUtils.kt#L40)|Close activity with animation| 
|[slideOutModal](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/ActivityUtils.kt#L44)|Close activity with reverse modal animaton| 
|[reloadActivity](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/ActivityUtils.kt#L48)|Reload activity instantly without animaton| 
|[share](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/ActivityUtils.kt#L58)|Open a share intent for given type parameters| 
|[showAlertDialog](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/ActivityUtils.kt#L70)|DSL for showing Alert Dialog| 

 ## [BitmapUtils](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/BitmapUtils.kt)  
| function | description |
|--|--|
|[rotateBitmap](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/BitmapUtils.kt#L12)|Rotate bitmap| 
|[getBytes](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/BitmapUtils.kt#L50)|Return bytes of bitmap| 
|[convertBase64](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/BitmapUtils.kt#L59)|Convert Bitmap to Base64 String| 


 ## [DateUtils](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/DateUtils.kt)  
| function | description |
|--|--|
|[formatDate](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/DateUtils.kt#L12)|Format string with given coming and sending date format or date format patterns| 
|[convertDateToCalendar](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/DateUtils.kt#L46)|Convert date string to calendar object with given date format or date format pattern| 
|[convertToMillis](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/DateUtils.kt#L87)|Convert date string to millis with given date format or date format pattern| 
|[convertDate](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/DateUtils.kt#L103)|Convert millis to date string with given date format or date format pattern| 

  ## [FileUtils](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/FileUtils.kt)  
| function | description |
|--|--|
|[getOrientation](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/FileUtils.kt#L10)|Get orientation of image file| 

  ## [FormatUtils](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/FormatUtils.kt)  
| function | description |
|--|--|
|[formatTwoDigit](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/FormatUtils.kt#L14)|Show double only with two digit| 
|[dp](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/FormatUtils.kt#L21)|Convert px to dp| 
|[px](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/FormatUtils.kt#L27)|Convert dp to px| 
|[trimAll](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/FormatUtils.kt#L33)|Remove all spaces in the string| 
|[removeNonNumeric](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/FormatUtils.kt#L40)|Remove all non numeric characters in the string| 
|[convertToNonTurkish](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/FormatUtils.kt#L47)|Convert turkish text to non turkish| 
|[currencyFormat](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/FormatUtils.kt#L69)|Convert to currency format| 

  ## [MapUtils](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/MapUtils.kt)  
  
| function | description |
|--|--|
|[openYandexNavi](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/MapUtils.kt#L19)|Open yandex navigation app| 
|[openYandexMaps](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/MapUtils.kt#L35)|Open yandex map| 
|[openGoogleMaps](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/MapUtils.kt#L51)|Open google maps| 
|[openMapAppsChooser](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/MapUtils.kt#L62)|Open map app choser intent| 

  ## [PackageUtils](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/PackageUtils.kt)  

| function | description |
|--|--|
|[isAppInstalled](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/PackageUtils.kt#L15)|Use package name to find is app installed|  
|[openGooglePlayStore](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/PackageUtils.kt#L23)|Open Google Play Market, parameter tryWithWebView if fail open with browser|  

 ## [PhoneUtils](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/PhoneUtils.kt)  
  
| function | description |
|--|--|
|[openPhoneDialer](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/PhoneUtils.kt#L18)|Open default dialer with phone number|  



  ## [SocialMediaUtils](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/SocialMediaUtils.kt)  
  
  | function | description |
|--|--|
|[openFacebookPage](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/SocialMediaUtils.kt#L18)|Open facebook page with Facebook Page Id|
|[openInstagram](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/SocialMediaUtils.kt#L45)|Open Instagrem with User Id|
|[openYoutube](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/SocialMediaUtils.kt#L59)|Open Youtube with Channel Id|
|[openTwitter](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/SocialMediaUtils.kt#L73)|Open Twitter with User Id|

  ## [ViewUtils](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/ViewUtils.kt)  
  
| function | description |
|--|--|
|[setGone](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/ViewUtils.kt#L16)|Set view status to gone|
|[setVisible](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/ViewUtils.kt#L20)|Set view status to visible|
|[setInvisible](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/ViewUtils.kt#L24)|Set view status to invisible|
|[setOnSingleClickListener](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/ViewUtils.kt#L33)|Prevents double view click action|
|[setHtmlText](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/ViewUtils.kt#L47)|Set HTML text to TextView|
|[setTextColorRes](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/extensions/ViewUtils.kt#L57)|Change text color of TextView|

## Helpers
  ## [Common](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/helpers/Common.kt)  
  
| function | description |
|--|--|
|[isTimePassed](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/helpers/Common.kt#L12)|Check time difference between current time and given time|
|[getMarketUrl](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/helpers/Common.kt#L36)|Get Google Play Market URL|

  ## [SingleLiveEvent](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/helpers/SingleLiveEvent.kt)  
  Notify only observer once
  
  ## [Resource](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/helpers/Resource.kt)  
 A generic class that holds a value with its loading status.
 
   ## [SnapOnScrollListener](https://github.com/applogistdev/ALExtensions-android/blob/master/extensions/src/main/java/com/applogist/helpers/SnapOnScrollListener.kt)  
Helper class for detecting snap position changes
  
