package com.example.mpkt.db.dao.analyzes


import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mpkt.db.entity.analyzes.Temperature
import com.example.mpkt.utils.DBConstants.PATIENT_ID
import com.example.mpkt.utils.DBConstants.TEMPERATURE_TABLE

@Dao
interface TemperatureDao {

    @Insert
    abstract fun addMeasure(tempDB: Temperature)

    @Query("Select * from $TEMPERATURE_TABLE WHERE $PATIENT_ID = :id_in")
    abstract fun getAllTempPatient(id_in: Int): LiveData<List<Temperature>>

    @Query("Select * from $TEMPERATURE_TABLE")
    abstract fun getAllTemp(): LiveData<List<Temperature>>

    @Query("DELETE FROM $TEMPERATURE_TABLE")
    abstract fun deleteAll()
}