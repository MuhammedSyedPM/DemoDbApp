package com.technowave.demoapp.db



import androidx.room.*
import com.technowave.demoapp.model.DemoTable


@Database(
    entities = [DemoTable::class],
    version = 5,
    exportSchema = true
)
abstract class DataDatabase : RoomDatabase() {
    abstract fun getDataDao(): DataDao




}