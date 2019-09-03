package com.example.mpkt.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mpkt.db.entity.Nurse
import com.example.mpkt.utils.DBConstants
import com.example.mpkt.utils.DBConstants.NURSE_ID
import com.example.mpkt.utils.DBConstants.NURSE_TABLE

@Dao
interface NurseDao {

    @Update
    fun updateNurse(nurseDB: Nurse)

    @Insert
    fun addNurse(nurseDB: Nurse)

    @Delete
    fun deleteNurse(nurseDB: Nurse)

    @Query("SELECT * FROM $NURSE_TABLE")
    fun getAllNurses(): LiveData<List<Nurse>>

    @Query("Select * FROM $NURSE_TABLE WHERE $NURSE_ID= :id")
    fun getNurse(id: Int): Nurse

    @Query("DELETE FROM $NURSE_TABLE")
    fun deleteAllNurses()

    companion object{
        const val DELETE_PATIENTS = "ALTER TABLE $NURSE_TABLE " +
                "DROP COLUMN ${DBConstants.PATIENTS}"
    }
}