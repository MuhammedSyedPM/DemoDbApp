package com.technowave.demoapp.db

import androidx.room.Dao


@Dao
interface DataDao {
/**
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertData(data: List<PickedData>)


    @Query("SELECT * FROM $PICK_TABLE  where transactionID=0")
    fun getDataFromRoom(): Flow<List<PickedData>>

    **/

}