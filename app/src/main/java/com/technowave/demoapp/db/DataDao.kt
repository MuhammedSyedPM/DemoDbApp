package com.technowave.demoapp.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.technowave.demoapp.model.DemoTable


@Dao
interface DataDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertData(data: DemoTable)

/**
    @Query("SELECT * FROM $PICK_TABLE  where transactionID=0")
    fun getDataFromRoom(): Flow<List<PickedData>>

    **/

}