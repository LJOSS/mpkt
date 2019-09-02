package com.example.mpkt.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mpkt.db.entity.Nurse
import com.example.mpkt.utils.DB_Constants.NURSE_ID
import com.example.mpkt.utils.DB_Constants.NURSE_TABLE

@Dao
interface NurseDao {

    @Update
    fun updateNurse(nurseDB: Nurse)

    @Insert
    fun addNurse(nurseDB: Nurse)

    @Delete
    fun deleteNurse(nurseDB: Nurse)

    @Query("SELECT * FROM $NURSE_TABLE")
    fun getAllNurse(): LiveData<List<Nurse>>

    @Query("Select * FROM $NURSE_TABLE WHERE $NURSE_ID= :id")
    fun getNurse(id: Int): Nurse

    @Query("DELETE FROM $NURSE_TABLE")
    fun deleteAllNurses()
}