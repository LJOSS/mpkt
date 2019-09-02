package com.example.mpkt

import android.app.Application
import com.example.mpkt.db.AppDatabase

class App : Application() {

    companion object {
        lateinit var database: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()

    }
}