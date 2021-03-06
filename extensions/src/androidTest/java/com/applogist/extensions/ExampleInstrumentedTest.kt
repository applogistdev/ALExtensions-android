package com.applogist.extensions

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

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
        assertEquals("com.applogist.extensions.test", appContext.packageName)
    }

    @Test
    fun mapChooser(){
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        appContext.openMapAppsChooser(40.9889026,28.7943153, locationName = "Turkeyana Clinic")
    }
}
