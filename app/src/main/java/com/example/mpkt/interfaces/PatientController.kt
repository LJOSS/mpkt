package com.example.mpkt.interfaces

import com.example.mpkt.db.entity.Patient

interface PatientController {
    fun addPatient(patient: Patient)
    fun getAllPatients(): List<Patient>
    fun getCurrentPatient(patientId: Int): Patient
    fun insertAllPatients(patientList: List<Patient>)
    fun deleteAll()
}