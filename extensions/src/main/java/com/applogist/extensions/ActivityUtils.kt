package com.applogist.extensions


import android.app.Activity
import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.annotation.StyleRes
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.app.ShareCompat

fun Activity.startActivityModal(intent : Intent) {
    val options = ActivityOptions.makeCustomAnimation(this, R.anim.slide_bottom_in, R.anim.slide_none)
    this.startActivity(intent, options.toBundle())
}

fun Activity.startActivityModalWithResult(intent: Intent, requestCode : Int) {
    val options = ActivityOptions.makeCustomAnimation(this, R.anim.slide_bottom_in, R.anim.slide_none)
    if (Build.VERSION.SDK_INT >= 21)
        this.startActivityForResult(intent, requestCode, options.toBundle())
    else
        ActivityCompat.startActivityForResult(this, intent, requestCode, options.toBundle())
}

fun Activity.startActivityFromRight(intent: Intent) {
    val options = ActivityOptions.makeCustomAnimation(this, R.anim.slide_in_right, R.anim.slide_out_left)
    this.startActivity(intent, options.toBundle())
}

fun Activity.startActivityFromRightWithResult(intent: Intent, requestCode: Int) {
    val options = ActivityOptions.makeCustomAnimation(this, R.anim.slide_in_right, R.anim.slide_out_left)
    if (Build.VERSION.SDK_INT >= 21)
        this.startActivityForResult(intent, requestCode, options.toBundle())
    else
        ActivityCompat.startActivityForResult(this, intent, requestCode, options.toBundle())
}

fun Activity.slideOutRight() {
    this.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
}

fun Activity.slideOutModal() {
    this.overridePendingTransition(R.anim.slide_none, R.anim.slide_bottom_out)
}

fun Activity.reloadActivity() {
    finish()
    overridePendingTransition(0, 0)
    startActivity(intent)
    overridePendingTransition(0, 0)
}

/**
 * Share app link
 */
fun Activity.share(chooserTitle : String, text : String, type : String = "text/plain") {
    ShareCompat.IntentBuilder.from(this)
        .setType(type)
        .setChooserTitle(chooserTitle)
        .setText(text)
        .startChooser()
}

//region Alert Dialog
/**
 * Alert Dialog
 */
fun Context.showAlertDialog(@StyleRes themeResId : Int? = null, cancelable: Boolean = false, cancelableTouchOutside: Boolean = false, builderFunction: AlertDialog.Builder.() -> Any) {

    val builder = if (themeResId == null) {
        AlertDialog.Builder(this)
    } else {
        AlertDialog.Builder(this, themeResId)
    }

    builder.builderFunction()
    val dialog = builder.create()

    dialog.setCancelable(cancelable)
    dialog.setCanceledOnTouchOutside(cancelableTouchOutside)
    dialog.show()
}

fun AlertDialog.Builder.positiveButton(text: String = "OK", handleClick: (i: Int) -> Unit = {}) {
    this.setPositiveButton(text) { _, i -> handleClick(i) }
}

fun AlertDialog.Builder.negativeButton(text: String = "CANCEL", handleClick: (i: Int) -> Unit = {}) {
    this.setNegativeButton(text) { _, i -> handleClick(i) }
}

fun AlertDialog.Builder.neutralButton(text: String, handleClick: (i: Int) -> Unit = {}) {
    this.setNeutralButton(text) { _, i -> handleClick(i) }
}
//endregion