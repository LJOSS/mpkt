package com.example.mpkt.db.entity.analyzes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mpkt.utils.DBConstants.BLOOD_TABLE
import com.example.mpkt.utils.DBConstants.COLOR_INDICATOR
import com.example.mpkt.utils.DBConstants.ERYTHROCYTE
import com.example.mpkt.utils.DBConstants.HEMOGLOBIN
import com.example.mpkt.utils.DBConstants.LEUKOCYTE
import com.example.mpkt.utils.DBConstants.LYMPHOCYTES
import com.example.mpkt.utils.DBConstants.PATIENT_ID
import com.example.mpkt.utils.DBConstants.PLATELETS
import com.example.mpkt.utils.DBConstants.RETICULOCYTES
import com.example.mpkt.utils.DBConstants.SDE
import com.example.mpkt.utils.DBConstants.TIME

// Кровь
@Entity(tableName = BLOOD_TABLE)
data class Blood(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = HEMOGLOBIN)
    var hemoglobin: Int = 0,
    @ColumnInfo(name = ERYTHROCYTE)
    var erythrocyte: Double = 0.toDouble(),
    @ColumnInfo(name = COLOR_INDICATOR)
    var color_indicator: Double = 0.toDouble(),
    @ColumnInfo(name = RETICULOCYTES)
    var reticulocytes: Double = 0.toDouble(),
    @ColumnInfo(name = PLATELETS)
    var platelets: Int = 0,
    @ColumnInfo(name = SDE)
    var sde: Int = 0,
    @ColumnInfo(name = LEUKOCYTE)
    var leukocyte: Int = 0,
    @ColumnInfo(name = LYMPHOCYTES)
    var lymphocytes: Int = 0,

    @ColumnInfo(name = PATIENT_ID)
    var patient_id: Int = 0,
    @ColumnInfo(name = TIME)
    var time: String? = null
)