package com.example.mpkt.db.entity.analyzes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mpkt.utils.DB_Constants.BLOOD_TABLE
import com.example.mpkt.utils.DB_Constants.COLOR_INDICATOR
import com.example.mpkt.utils.DB_Constants.ERYTHROCYTE
import com.example.mpkt.utils.DB_Constants.HEMOGLOBIN
import com.example.mpkt.utils.DB_Constants.LEUKOCYTE
import com.example.mpkt.utils.DB_Constants.LYMPHOCYTES
import com.example.mpkt.utils.DB_Constants.PATIENT_ID
import com.example.mpkt.utils.DB_Constants.PLATELETS
import com.example.mpkt.utils.DB_Constants.RETICULOCYTES
import com.example.mpkt.utils.DB_Constants.SDE
import com.example.mpkt.utils.DB_Constants.TIME

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