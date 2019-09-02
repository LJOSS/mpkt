package com.example.mpkt.db.entity.special

import androidx.room.ColumnInfo
import com.example.mpkt.utils.DBConstants.COUNT_OF_PATIENT
import com.example.mpkt.utils.DBConstants.NURSE_ID

data class CountUsersEachNurse(
    @ColumnInfo(name = NURSE_ID)
    var idnurse: Int = 0,
    @ColumnInfo(name = COUNT_OF_PATIENT)
    var count: Int = 0
)