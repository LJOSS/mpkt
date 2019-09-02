package com.example.mpkt.utils

import android.util.Log
import com.example.mpkt.BuildConfig
import com.example.mpkt.utils.Constants.TAG


fun debugLog(message: String) {
    if (BuildConfig.DEBUG) {
        Log.d(TAG, message)
    }
}