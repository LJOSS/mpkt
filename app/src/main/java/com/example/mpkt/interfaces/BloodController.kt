package com.example.mpkt.interfaces

import com.example.mpkt.db.entity.analyzes.Blood

interface BloodController {
    fun addBlood(blood: Blood)
    fun getAllBloodPatient(id_in: Int): List<Blood>
    fun getAllBlood(): List<Blood>
    fun deleteAll()
}