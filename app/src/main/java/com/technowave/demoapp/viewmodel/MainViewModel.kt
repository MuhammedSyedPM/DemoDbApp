package com.technowave.demoapp.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.technowave.demoapp.model.DemoTable
import com.technowave.demoapp.repository.MainRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    app: Application,
    private val repo: MainRepo
) :
    AndroidViewModel(app) {








}