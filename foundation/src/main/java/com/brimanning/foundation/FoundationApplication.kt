package com.brimanning.foundation

import android.app.Application
import androidx.preference.PreferenceManager

open class FoundationApplication(private val applicationString: String): Application() {
    override fun onCreate() {
        super.onCreate()
        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        prefs.edit().putString(APPLICATION_STRING, applicationString).apply()
    }

    companion object {
        const val APPLICATION_STRING = "APPLICATION_STRING"
    }
}