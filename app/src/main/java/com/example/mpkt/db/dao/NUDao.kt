package com.example.mpkt.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.mpkt.db.entity.NU
import com.example.mpkt.db.entity.special.CountUsersEachNurse
import com.example.mpkt.utils.DB_Constants.NURSE_ID
import com.example.mpkt.utils.DB_Constants.NURSE_PATIENT_TABLE

@Dao
interface NUDao {


    @Insert
    fun AddNU(nudb: NU)

    @Delete
    fun DeleteNUDB(nudb: NU)

    @Query("Select * from $NURSE_PATIENT_TABLE")
    fun getAllNursesAndPatients(): LiveData<List<NU>>

    @Query("Select * from $NURSE_PATIENT_TABLE WHERE $NURSE_ID = :idNurse")
    fun getAllPatientsToNurse(idNurse: Int): LiveData<List<NU>>

    @Query(
        "select nurse_table.nurse_id ,count(nurse_patient_table.nurse_id) as count from nurse_table " +
                "join nurse_patient_table on nurse_table.nurse_id = nurse_patient_table.nurse_id " +
                "group by nurse_table.nurse_id"
    )
    fun getCountUsersCurrentNurse(): LiveData<List<CountUsersEachNurse>>

    @Query("DELETE FROM $NURSE_PATIENT_TABLE")
    fun deleteAll()
}