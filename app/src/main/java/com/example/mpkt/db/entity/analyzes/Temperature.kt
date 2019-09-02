package com.example.mpkt.db.entity.analyzes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mpkt.utils.DB_Constants
import com.example.mpkt.utils.DB_Constants.PATIENT_ID
import com.example.mpkt.utils.DB_Constants.TEMPERATURE
import com.example.mpkt.utils.DB_Constants.TEMPERATURE_TABLE
import com.example.mpkt.utils.DB_Constants.TIME

// Температура
@Entity(tableName = TEMPERATURE_TABLE)
data class Temperature(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = DB_Constants.ID)
    private var id: Int = 0,
    @ColumnInfo(name = TEMPERATURE)
    private var Temp: Double? = null,
    @ColumnInfo(name = PATIENT_ID)
    private var patient_id: Int = 0,
    @ColumnInfo(name = TIME)
    private var time: String? = null
)