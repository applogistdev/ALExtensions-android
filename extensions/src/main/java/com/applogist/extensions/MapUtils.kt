package com.applogist.extensions

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log

/*
*  Created by Mustafa Ürgüplüoğlu on 17.02.2020.
*  Copyright © 2020 Mustafa Ürgüplüoğlu. All rights reserved.
*/

const val YANDEX_NAVI_PACKAGENAME = "ru.yandex.yandexnavi"
const val YANDEX_MAPS_PACKAGENAME = "ru.yandex.yandexmaps"
const val GOOGLE_MAPS_PACKAGENAME = "com.google.android.apps.maps"

fun Context.openYandexNavi(latitude: Double, longitude: Double, showJams:Boolean = true): Boolean = try {
    val intent = Intent("ru.yandex.yandexnavi.action.BUILD_ROUTE_ON_MAP")
    intent.setPackage(YANDEX_NAVI_PACKAGENAME)
    intent.putExtra("lat_to", latitude)
    intent.putExtra("lon_to", longitude)
    if(showJams){
        intent.putExtra("show_jams", 1)
    }
    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
    startActivity(intent)
    true
}catch (e : ActivityNotFoundException){
    Log.e("MapUtils", e.toString())
    false
}

fun Context.openYandexMaps(latitude: Double, longitude: Double, showJams:Boolean = true): Boolean = try {
    val intent = Intent("ru.yandex.yandexmaps.action.BUILD_ROUTE_ON_MAP")
    intent.setPackage(YANDEX_MAPS_PACKAGENAME)
    intent.putExtra("lat_to", latitude)
    intent.putExtra("lon_to", longitude)
    if(showJams){
        intent.putExtra("show_jams", 1)
    }
    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
    startActivity(intent)
    true
}catch (e : ActivityNotFoundException){
    Log.e("MapUtils", e.toString())
    false
}

fun Context.openGoogleMaps(latitude: Double, longitude: Double): Boolean = try {
    val gmmIntentUri = Uri.parse("google.navigation:q=${latitude},${longitude}")
    val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
    mapIntent.setPackage(GOOGLE_MAPS_PACKAGENAME)
    startActivity(mapIntent)
    true
} catch (e: ActivityNotFoundException) {
    Log.e("MapUtils", e.toString())
    false
}