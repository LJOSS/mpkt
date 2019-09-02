package com.example.mpkt.controllers

import com.example.mpkt.App
import com.example.mpkt.db.entity.Patient
import com.example.mpkt.interfaces.PatientController

class PatientControllerImpl : PatientController {

    override fun addPatient(patient: Patient) {
        App.database.getPatientDao().addPatient(patient)
    }

    override fun showAllPatients(): List<Patient> {
        val listPatients = arrayListOf<Patient>()
        App.database.getPatientDao().getPatients().observeForever {
            if (it != null) {
                listPatients.addAll(it)
            }
        }
        return listPatients
    }

    override fun getCurrentPatient(patientId: Int): Patient {
        return App.database.getPatientDao().getPatientByID(patientId)
    }

    override fun insertAllPatients(patientList: List<Patient>) {
        patientList.forEach {
            addPatient(it)
        }
    }

    override fun deleteAll() {
        App.database.getPatientDao().deleteAllPatients()
    }
}