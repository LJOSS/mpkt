package com.example.mpkt.interfaces

import com.example.mpkt.db.entity.analyzes.Blood

// почему Controller, а не Repository?
// неудачное название директории
interface BloodController {
    fun addBlood(blood: Blood)
    // неудачное название, лучше что-то типа getBloodById()
    // почему не LiveData?
    fun getAllBloodPatient(id_in: Int): List<Blood>
    fun getAllBlood(): List<Blood>
    // непоследовательное название метода
    // если везде добавляешь слово Blood, то должно быть deleteAllBlood()
    // посмотри по всем классам
    fun deleteAll()
}