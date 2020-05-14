package com.applogist.extensions

/*
*  Created by Mustafa Ürgüplüoğlu on 10.04.2020.
*  Copyright © 2020 Mustafa Ürgüplüoğlu. All rights reserved.
*/

fun ByteArray.bytesToHex(): String {
    val hexArray = charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F')
    val hexChars = CharArray(this.size * 2)
    var v: Int
    for (j in this.indices) {
        v = this[j].toInt() and 0xFF
        hexChars[j * 2] = hexArray[v.ushr(4)]
        hexChars[j * 2 + 1] = hexArray[v and 0x0F]
    }
    return String(hexChars)
}