package com.example.mpkt.db.dao.analyzes

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mpkt.db.entity.analyzes.Urine
import com.example.mpkt.utils.DB_Constants.PATIENT_ID
import com.example.mpkt.utils.DB_Constants.URINE_TABLE

@Dao
interface UrineDao {

    @Insert
    fun addUrine(urineDB: Urine)

    @Query("Select * from $URINE_TABLE WHERE $PATIENT_ID = :id_in")
    fun getAllUrinePatients(id_in: Int): LiveData<List<Urine>>

    @Query("SELECT * FROM $URINE_TABLE")
    fun getAllUrine(): LiveData<List<Urine>>

    @Query("DELETE FROM $URINE_TABLE")
    fun deleteAll()
}