package com.example.mpkt.controllers

import com.example.mpkt.App
import com.example.mpkt.db.entity.Nurse
import com.example.mpkt.interfaces.NurseController

class NurseControllerImpl : NurseController {

    override fun insertAllNurses(nurseList: List<Nurse>) {
        nurseList.forEach {
            addNurse(it)
        }
    }

    override fun deleteAll() {
        App.database.getNurseDao().deleteAllNurses()
    }

    override fun getCurrentNurse(nurseId: Int): Nurse {
        return App.database.getNurseDao().getNurse(nurseId)
    }

    override fun addNurse(nurse: Nurse) {
        App.database.getNurseDao().addNurse(nurseDB = nurse)
    }

    override fun showAllNurses(): List<Nurse> {
        val listNurses = arrayListOf<Nurse>()
        App.database.getNurseDao().getAllNurses().observeForever {
            if (it != null) {
                listNurses.addAll(it)
            }
        }
        return listNurses
    }
}