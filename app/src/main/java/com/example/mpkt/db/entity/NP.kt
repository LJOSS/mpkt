package com.example.mpkt.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mpkt.utils.DB_Constants.ID
import com.example.mpkt.utils.DB_Constants.NURSE_ID
import com.example.mpkt.utils.DB_Constants.PATIENT_ID
import com.example.mpkt.utils.DB_Constants.NURSE_PATIENT_TABLE

@Entity(tableName = NURSE_PATIENT_TABLE)
data class NP(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID)
    var id: Int = 0,
    @ColumnInfo(name = NURSE_ID)
    var id_nurse: Int = 0,
    @ColumnInfo(name = PATIENT_ID)
    var id_user: Int = 0
)