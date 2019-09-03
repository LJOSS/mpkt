package com.example.mpkt.interfaces

import com.example.mpkt.db.entity.analyzes.Measure

interface MeasureController {
    fun addMeasure(measure: Measure)
    fun deleteMeasure(measure: Measure)
    fun getAllMeasuresPatient(id_in: Int): List<Measure>
    fun getMeasures(): List<Measure>
    fun deleteAll()
}