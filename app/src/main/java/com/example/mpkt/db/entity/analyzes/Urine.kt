package com.example.mpkt.db.entity.analyzes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mpkt.utils.DBConstants.ACIDITY
import com.example.mpkt.utils.DBConstants.COLOR
import com.example.mpkt.utils.DBConstants.DENSITY
import com.example.mpkt.utils.DBConstants.ID
import com.example.mpkt.utils.DBConstants.PATIENT_ID
import com.example.mpkt.utils.DBConstants.PROTEIN
import com.example.mpkt.utils.DBConstants.TIME
import com.example.mpkt.utils.DBConstants.TRANSPARENCY
import com.example.mpkt.utils.DBConstants.URINE_TABLE

// Моча
@Entity(tableName = URINE_TABLE)
data class Urine(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID)
    var id: Int = 0,
    @ColumnInfo(name = COLOR)
    var ColorUrine: String? = null,
    @ColumnInfo(name = TRANSPARENCY)
    var Transparency: String? = null,
    @ColumnInfo(name = DENSITY)
    var density: Double = 0.toDouble(),
    @ColumnInfo(name = ACIDITY)
    var acidity: Int = 0,
    @ColumnInfo(name = PROTEIN)
    var protein: Double = 0.toDouble(),
    @ColumnInfo(name = PATIENT_ID)
    var patient_id: Int = 0,
    @ColumnInfo(name = TIME)
    var time: String? = null
)