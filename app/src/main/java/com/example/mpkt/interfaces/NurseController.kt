package com.example.mpkt.interfaces

import com.example.mpkt.db.entity.Nurse

interface NurseController {
    fun addNurse(nurse: Nurse)
    fun getAllNurses(): List<Nurse>
    fun getCurrentNurse(nurseId: Int): Nurse
    fun insertAllNurses(nurseList: List<Nurse>)
    fun deleteAll()
}