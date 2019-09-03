package com.example.mpkt.controllers

import com.example.mpkt.App
import com.example.mpkt.db.entity.analyzes.Urine
import com.example.mpkt.interfaces.UrineController

class UrineControllerImpl : UrineController {
    override fun addUrine(urine: Urine) {
        App.database.getUrineDao().addUrine(urine)
    }

    override fun getAllUrinePatient(id: Int): List<Urine> {
        val listUrinePatient = arrayListOf<Urine>()
        App.database.getUrineDao().getAllUrinePatient(id).observeForever {
            if (it != null) {
                listUrinePatient.addAll(it)
            }
        }
        return listUrinePatient
    }

    override fun getAllUrine(): List<Urine> {
        val listAllUrine = arrayListOf<Urine>()
        App.database.getUrineDao().getAllUrine().observeForever {
            if (it != null) {
                listAllUrine.addAll(it)
            }
        }
        return listAllUrine
    }

    override fun deleteAll() {
        App.database.getUrineDao().deleteAll()
    }
}