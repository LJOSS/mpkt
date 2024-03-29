package com.example.mpkt.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mpkt.utils.DBConstants.AGE
import com.example.mpkt.utils.DBConstants.ID
import com.example.mpkt.utils.DBConstants.IMAGE
import com.example.mpkt.utils.DBConstants.NAME
import com.example.mpkt.utils.DBConstants.PATIENT_TABLE
import com.example.mpkt.utils.DBConstants.WEIGHT

@Entity(tableName = PATIENT_TABLE)
data class Patient(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID)
    var id: Int = 0,
    @ColumnInfo(name = NAME)
    var name: String? = null,
    @ColumnInfo(name = WEIGHT)
    var weight: Int = 0,
    @ColumnInfo(name = AGE)
    var age: String? = null,
    @ColumnInfo(name = IMAGE)
    var image: String? = null
)