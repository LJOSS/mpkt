package com.example.mpkt.interfaces

import com.example.mpkt.db.entity.analyzes.Temperature

interface TemperatureController {
    fun addTemperature(tempDB: Temperature)
    fun getAllTempPatient(id: Int): List<Temperature>
    fun getAllTemp(): List<Temperature>
    fun deleteAll()
}