package com.applogist.extensions

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

/**
 * Format String with given coming and sending date format
 * @param comingDateFormat : Current Date format of String
 * @param sendingDateFormat : Desired Date format for String
 */
fun String.formatDate(comingDateFormat: SimpleDateFormat, sendingDateFormat: SimpleDateFormat = comingDateFormat): String? {
    val date: Date?
    try {
        date = comingDateFormat.parse(this)
    } catch (e: ParseException) {
        e.printStackTrace()
        return null
    }
    date?.let {  return sendingDateFormat.format(it) } ?: return null
}

/**
 * Format String with given coming and sending date format patterns
 * @param comingDatePattern : Current date format pattern
 * @param sendingDatePattern : Desired date format pattern
 */
fun String.formatDate(comingDatePattern : String, sendingDatePattern : String = comingDatePattern, locale : Locale = Locale.getDefault()): String? {
    val comingDateFormat = SimpleDateFormat(comingDatePattern, locale)
    val date: Date?
    try {
        date = comingDateFormat.parse(this)
    } catch (e: ParseException) {
        e.printStackTrace()
        return null
    }

    val sendingDateFormat = SimpleDateFormat(sendingDatePattern, locale)
    date?.let {  return sendingDateFormat.format(it) } ?: return null
}

/**
 * Convert date to Calendar
 * @param comingDateFormat : Current date format of String
 */
fun String.convertDateToCalendar(comingDateFormat: SimpleDateFormat) : Calendar? {
    val date: Date?
    try {
        date = comingDateFormat.parse(this)
    } catch (e: ParseException) {
        e.printStackTrace()
        return null
    }

    date?.let {
        val cal = Calendar.getInstance()
        cal.time = date
        return cal
    } ?: return null
}

/**
 * Convert date to Calendar
 * @param sendingDatePattern : Current date format pattern
 */
fun String.convertDateToCalendar(sendingDatePattern : String, locale : Locale = Locale.getDefault()) : Calendar? {
    val comingDateFormat = SimpleDateFormat(sendingDatePattern, locale)
    val date: Date?
    try {
        date = comingDateFormat.parse(this)
    } catch (e: ParseException) {
        e.printStackTrace()
        return null
    }

    date?.let {
        val cal = Calendar.getInstance()
        cal.time = date
        return cal
    } ?: return null
}

/**
 * Convert date to millis
 * @param comingDateFormat : Current date format of String
 */
fun String.convertToMillis(comingDateFormat: SimpleDateFormat) : Long? {
    return this.convertDateToCalendar(comingDateFormat)?.timeInMillis
}

/**
 * Convert date to to Millis
 * @param sendingDatePattern : Current date format pattern
 */
fun String.convertToMillis(sendingDatePattern : String, locale : Locale = Locale.getDefault()) : Long? {
    return this.convertDateToCalendar(sendingDatePattern, locale)?.timeInMillis
}

/**
 * Convert long millis to date
 * @param dateFormat : Desired date format
 */
fun Long.convertDate(dateFormat: SimpleDateFormat): String? {
    val date: Date?
    try {
        date = Date(this)
    } catch (e: ParseException) {
        e.printStackTrace()
        return null
    }
    return dateFormat.format(date)
}

/**
 * Convert long millis to date
 * @param dateFormatPattern : Desired date format pattern
 */
fun Long.convertDate(dateFormatPattern: String, locale : Locale = Locale.getDefault()): String? {
    val comingDateFormat = SimpleDateFormat(dateFormatPattern, locale)
    val date: Date?
    try {
        date = Date(this)
    } catch (e: ParseException) {
        e.printStackTrace()
        return null
    }
    return comingDateFormat.format(date)
}