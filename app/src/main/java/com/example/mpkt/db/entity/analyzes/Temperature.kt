package com.example.mpkt.db.entity.analyzes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mpkt.utils.DBConstants.ID
import com.example.mpkt.utils.DBConstants.PATIENT_ID
import com.example.mpkt.utils.DBConstants.TEMPERATURE_C
import com.example.mpkt.utils.DBConstants.TEMPERATURE_TABLE
import com.example.mpkt.utils.DBConstants.TIME

// Температура
@Entity(tableName = TEMPERATURE_TABLE)
data class Temperature(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID)
     var id: Int = 0,
    @ColumnInfo(name = TEMPERATURE_C)
     var Temp: Double? = null,
    @ColumnInfo(name = PATIENT_ID)
     var patient_id: Int = 0,
    @ColumnInfo(name = TIME)
     var time: String? = null
)