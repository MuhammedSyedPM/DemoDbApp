package com.technowave.demoapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.MutableLiveData
import com.technowave.demoapp.communicator.Connector
import com.technowave.demoapp.databinding.ActivityMainBinding
import com.technowave.demoapp.model.DemoTable
import com.technowave.demoapp.repository.MainRepo
import com.technowave.demoapp.service.HelloService
import com.technowave.demoapp.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    lateinit var connector:Connector
    var result= MutableLiveData<String>()
    @Inject
    lateinit var repo: MainRepo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Intent(this, HelloService::class.java).also { intent ->
            startService(intent)
        }

    }
}