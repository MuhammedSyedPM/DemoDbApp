package com.technowave.demoapp.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.technowave.demoapp.repository.MainRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    app: Application,
    private val repo: MainRepo
) :
    AndroidViewModel(app) {



}