package com.tanyayuferova.franklin.data.sharedpreferences

import android.content.SharedPreferences

/**
 * Author: Tanya Yuferova
 * Date: 7/8/19
 */
class PreferencesChangeListener<T>(
    private val key: String,
    private val onChanged: (newValue: T) -> Unit = {}
) : SharedPreferences.OnSharedPreferenceChangeListener {
    override fun onSharedPreferenceChanged(preferences: SharedPreferences, key: String) {
        if (key == this.key) {
            onChanged.invoke(preferences.all[key] as T)
        }
    }
}