package com.example.mpkt.db.dao.analyzes

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mpkt.db.entity.analyzes.Urine
import com.example.mpkt.utils.DBConstants.PATIENT_ID
import com.example.mpkt.utils.DBConstants.URINE_TABLE

@Dao
interface UrineDao {

    @Insert
    fun addUrine(urineDB: Urine)

    @Query("Select * from $URINE_TABLE WHERE $PATIENT_ID = :id_in")
    fun getAllUrinePatient(id_in: Int): LiveData<List<Urine>>

    @Query("SELECT * FROM $URINE_TABLE")
    fun getAllUrine(): LiveData<List<Urine>>

    @Query("DELETE FROM $URINE_TABLE")
    fun deleteAll()
}