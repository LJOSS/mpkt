package com.example.mpkt.controllers

import com.example.mpkt.App
import com.example.mpkt.connection.Network
import com.example.mpkt.interfaces.UploadController
import com.example.mpkt.utils.Constants.BLOOD
import com.example.mpkt.utils.Constants.MEASURE
import com.example.mpkt.utils.Constants.NP
import com.example.mpkt.utils.Constants.NURSE
import com.example.mpkt.utils.Constants.PATIENTS
import com.example.mpkt.utils.Constants.TEMPERATURE
import com.example.mpkt.utils.Constants.UPLOAD
import com.example.mpkt.utils.Constants.URINE
import com.example.mpkt.utils.createFile
import com.google.gson.Gson
import java.io.File
import java.io.FileWriter

class UploadControllerImpl : UploadController {

    override fun convertAndUploadNurses() {
        val jsonString = Gson().toJson(App.nurseController.getAllNurses())
        upload(jsonString, NURSE)
    }

    override fun convertAndUploadPatients() {
        val jsonString = Gson().toJson(App.patientController.getAllPatients())
        upload(jsonString, PATIENTS)
    }

    override fun convertAndUploadBlood() {
        val jsonString = Gson().toJson(App.bloodController.getAllBlood())
        upload(jsonString, BLOOD)
    }

    override fun convertAndUploadTemperature() {
        val jsonString = Gson().toJson(App.temperatureController.getAllTemp())
        upload(jsonString, TEMPERATURE)
    }

    override fun convertAndUploadMeasure() {
        val jsonString = Gson().toJson(App.measureController.getMeasures())
        upload(jsonString, MEASURE)
    }

    override fun convertAndUploadUrine() {
        val jsonString = Gson().toJson(App.urineController.getAllUrine())
        upload(jsonString, URINE)

    }

    override fun convertAndUploadNP() {
        val jsonString = Gson().toJson(App.nursePersonController.getAllNursesAndPatients())
        upload(jsonString, NP)
    }

    override fun convertAndUploadAll() {
        convertAndUploadNurses()
        convertAndUploadPatients()
        convertAndUploadNP()
        convertAndUploadBlood()
        convertAndUploadTemperature()
        convertAndUploadMeasure()
        convertAndUploadUrine()
    }

    private fun upload(jsonString: String, type: String) {
        val jsonFile = File(createFile(type))
        val writer = FileWriter(jsonFile)
        writer.append(jsonString)
        writer.flush()
        writer.close()
        Network(jsonFile, UPLOAD).execute(type)
    }
}