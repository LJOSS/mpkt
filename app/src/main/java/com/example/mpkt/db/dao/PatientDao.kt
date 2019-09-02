package com.example.mpkt.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mpkt.db.entity.Patient
import com.example.mpkt.utils.DB_Constants.ID
import com.example.mpkt.utils.DB_Constants.NURSE_ID
import com.example.mpkt.utils.DB_Constants.NURSE_PATIENT_TABLE
import com.example.mpkt.utils.DB_Constants.PATIENT_ID
import com.example.mpkt.utils.DB_Constants.PATIENT_TABLE

@Dao
interface PatientDao {
    @Update
    fun updatePatient(userDB: Patient)

    @Insert
    fun addPatient(userDB: Patient)

    @Delete
    fun deletePatient(userDB: Patient)

    @Query("SELECT * FROM $PATIENT_TABLE")
    fun getPatients(): LiveData<List<Patient>>

    @Query("Select * FROM $PATIENT_TABLE WHERE $PATIENT_ID= :patient_ids")
    fun getPatientByID(patient_ids: Int): Patient

    @Query(
        "Select * from $PATIENT_TABLE where $ID in " +
                "(select $ID from $NURSE_PATIENT_TABLE where $NURSE_ID = :id_nurse)"
    )
    fun getAllPatientsCurrentNurse(id_nurse: Int): LiveData<List<Patient>>

    @Query("DELETE FROM $PATIENT_TABLE")
    fun deleteAllPatients()
}