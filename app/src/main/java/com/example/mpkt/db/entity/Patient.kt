package com.example.mpkt.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mpkt.utils.Constants.AGE
import com.example.mpkt.utils.Constants.ID
import com.example.mpkt.utils.Constants.IMAGE
import com.example.mpkt.utils.Constants.NAME
import com.example.mpkt.utils.Constants.USER_TABLE
import com.example.mpkt.utils.Constants.WEIGHT

@Entity(tableName = USER_TABLE)
data class Patient(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID)
    private var id: Int = 0,
    @ColumnInfo(name = NAME)
    private var name: String? = null,
    @ColumnInfo(name = WEIGHT)
    private var weight: Int = 0,
    @ColumnInfo(name = AGE)
    private var age: String? = null,
    @ColumnInfo(name = IMAGE)
    private var image: String? = null
)