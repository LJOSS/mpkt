package com.example.mpkt.db.entity.special

import androidx.room.ColumnInfo
import com.example.mpkt.utils.DB_Constants.COUNT_OF_PATIENT
import com.example.mpkt.utils.DB_Constants.NURSE_ID

data class CountUsersEachNurse(
    @ColumnInfo(name = NURSE_ID)
    private var idnurse: Int = 0,
    @ColumnInfo(name = COUNT_OF_PATIENT)
    private var count: Int = 0
)