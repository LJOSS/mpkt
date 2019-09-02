package com.example.mpkt.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mpkt.utils.DB_Constants.AGE
import com.example.mpkt.utils.DB_Constants.EMAIL
import com.example.mpkt.utils.DB_Constants.IMAGE
import com.example.mpkt.utils.DB_Constants.NAME
import com.example.mpkt.utils.DB_Constants.NURSE_ID
import com.example.mpkt.utils.DB_Constants.NURSE_TABLE
import com.example.mpkt.utils.DB_Constants.PATIENTS
import com.example.mpkt.utils.DB_Constants.WEIGHT


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
    @ColumnInfo(name = PATIENTS)
    var patients: String? = null,
    @ColumnInfo(name = EMAIL)
    var email: String? = null
)