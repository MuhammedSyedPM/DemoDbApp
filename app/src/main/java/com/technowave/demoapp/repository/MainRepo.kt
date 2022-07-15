package com.technowave.demoapp.repository


import android.util.Log
import com.technowave.demoapp.db.DataDao
import com.technowave.demoapp.model.DemoTable
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject



class MainRepo @Inject constructor(
    private val db: DataDao
) {
    suspend fun insertData(s: DemoTable) {
      return db.insertData(s)
    }








}