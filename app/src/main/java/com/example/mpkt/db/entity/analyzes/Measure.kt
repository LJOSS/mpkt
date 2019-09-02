package com.example.mpkt.db.entity.analyzes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mpkt.utils.DBConstants.LOWER
import com.example.mpkt.utils.DBConstants.MEASURE_TABLE
import com.example.mpkt.utils.DBConstants.PATIENT_ID
import com.example.mpkt.utils.DBConstants.PULSE
import com.example.mpkt.utils.DBConstants.UPPER
import com.example.mpkt.utils.DBConstants.TIME

// Давление
@Entity(tableName = MEASURE_TABLE)
data class Measure(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = UPPER)
    var Upper: Int = 0,
    @ColumnInfo(name = LOWER)
    var Lower: Int = 0,
    @ColumnInfo(name = PULSE)
    var Pulse: Int = 0,
    @ColumnInfo(name = PATIENT_ID)
    var patient_id: Int = 0,
    @ColumnInfo(name = TIME)
    var time: String? = null
)