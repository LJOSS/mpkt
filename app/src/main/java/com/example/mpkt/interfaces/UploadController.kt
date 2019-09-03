package com.example.mpkt.interfaces

interface UploadController {
    fun convertAndUploadAll()

    fun convertAndUploadNurses()
    fun convertAndUploadPatients()
    fun convertAndUploadNP()

    fun convertAndUploadBlood()
    fun convertAndUploadTemperature()
    fun convertAndUploadMeasure()
    fun convertAndUploadUrine()
}