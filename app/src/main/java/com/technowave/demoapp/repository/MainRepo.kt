package com.technowave.demoapp.repository


import com.technowave.demoapp.db.DataDao
import javax.inject.Inject


class MainRepo @Inject constructor(
    private val db: DataDao
) {



}