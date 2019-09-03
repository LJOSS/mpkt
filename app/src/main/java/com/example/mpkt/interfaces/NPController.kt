package com.example.mpkt.interfaces

import com.example.mpkt.db.entity.NP
import com.example.mpkt.db.entity.special.CountUsersEachNurse

interface NPController {
    fun addNP(np: NP)
    fun deleteNP(np: NP)
    fun getAllNursesAndPatients(): List<NP>
    fun getAllPatientsToNurse(idNurse: Int): List<NP>
    fun getCountPatientsCurrentNurse(): List<CountUsersEachNurse>
    fun deleteAllNP()
}