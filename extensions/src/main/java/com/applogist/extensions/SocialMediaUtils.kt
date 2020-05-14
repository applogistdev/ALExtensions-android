package com.applogist.extensions

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log

/*
*  Created by Mustafa Ürgüplüoğlu on 17.02.2020.
*  Copyright © 2020 Mustafa Ürgüplüoğlu. All rights reserved.
*/

/**
 * @param pageId Facebook page id
 * @return true if Facebook app found
 */
fun Context.openFacebookPage(facebookPageID : String): Boolean {
    val facebookUrl = "https://www.facebook.com/$facebookPageID"
    val facebookUrlScheme = "fb://page/$facebookPageID"
    try {
        val versionCode = packageManager.getPackageInfo("com.facebook.katana", 0).versionCode
        if (versionCode >= 3002850) {
            val uri = Uri.parse("fb://facewebmodal/f?href=$facebookUrl")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        } else {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrlScheme))
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
        return true
    } catch (e: Exception) {
        Log.e("SocialMediaUtils", e.toString())
    }

    return false
}

/**
 * @param userId Instagram user id
 * @return true if Instagram app found
 */
fun Context.openInstagram(userId : String): Boolean = try {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/_u/${userId}"))
    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
    startActivity(intent)
    true
}catch (e : Exception){
    Log.e("SocialMediaUtils", e.toString())
    false
}

/**
 * @param channelId Youtube channel id
 * @return true if Youtube app found
 */
fun Context.openYoutube(channelId : String): Boolean = try {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/${channelId}"))
    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
    startActivity(intent)
    true
}catch (e : Exception){
    Log.e("SocialMediaUtils", e.toString())
    false
}

/**
 * @param userId Twitter user id
 * @return true if Twitter app found
 */
fun Context.openTwitter(userId : String): Boolean = try {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?user_id=${userId}"))
    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
    startActivity(intent)
    true
}catch (e : Exception){
    Log.e("SocialMediaUtils", e.toString())
    false
}