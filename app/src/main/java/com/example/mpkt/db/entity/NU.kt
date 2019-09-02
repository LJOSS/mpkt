package com.example.mpkt.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mpkt.utils.Constants.ID
import com.example.mpkt.utils.Constants.NURSE_ID
import com.example.mpkt.utils.Constants.PATIENT_ID
import com.example.mpkt.utils.Constants.NURSE_USER_TABLE

@Entity(tableName = NURSE_USER_TABLE)
data class NU(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID)
    private var id: Int = 0,
    @ColumnInfo(name = NURSE_ID)
    private var idnurse: Int = 0,
    @ColumnInfo(name = PATIENT_ID)
    private var iduser: Int = 0
)