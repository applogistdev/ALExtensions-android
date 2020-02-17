package com.applogist.extensions

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.util.Log

/*
*  Created by Mustafa Ürgüplüoğlu on 17.02.2020.
*  Copyright © 2020 Mustafa Ürgüplüoğlu. All rights reserved.
*/

fun Context.openYandexNavi(latitude: Double, longitude: Double, showJams:Boolean = true): Boolean = try {
    val intent = Intent("ru.yandex.yandexnavi.action.BUILD_ROUTE_ON_MAP")
    intent.setPackage("ru.yandex.yandexnavi")
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