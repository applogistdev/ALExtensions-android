package com.applogist.helpers

import java.util.*
import java.util.concurrent.TimeUnit

/**
 * Check time difference between current time and given time
 * @param lastTime = Given time in millis format
 * @param isMinutes = different should be minutes or hour
 * @param checkTime = amount of time difference
 */
fun isTimePassed(lastTime : Long, isMinutes : Boolean = false, checkTime : Int = 8) : Boolean {

    val cal = Calendar.getInstance()
    val currentTime = cal.timeInMillis

    val difference = currentTime - lastTime

    val minutes = TimeUnit.MILLISECONDS.toMinutes(difference)
    val hours = TimeUnit.MILLISECONDS.toHours(difference)

    return when (isMinutes) {
        true -> {
            minutes >= checkTime
        }
        false -> {
            hours >= checkTime
        }
    }

}

/**
 * Get Google Play Market URL
 */
fun getMarketUrl(packageName : String) : String {
    return "https://play.google.com/store/apps/details?id=$packageName"
}