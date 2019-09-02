package com.example.mpkt.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mpkt.utils.DB_Constants.AGE
import com.example.mpkt.utils.DB_Constants.ID
import com.example.mpkt.utils.DB_Constants.IMAGE
import com.example.mpkt.utils.DB_Constants.NAME
import com.example.mpkt.utils.DB_Constants.PATIENT_TABLE
import com.example.mpkt.utils.DB_Constants.WEIGHT

@Entity(tableName = PATIENT_TABLE)
data class Patient(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID)
    private var id: Int = 0,
    @ColumnInfo(name = NAME)
    private var name: String? = null,
    @ColumnInfo(name = WEIGHT)
    private var weight: Int = 0,
    @ColumnInfo(name = AGE)
    private var age: String? = null,
    @ColumnInfo(name = IMAGE)
    private var image: String? = null
)