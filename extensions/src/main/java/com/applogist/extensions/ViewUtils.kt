package com.applogist.extensions

import android.view.View

/*
*  Created by Mustafa Ürgüplüoğlu on 18.02.2020.
*  Copyright © 2020 Mustafa Ürgüplüoğlu. All rights reserved.
*/


fun View.setGone(){
    this.visibility  == View.GONE
}

fun View.setVisible(){
    this.visibility  == View.VISIBLE
}

fun View.setInvisible(){
    this.visibility  == View.INVISIBLE
}