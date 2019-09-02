package com.example.mpkt.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mpkt.db.dao.NPDao
import com.example.mpkt.db.dao.NurseDao
import com.example.mpkt.db.dao.PatientDao
import com.example.mpkt.db.dao.analyzes.BloodDao
import com.example.mpkt.db.dao.analyzes.MeasureDao
import com.example.mpkt.db.dao.analyzes.TemperatureDao
import com.example.mpkt.db.dao.analyzes.UrineDao
import com.example.mpkt.db.entity.NP
import com.example.mpkt.db.entity.Nurse
import com.example.mpkt.db.entity.Patient
import com.example.mpkt.db.entity.analyzes.Blood
import com.example.mpkt.db.entity.analyzes.Measure
import com.example.mpkt.db.entity.analyzes.Temperature
import com.example.mpkt.db.entity.analyzes.Urine
import com.example.mpkt.utils.DB_Constants.CURRENT_DB_VERSION

@Database(entities = [(Blood::class),
        (Temperature::class),
        (Measure::class),
        (Urine::class),
        (NP::class),
        (Nurse::class),
        (Patient::class)],
    version = CURRENT_DB_VERSION, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getBloodDao(): BloodDao
    abstract fun getTemperatureDao(): TemperatureDao
    abstract fun getUrineDao(): UrineDao
    abstract fun getMeasureDao(): MeasureDao

    abstract fun getNUDao(): NPDao
    abstract fun getNurseDao(): NurseDao
    abstract fun getPatientDao(): PatientDao
}