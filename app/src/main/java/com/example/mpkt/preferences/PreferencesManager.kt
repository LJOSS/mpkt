package com.example.mpkt.preferences

import android.content.Context
import android.content.SharedPreferences


class PreferencesManager(context: Context) {
    companion object {
        private const val MP_PREFERENCES = "MP_PREFERENCES"
    }

    private val preferences: SharedPreferences

    init {
        preferences = context.getSharedPreferences(MP_PREFERENCES, 0)
    }

    fun saveInt(key: String, value: Int) =
        preferences.edit().putInt(key, value).apply()

    fun getInt(key: String, defValue: Int = 0) =
        preferences.getInt(key, defValue)

    fun saveFloat(key: String, value: Float) =
        preferences.edit().putFloat(key, value).apply()

    fun getFloat(key: String) =
        preferences.getFloat(key, 0.0f)

    fun saveString(key: String, value: String) =
        preferences.edit().putString(key, value).apply()

    fun getString(key: String): String =
        preferences.getString(key, "")

    fun getBoolean(key: String, defValue: Boolean = true) =
        preferences.getBoolean(key, defValue)

    fun saveBoolean(key: String, value: Boolean) =
        preferences.edit().putBoolean(key, value).apply()

    fun getLong(key: String) =
        preferences.getLong(key, 0L)

    fun saveLong(key: String, value: Long) =
        preferences.edit().putLong(key, value).apply()
}