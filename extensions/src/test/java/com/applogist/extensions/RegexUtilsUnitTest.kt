package com.applogist.extensions

import org.junit.Assert
import org.junit.Test

/*
*  Created by Mustafa Ürgüplüoğlu on 14.05.2020.
*  Copyright © 2020 Mustafa Ürgüplüoğlu. All rights reserved.
*/

class RegexUtilsUnitTest {

    @Test
    fun isTurkishMobileNumberTest() {
        //Turkcell, Vodafone, Turk Telekom
        val numberPrefixes = arrayListOf(
            "530", "531", "532", "533", "534", "535", "536", "537", "538", "539", "561",
            "540", "541", "542", "543", "544", "545", "546", "547", "548", "549",
            "500", "501", "502", "503", "504", "505", "506", "507", "508", "509", "550", "551", "552", "553", "554", "555", "556", "557", "558", "559"
        )
        val numberSuffix = "2103350"

        numberPrefixes.forEach {
            val number = "$it$numberSuffix"
            println("$number - ${number.isTurkishMobileNumber()}")

            Assert.assertTrue(number.isTurkishMobileNumber())
        }
    }

    @Test
    fun isTurkishMobileNumberTestWithZero() {
        //Turkcell, Vodafone, Turk Telekom
        val numberPrefixes = arrayListOf(
            "530", "531", "532", "533", "534", "535", "536", "537", "538", "539", "561",
            "540", "541", "542", "543", "544", "545", "546", "547", "548", "549",
            "500", "501", "502", "503", "504", "505", "506", "507", "508", "509", "550", "551", "552", "553", "554", "555", "556", "557", "558", "559"
        )
        val numberSuffix = "2103350"

        numberPrefixes.forEach {
            val number = "0$it$numberSuffix"
            println("$number - ${number.isTurkishMobileNumber()}")

            Assert.assertTrue(number.isTurkishMobileNumber())
        }
    }

    @Test
    fun isTurkishMobileNumberFailTest() {
        val numberPrefixes = arrayListOf(
            "262", "444", "123", "216",
            "0262", "0444", "0123", "0216"
        )
        val numberSuffix = "2103350"

        numberPrefixes.forEach {
            val number = "$it$numberSuffix"
            println("$number - ${number.isTurkishMobileNumber()}")

            Assert.assertFalse(number.isTurkishMobileNumber())
        }
    }
}