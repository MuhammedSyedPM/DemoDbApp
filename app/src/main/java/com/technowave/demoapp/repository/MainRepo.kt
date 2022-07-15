package com.technowave.demoapp.repository


import android.util.Log
import com.technowave.demoapp.db.DataDao
import com.technowave.demoapp.model.DemoTable
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import javax.inject.Inject


class MainRepo @Inject constructor(private val db: DataDao) {

     suspend fun getLatestNews(news:(DemoTable)->Unit){
        var id = 0
        while (true){
            delay(2000)
            news(DemoTable(id, "News $id"))
            id++
        }
    }
}