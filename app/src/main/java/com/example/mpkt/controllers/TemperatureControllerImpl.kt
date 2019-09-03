package com.example.mpkt.controllers

import com.example.mpkt.App
import com.example.mpkt.db.entity.analyzes.Temperature
import com.example.mpkt.interfaces.TemperatureController

class TemperatureControllerImpl : TemperatureController {
    override fun addTemperature(tempDB: Temperature) {
        App.database.getTemperatureDao().addMeasure(tempDB)
    }

    override fun getAllTempPatient(id: Int): List<Temperature> {
        val listTemperaturePatient = arrayListOf<Temperature>()
        App.database.getTemperatureDao().getAllTempPatient(id).observeForever {
            if (it != null) {
                listTemperaturePatient.addAll(listTemperaturePatient)
            }
        }
        return listTemperaturePatient
    }

    override fun getAllTemp(): List<Temperature> {
        val listAllTemperature = arrayListOf<Temperature>()
        App.database.getTemperatureDao().getAllTemp().observeForever {
            if (it != null) {
                listAllTemperature.addAll(it)
            }
        }
        return listAllTemperature
    }

    override fun deleteAll() {
        App.database.getTemperatureDao().deleteAll()
    }
}