package com.applogist.extensions

import java.util.regex.Pattern

/*
*  Created by Mustafa Ürgüplüoğlu on 14.05.2020.
*  Copyright © 2020 Mustafa Ürgüplüoğlu. All rights reserved.
*/

const val REGEX_TURKISH_MOBILE = "^[0]?((5[0-9][0-9]))\\d{7}\$"

/**
 * Check phone number is valid Turkish mobile phone number
 * @param phoneNumber Any string
 * @return true if valid
 */
fun isTurkishMobileNumber(phoneNumber: String?) : Boolean{
    return !phoneNumber.isNullOrEmpty() && Pattern.matches(REGEX_TURKISH_MOBILE, phoneNumber)
}