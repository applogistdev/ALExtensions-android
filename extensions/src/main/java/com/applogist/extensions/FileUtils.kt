package com.applogist.extensions

import androidx.exifinterface.media.ExifInterface
import java.io.File
import java.io.IOException

/**
 * Get Orientation of Image File
 */
fun File.getOrientation() : Int {
    var exif: ExifInterface? = null
    try {
        exif = ExifInterface(this.path)
    } catch (e: IOException) {
        e.printStackTrace()
    }

    return exif?.getAttributeInt(
        ExifInterface.TAG_ORIENTATION,
        ExifInterface.ORIENTATION_UNDEFINED
    ) ?: ExifInterface.ORIENTATION_NORMAL
}