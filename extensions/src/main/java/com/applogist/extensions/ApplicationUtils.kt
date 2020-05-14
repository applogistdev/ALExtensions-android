package com.applogist.extensions

import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.util.Log
import java.security.MessageDigest

/*
*  Created by Mustafa Ürgüplüoğlu on 10.04.2020.
*  Copyright © 2020 Mustafa Ürgüplüoğlu. All rights reserved.
*/

fun Context.getApplicationSignature(packageName: String, type : String = "SHA256"): List<String> {
    val signatureList: List<String>
    try {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            // New signature
            val sig = packageManager.getPackageInfo(packageName, PackageManager.GET_SIGNING_CERTIFICATES).signingInfo
            signatureList = if (sig.hasMultipleSigners()) {
                // Send all with apkContentsSigners
                sig.apkContentsSigners.map {
                    val digest = MessageDigest.getInstance(type)
                    digest.update(it.toByteArray())
                    digest.digest().bytesToHex()
                }
            } else {
                // Send one with signingCertificateHistory
                sig.signingCertificateHistory.map {
                    val digest = MessageDigest.getInstance(type)
                    digest.update(it.toByteArray())
                    digest.digest().bytesToHex()
                }
            }
        } else {
            val sig = packageManager.getPackageInfo(packageName, PackageManager.GET_SIGNATURES).signatures
            signatureList = sig.map {
                val digest = MessageDigest.getInstance(type)
                digest.update(it.toByteArray())
                digest.digest().bytesToHex()
            }
        }

        return signatureList
    } catch (e: Exception) {
        Log.e("ApplicationUtils", e.toString())
    }
    return emptyList()
}