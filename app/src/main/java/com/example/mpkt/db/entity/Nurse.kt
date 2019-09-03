package com.example.mpkt.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mpkt.utils.DBConstants.AGE
import com.example.mpkt.utils.DBConstants.EMAIL
import com.example.mpkt.utils.DBConstants.IMAGE
import com.example.mpkt.utils.DBConstants.NAME
import com.example.mpkt.utils.DBConstants.NURSE_ID
import com.example.mpkt.utils.DBConstants.NURSE_TABLE
import com.example.mpkt.utils.DBConstants.WEIGHT


@Entity(tableName = NURSE_TABLE)
data class Nurse(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = NURSE_ID)
    var nurseid: Int = 0,
    @ColumnInfo(name = NAME)
    var name: String? = null,
    @ColumnInfo(name = WEIGHT)
    var weight: Int = 0,
    @ColumnInfo(name = AGE)
    var age: String? = null,
    @ColumnInfo(name = IMAGE)
    var image: String? = null,
    @ColumnInfo(name = EMAIL)
    var email: String? = null
)