package com.example.mpkt.interfaces

import com.example.mpkt.db.entity.analyzes.Urine

interface UrineController {
    fun addUrine(urine: Urine)
    fun getAllUrinePatient(id: Int): List<Urine>
    fun getAllUrine(): List<Urine>
    fun deleteAll()
}