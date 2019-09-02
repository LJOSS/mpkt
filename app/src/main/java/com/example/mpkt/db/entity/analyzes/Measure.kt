package com.example.mpkt.db.entity.analyzes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mpkt.utils.Constants.LOWER
import com.example.mpkt.utils.Constants.MEASURE_TABLE
import com.example.mpkt.utils.Constants.PATIENT_ID
import com.example.mpkt.utils.Constants.PULSE
import com.example.mpkt.utils.Constants.UPPER
import com.example.mpkt.utils.Constants.TIME

// Давление
@Entity(tableName = MEASURE_TABLE)
data class Measure(
    @PrimaryKey(autoGenerate = true)
    private var id: Int = 0,
    @ColumnInfo(name = UPPER)
    private var Upper: Int = 0,
    @ColumnInfo(name = LOWER)
    private var Lower: Int = 0,
    @ColumnInfo(name = PULSE)
    private var Pulse: Int = 0,
    @ColumnInfo(name = PATIENT_ID)
    private var patient_id: Int = 0,
    @ColumnInfo(name = TIME)
    private var time: String? = null
)