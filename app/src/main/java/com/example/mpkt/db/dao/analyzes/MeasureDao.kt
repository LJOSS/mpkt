package com.example.mpkt.db.dao.analyzes

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mpkt.db.entity.analyzes.Measure
import com.example.mpkt.utils.DBConstants.MEASURE_TABLE
import com.example.mpkt.utils.DBConstants.PATIENT_ID

@Dao
interface MeasureDao {

    @Insert
    fun addMeasure(measureDB: Measure)

    @Delete
    fun deleteMeasure(measureDB: Measure)

    @Query("Select * from $MEASURE_TABLE WHERE $PATIENT_ID = :id_in")
    fun getAllMeasuresPatient(id_in: Int): LiveData<List<Measure>>

    @Query("SELECT * FROM $MEASURE_TABLE")
    fun getMeasures(): LiveData<List<Measure>>

    @Query("DELETE FROM $MEASURE_TABLE")
    fun deleteAll()
}