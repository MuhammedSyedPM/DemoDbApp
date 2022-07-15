package com.technowave.demoapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "demo_table")
data class DemoTable(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var name: String,

    )
