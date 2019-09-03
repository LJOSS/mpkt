package com.example.mpkt.interfaces

import com.example.mpkt.db.entity.NP
import com.example.mpkt.db.entity.special.CountUsersEachNurse

interface NPController {
    fun addNP(np: NP)
    fun deleteNP(np: NP)
    // непоследовательное именование, пусть уже везде будет NP
    fun getAllNursesAndPatients(): List<NP>
    // может, лучше перенести этот метод в NurseController?
    fun getAllPatientsToNurse(idNurse: Int): List<NP>
    // может, лучше перенести этот метод в NurseController?
    fun getCountPatientsCurrentNurse(): List<CountUsersEachNurse>
    fun deleteAllNP()
}