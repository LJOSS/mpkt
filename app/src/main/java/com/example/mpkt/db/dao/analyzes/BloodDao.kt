package com.example.mpkt.db.dao.analyzes

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mpkt.db.entity.analyzes.Blood
import com.example.mpkt.utils.DB_Constants.BLOOD_TABLE
import com.example.mpkt.utils.DB_Constants.PATIENT_ID

@Dao
interface BloodDao {

    @Insert
    fun addMeasure(bloodDB: Blood)

    @Query("Select * from $BLOOD_TABLE WHERE $PATIENT_ID = :id_in")
    fun getAllBloodPatients(id_in: Int): LiveData<List<Blood>>

    @Query("Select * from $BLOOD_TABLE")
    fun getAllBlood(): LiveData<List<Blood>>

    @Query("DELETE FROM $BLOOD_TABLE")
    fun deleteAll()
}