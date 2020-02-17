package com.applogist.extensions_sample

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.applogist.extensions.openPhoneDialer

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.applogist.extensions_sample", appContext.packageName)
    }

    @Test
    fun openPhoneDialer() {
        val phoneNumber = "05070000000"
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertTrue(appContext.openPhoneDialer(phoneNumber))
    }
}
