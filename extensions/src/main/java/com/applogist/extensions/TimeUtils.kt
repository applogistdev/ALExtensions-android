package com.applogist.extensions

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

/*
*  Created by Mustafa Ürgüplüoğlu on 24.02.2020.
*  Copyright © 2020 Mustafa Ürgüplüoğlu. All rights reserved.
*/

/**
 * @param pattern the pattern describing the date and time format
 * @param locale the locale whose date format symbols should be used
 * @param ifNull if you give null, when error happened
 * function return null otherwise return today date
 */
fun String.toDate(
    pattern: String,
    locale: Locale = Locale.getDefault(),
    ifNull: Date? = Date()
): Date? {
    val format = SimpleDateFormat(pattern, locale)
    return try {
        format.parse(this) ?: ifNull
    } catch (e: ParseException) {
        e.printStackTrace()
        ifNull
    }
}