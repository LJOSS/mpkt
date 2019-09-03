package com.example.mpkt

import android.app.Application
import androidx.room.Room
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.mpkt.controllers.*
import com.example.mpkt.db.AppDatabase
import com.example.mpkt.db.dao.NurseDao
import com.example.mpkt.interfaces.*
import com.example.mpkt.preferences.PreferencesManager
import com.example.mpkt.utils.DBConstants.DATABASE_NAME
import com.example.mpkt.utils.DBConstants.DATABASE_VERSION_1
import com.example.mpkt.utils.DBConstants.DATABASE_VERSION_2

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

        lateinit var nursePersonController: NPController
            private set

        lateinit var bloodController: BloodController
            private set

        lateinit var temperatureController: TemperatureController
            private set

        lateinit var urineController: UrineController
            private set

        lateinit var measureController: MeasureController
            private set

        lateinit var downloadController: DownloadController
            private set

        lateinit var uploadController: UploadController
            private set

        lateinit var instance: App
            private set

        private val MIGRATION_1_2 = object : Migration(DATABASE_VERSION_1, DATABASE_VERSION_2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL(NurseDao.DELETE_PATIENTS)
            }
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        database = Room.databaseBuilder(this, AppDatabase::class.java, DATABASE_NAME)
            .addMigrations(MIGRATION_1_2)
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()

        preferencesManager = PreferencesManager(this)

        initControllers()
    }

    private fun initControllers() {
        downloadController = DownloadControllerImpl()
        uploadController = UploadControllerImpl()
        nurseController = NurseControllerImpl()
        patientController = PatientControllerImpl()
        nursePersonController = NPControllerImpl()
        analyzesControllers()
    }

    private fun analyzesControllers() {
        temperatureController = TemperatureControllerImpl()
        urineController = UrineControllerImpl()
        bloodController = BloodControllerImpl()
        measureController = MeasureControllerImpl()
    }
}