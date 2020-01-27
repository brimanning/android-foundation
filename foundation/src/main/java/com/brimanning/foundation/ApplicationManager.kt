package com.brimanning.foundation

import android.content.Context
import androidx.preference.PreferenceManager

object ApplicationManager {
    fun getApplicationString(context: Context): String? =
        PreferenceManager.getDefaultSharedPreferences(context).getString(FoundationApplication.APPLICATION_STRING, null)
}