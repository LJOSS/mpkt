package com.example.mpkt

import android.app.Application
import androidx.room.Room
import com.example.mpkt.db.AppDatabase
import com.example.mpkt.utils.DB_Constants.DATABASE_NAME

class App : Application() {

    companion object {
        lateinit var database: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this, AppDatabase::class.java, DATABASE_NAME)
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
    }
}