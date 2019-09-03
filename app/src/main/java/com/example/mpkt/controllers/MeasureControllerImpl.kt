package com.example.mpkt.controllers

import com.example.mpkt.App
import com.example.mpkt.db.entity.analyzes.Measure
import com.example.mpkt.interfaces.MeasureController

class MeasureControllerImpl : MeasureController {
    override fun addMeasure(measure: Measure) {
        App.database.getMeasureDao().addMeasure(measure)
    }

    override fun deleteMeasure(measure: Measure) {
        App.database.getMeasureDao().deleteMeasure(measure)
    }

    override fun getAllMeasuresPatient(id_in: Int): List<Measure> {
        val listMeasurePatient = arrayListOf<Measure>()
        App.database.getMeasureDao().getAllMeasuresPatient(id_in).observeForever {
            if (it != null) {
                listMeasurePatient.addAll(it)
            }
        }
        return listMeasurePatient
    }

    override fun getMeasures(): List<Measure> {
        val listAllMeasures = arrayListOf<Measure>()
        App.database.getMeasureDao().getMeasures().observeForever {
            if (it != null) {
                listAllMeasures.addAll(it)
            }
        }
        return listAllMeasures
    }

    override fun deleteAll() {
        App.database.getMeasureDao().deleteAll()
    }
}