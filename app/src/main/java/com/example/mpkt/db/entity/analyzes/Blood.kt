package com.example.mpkt.db.entity.analyzes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mpkt.utils.Constants.BLOOD_TABLE
import com.example.mpkt.utils.Constants.COLOR_INDICATOR
import com.example.mpkt.utils.Constants.ERYTHROCYTE
import com.example.mpkt.utils.Constants.HEMOGLOBIN
import com.example.mpkt.utils.Constants.LEUKOCYTE
import com.example.mpkt.utils.Constants.LYMPHOCYTES
import com.example.mpkt.utils.Constants.PATIENT_ID
import com.example.mpkt.utils.Constants.PLATELETS
import com.example.mpkt.utils.Constants.RETICULOCYTES
import com.example.mpkt.utils.Constants.SDE
import com.example.mpkt.utils.Constants.TIME

// Кровь
@Entity(tableName = BLOOD_TABLE)
data class Blood(
    @PrimaryKey(autoGenerate = true)
    private var id: Int = 0,
    @ColumnInfo(name = HEMOGLOBIN)
    private var hemoglobin: Int = 0,
    @ColumnInfo(name = ERYTHROCYTE)
    private var erythrocyte: Double = 0.toDouble(),
    @ColumnInfo(name = COLOR_INDICATOR)
    private var color_indicator: Double = 0.toDouble(),
    @ColumnInfo(name = RETICULOCYTES)
    private var reticulocytes: Double = 0.toDouble(),
    @ColumnInfo(name = PLATELETS)
    private var platelets: Int = 0,
    @ColumnInfo(name = SDE)
    private var sde: Int = 0,
    @ColumnInfo(name = LEUKOCYTE)
    private var leukocyte: Int = 0,
    @ColumnInfo(name = LYMPHOCYTES)
    private var lymphocytes: Int = 0,

    @ColumnInfo(name = PATIENT_ID)
    private var patient_id: Int = 0,
    @ColumnInfo(name = TIME)
    private var time: String? = null
)