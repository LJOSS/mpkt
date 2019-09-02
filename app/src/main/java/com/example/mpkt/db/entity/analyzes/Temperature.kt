package com.example.mpkt.db.entity.analyzes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mpkt.utils.Constants
import com.example.mpkt.utils.Constants.PATIENT_ID
import com.example.mpkt.utils.Constants.TEMPERATURE
import com.example.mpkt.utils.Constants.TEMP_TABLE
import com.example.mpkt.utils.Constants.TIME

// Температура
@Entity(tableName = TEMP_TABLE)
data class Temperature(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = Constants.ID)
    private var id: Int = 0,
    @ColumnInfo(name = TEMPERATURE)
    private var Temp: Double? = null,
    @ColumnInfo(name = PATIENT_ID)
    private var patient_id: Int = 0,
    @ColumnInfo(name = TIME)
    private var time: String? = null
)