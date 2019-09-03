package com.example.mpkt.interfaces

import com.example.mpkt.db.entity.analyzes.Measure

interface MeasureController {
    fun addMeasure(measure: Measure)
    fun deleteMeasure(measure: Measure)
    // неудачное название, лучше что-то типа getMeasuresById()
    fun getAllMeasuresPatient(id_in: Int): List<Measure>
    // неудачное название, лучше getAllMeasures()
    fun getMeasures(): List<Measure>
    fun deleteAll()
}