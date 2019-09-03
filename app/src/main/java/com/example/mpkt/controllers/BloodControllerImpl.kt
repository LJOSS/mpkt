package com.example.mpkt.controllers

import com.example.mpkt.App
import com.example.mpkt.db.entity.analyzes.Blood
import com.example.mpkt.interfaces.BloodController

// почему ControllerImpl, а не RepositoryImpl?
class BloodControllerImpl : BloodController {
    override fun addBlood(blood: Blood) {
        App.database.getBloodDao().addBlood(blood)
    }

    override fun getAllBloodPatient(id_in: Int): List<Blood> {
        val listBloodPatient = arrayListOf<Blood>()
        // TODO замени observeForever на observe с lifecycleOwner
        App.database.getBloodDao().getAllBloodPatient(id_in).observeForever {
            if (it != null) {
                listBloodPatient.addAll(it)
            }
        }
        return listBloodPatient
    }

    override fun getAllBlood(): List<Blood> {
        val listAllBlood = arrayListOf<Blood>()
        // TODO замени observeForever на observe с lifecycleOwner
        App.database.getBloodDao().getAllBlood().observeForever {
            if (it != null) {
                listAllBlood.addAll(it)
            }
        }
        return listAllBlood
    }

    override fun deleteAll() {
        App.database.getBloodDao().deleteAll()
    }
}