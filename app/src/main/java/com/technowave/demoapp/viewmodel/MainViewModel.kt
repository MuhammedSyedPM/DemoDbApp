package com.technowave.demoapp.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.technowave.demoapp.model.DemoTable
import com.technowave.demoapp.repository.MainRepo
import com.technowave.demoapp.utils.DataResources
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(app: Application, private val repo: MainRepo) :
    AndroidViewModel(app) {

    init {
        //getMutableStateFlowData()
       // getMutableSharedFlowData()
    }


    var errorToast=MutableLiveData<String>()

   private val _sharedFlowToast= MutableSharedFlow<String>()
    val sharedFlowToast =_sharedFlowToast.asSharedFlow()


        val latestNews: Flow<DemoTable> = flow<DemoTable> {
        var id = 0
        while (true) {
            delay(2000)
            emit(DemoTable(id, "News $id"))
            id++
        }
    }


    private val _mutableSateFlowData = MutableStateFlow(DemoTable(0,"First value"))
    val sateFlowData: StateFlow<DemoTable> = _mutableSateFlowData

    private fun getMutableStateFlowData() {
        viewModelScope.launch {
            var id = 0
            while (true) {
                delay(1000)
                _mutableSateFlowData.value = DemoTable(id, "News $id")
                id++
            }
        }
    }

    private val _mutableSharedFlowData = MutableSharedFlow<DemoTable>(replay = 10)
    val sharedFlowData: SharedFlow<DemoTable> = _mutableSharedFlowData

    private fun getMutableSharedFlowData() {
        viewModelScope.launch {
            var id = 0
            while (true) {
                delay(2000)
                _mutableSharedFlowData.emit( DemoTable(id, "News $id"))
                id++
            }
        }
    }

    fun toast(value:Int)=viewModelScope.launch {
        if(value==1)
        errorToast.value="syed"
        else
       _sharedFlowToast.emit("Error")
    }



}
