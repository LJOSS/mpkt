package com.example.mpkt.controllers

import com.example.mpkt.connection.Network
import com.example.mpkt.interfaces.DownloadController
import com.example.mpkt.utils.Constants
import com.example.mpkt.utils.createFile
import java.io.File

class DownloadControllerImpl : DownloadController {

    override fun downloadAll() {
        downloadBlood()
        downloadMeasure()
        downloadTemperature()
        downloadUrine()
        downloadNP()
        downloadNurse()
        downloadPatients()
    }

    override fun downloadBlood() {
        Network(File(createFile(Constants.BLOOD)), Constants.DOWNLOAD).execute(Constants.BLOOD)
    }

    override fun downloadUrine() {
        Network(File(createFile(Constants.URINE)), Constants.DOWNLOAD).execute(Constants.URINE)
    }

    override fun downloadTemperature() {
        Network(File(createFile(Constants.TEMPERATURE)), Constants.DOWNLOAD).execute(Constants.TEMPERATURE)
    }

    override fun downloadMeasure() {
        Network(File(createFile(Constants.MEASURE)), Constants.DOWNLOAD).execute(Constants.MEASURE)
    }

    override fun downloadNurse() {
        Network(File(createFile(Constants.NURSE)), Constants.DOWNLOAD).execute(Constants.NURSE)
    }

    override fun downloadPatients() {
        Network(File(createFile(Constants.PATIENTS)), Constants.DOWNLOAD).execute(Constants.PATIENTS)
    }

    override fun downloadNP() {
        Network(File(createFile(Constants.NP)), Constants.DOWNLOAD).execute(Constants.NP)
    }
}