package com.applogist.extensions

import android.content.Context
import android.content.pm.PackageManager
import android.util.Log

/*
*  Created by Mustafa Ürgüplüoğlu on 17.02.2020.
*  Copyright © 2020 Mustafa Ürgüplüoğlu. All rights reserved.
*/

fun Context.isAppInstalled(packageName : String): Boolean = try {
    packageManager.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES)
    true
} catch (e: PackageManager.NameNotFoundException) {
    Log.e("PackageUtils", e.toString())
    false
}