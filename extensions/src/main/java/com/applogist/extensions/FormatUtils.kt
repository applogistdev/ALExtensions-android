package com.applogist.extensions

import android.content.res.Resources
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.text.Normalizer
import java.text.NumberFormat
import java.util.*

/**
 * Show double only with two digit
 * 0.010670731707317074 -> 0.01
 */
fun Double.formatTwoDigit() : String {
    return String.format("%.2f", this)
}

/**
 * Convert px to dp
 */
val Int.dp: Int
    get() = (this / Resources.getSystem().displayMetrics.density).toInt()

/**
 * Convert dp to px
 */
val Int.px: Int
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()

/**
 * Remove all spaces in the String
 */
fun String.trimAll(): String {
    return this.replace("\\s".toRegex(), "")
}

/**
 * Remove all non numeric characters in the String
 */
fun String.removeNonNumeric() : String {
    return this.replace("[^0-9]".toRegex(), "").trimAll()
}

/**
 * To convert turkish text to non turkish
 */
fun String.convertToNonTurkish(locale : Locale = Locale.getDefault()): String {
    val subjectString = Normalizer.normalize(this.toUpperCase(locale), Normalizer.Form.NFD)
    return subjectString.replace("[^\\x00-\\x7F]".toRegex(), "")
}

/**
 * Format with dots
 * 5000 -> 5.000
 * @param dfPattern : Decimal format pattern
 */
fun Double.formatStep(dfPattern : String = "###,###.###", decimalSeparator : Char = '.', groupingSeparator : Char = '.'): String {
    val symbols = DecimalFormatSymbols()
    symbols.decimalSeparator = decimalSeparator
    symbols.groupingSeparator = groupingSeparator

    val dec = DecimalFormat(dfPattern, symbols)
    return dec.format(this)
}

/**
 * Format string for currency
 */
fun String.currencyFormat(locale: Locale = Locale.getDefault()): String? {
    return toDoubleOrNull()?.currencyFormat(locale)
}

/**
 * Format Double for currency
 */
fun Double.currencyFormat(locale: Locale = Locale.getDefault()): String {
    val nf = NumberFormat.getCurrencyInstance(locale)
    val decimalFormatSymbols = (nf as DecimalFormat).decimalFormatSymbols
    decimalFormatSymbols.currencySymbol = ""
    nf.decimalFormatSymbols = decimalFormatSymbols

    return nf.format(this)
}