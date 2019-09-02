package com.example.mpkt

import android.app.Application
import androidx.room.Room
import com.example.mpkt.interfaces.NurseController
import com.example.mpkt.controllers.NurseControllerImpl
import com.example.mpkt.controllers.PatientControllerImpl
import com.example.mpkt.db.AppDatabase
import com.example.mpkt.interfaces.PatientController
import com.example.mpkt.preferences.PreferencesManager
import com.example.mpkt.utils.DBConstants.DATABASE_NAME

class App : Application() {

    companion object {

        lateinit var database: AppDatabase
            private set

        lateinit var preferencesManager: PreferencesManager
            private set

        lateinit var nurseController: NurseController
            private set

        lateinit var patientController: PatientController
            private set
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this, AppDatabase::class.java, DATABASE_NAME)
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()

        preferencesManager = PreferencesManager(this)

        nurseController = NurseControllerImpl()
        patientController = PatientControllerImpl()
    }
}