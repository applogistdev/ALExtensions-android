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
fun Context.openFacebookPage(pageId : String): Boolean = try {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/${pageId}"))
    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
    startActivity(intent)
    true
}catch (e : Exception){
    Log.e("SocialMediaUtils", e.toString())
    false
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