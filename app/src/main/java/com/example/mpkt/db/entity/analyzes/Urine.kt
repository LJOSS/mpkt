package com.example.mpkt.db.entity.analyzes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mpkt.utils.DB_Constants.ACIDITY
import com.example.mpkt.utils.DB_Constants.COLOR
import com.example.mpkt.utils.DB_Constants.DENSITY
import com.example.mpkt.utils.DB_Constants.ID
import com.example.mpkt.utils.DB_Constants.PATIENT_ID
import com.example.mpkt.utils.DB_Constants.PROTEIN
import com.example.mpkt.utils.DB_Constants.TIME
import com.example.mpkt.utils.DB_Constants.TRANSPARENCY
import com.example.mpkt.utils.DB_Constants.URINE_TABLE

// Моча
@Entity(tableName = URINE_TABLE)
data class Urine(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID)
    private var id: Int = 0,
    @ColumnInfo(name = COLOR)
    private var ColorUrine: String? = null,
    @ColumnInfo(name = TRANSPARENCY)
    private var Transparency: String? = null,
    @ColumnInfo(name = DENSITY)
    private var density: Double = 0.toDouble(),
    @ColumnInfo(name = ACIDITY)
    private var acidity: Int = 0,
    @ColumnInfo(name = PROTEIN)
    private var protein: Double = 0.toDouble(),
    @ColumnInfo(name = PATIENT_ID)
    private var patient_id: Int = 0,
    @ColumnInfo(name = TIME)
    private var time: String? = null
)