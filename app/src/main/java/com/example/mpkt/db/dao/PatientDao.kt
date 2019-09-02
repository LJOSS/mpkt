package com.example.mpkt.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mpkt.db.entity.Patient
import com.example.mpkt.utils.DBConstants.ID
import com.example.mpkt.utils.DBConstants.NURSE_ID
import com.example.mpkt.utils.DBConstants.NURSE_PATIENT_TABLE
import com.example.mpkt.utils.DBConstants.PATIENT_TABLE

@Dao
interface PatientDao {
    @Update
    fun updatePatient(patient: Patient)

    @Insert
    fun addPatient(patient: Patient)

    @Delete
    fun deletePatient(patient: Patient)

    @Query("SELECT * FROM $PATIENT_TABLE")
    fun getPatients(): LiveData<List<Patient>>

    @Query("Select * FROM $PATIENT_TABLE WHERE $ID= :patient_ids")
    fun getPatientByID(patient_ids: Int): Patient

    @Query(
        "Select * from $PATIENT_TABLE where $ID in " +
                "(select $ID from $NURSE_PATIENT_TABLE where $NURSE_ID = :id_nurse)"
    )
    fun getAllPatientsCurrentNurse(id_nurse: Int): LiveData<List<Patient>>

    @Query("DELETE FROM $PATIENT_TABLE")
    fun deleteAllPatients()
}