package com.example.mpkt.controllers

import com.example.mpkt.App
import com.example.mpkt.db.entity.NP
import com.example.mpkt.db.entity.special.CountUsersEachNurse
import com.example.mpkt.interfaces.NPController

class NPControllerImpl : NPController {
    override fun addNP(np: NP) {
        App.database.getNPDao().AddNP(np)
    }

    override fun deleteNP(np: NP) {
        App.database.getNPDao().DeleteNP(np)
    }

    override fun getAllNursesAndPatients(): List<NP> {
        val listNP = arrayListOf<NP>()
        App.database.getNPDao().getAllNursesAndPatients().observeForever {
            if (it != null) {
                listNP.addAll(it)
            }
        }
        return listNP
    }

    override fun getAllPatientsToNurse(idNurse: Int): List<NP> {
        val listPatientsToNurse = arrayListOf<NP>()
        App.database.getNPDao().getAllPatientsToNurse(idNurse).observeForever {
            if (it != null) {
                listPatientsToNurse.addAll(it)
            }
        }
        return listPatientsToNurse
    }

    override fun getCountPatientsCurrentNurse(): List<CountUsersEachNurse> {
        val listCountPatientsCurrentNurse = arrayListOf<CountUsersEachNurse>()
        App.database.getNPDao().getCountPatientsCurrentNurse().observeForever {
            if (it != null) {
                listCountPatientsCurrentNurse.addAll(it)
            }
        }
        return listCountPatientsCurrentNurse
    }

    override fun deleteAllNP() {
        App.database.getNPDao().deleteAll()
    }
}