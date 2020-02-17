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

/**
 * This shows a UI with the number being dialed, allowing the user to explicitly initiate the call.
 * @return false if exception exist
 */
fun Context.openPhoneDialer(phoneNumber: String): Boolean = try {
    val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null))
    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
    startActivity(intent)
    true
}catch (e : ActivityNotFoundException){
    Log.e("PhoneUtils", e.toString())
    false
}