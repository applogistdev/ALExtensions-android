package com.applogist.extensions

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat

/*
*  Created by Mustafa Ürgüplüoğlu on 18.02.2020.
*  Copyright © 2020 Mustafa Ürgüplüoğlu. All rights reserved.
*/


fun View.setGone(){
    this.visibility  = View.GONE
}

fun View.setVisible(){
    this.visibility  = View.VISIBLE
}

fun View.setInvisible(){
    this.visibility  = View.INVISIBLE
}

/**
 * Prevents double view click action
 * @param waitMillis waiting time for consume next click
 * @param func method that runs after click action
 */
fun View.setOnSingleClickListener( waitMillis : Long = 1000, func : (v : View) -> Unit) {
    var lastClickTime = 0L
    setOnClickListener { view ->
        if (System.currentTimeMillis() > lastClickTime + waitMillis) {
            func.invoke(view)
            lastClickTime = System.currentTimeMillis()
        }
    }
}

/**
 * Set HTML text
 * @param text html text string
 */
fun TextView.setHtmlText(text : String) {
    this.text = HtmlCompat.fromHtml(text, HtmlCompat.FROM_HTML_MODE_LEGACY)
}

internal fun Context.getColorCompat(@ColorRes color: Int) = ContextCompat.getColor(this, color)

/**
 * Change text color of TextView
 * @params resId of color
 */
fun TextView.setTextColorRes(@ColorRes color: Int) = setTextColor(context.getColorCompat(color))

/**
 * Change margins of the view
 * Values will be converted to dp inside
 */
fun View.setMargin(leftMargin: Int = -1, topMargin : Int = -1, rightMargin : Int = -1, bottomMargin : Int = -1) {
    val params = layoutParams as ViewGroup.MarginLayoutParams
    params.setMargins(
        if (leftMargin == -1) params.leftMargin else leftMargin.px,
        if (topMargin == -1) params.topMargin else topMargin.px,
        if (rightMargin == -1) params.rightMargin else rightMargin.px,
        if (bottomMargin == -1) params.bottomMargin else bottomMargin.px)
    layoutParams = params
}