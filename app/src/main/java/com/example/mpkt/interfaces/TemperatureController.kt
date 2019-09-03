package com.example.mpkt.interfaces

import com.example.mpkt.db.entity.analyzes.Temperature

interface TemperatureController {
    fun addTemperature(tempDB: Temperature)
    // непоследовательное именование методов, лучше getTemperatureById()
    fun getAllTempPatient(id: Int): List<Temperature>
    // непоследовательное именование методов, лучше getAllTemperature()
    fun getAllTemp(): List<Temperature>
    fun deleteAll()
}