package com.technowave.demoapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.MutableLiveData
import com.technowave.demoapp.communicator.Connector
import com.technowave.demoapp.databinding.ActivityMainBinding
import com.technowave.demoapp.databinding.ActivityOneBinding
import com.technowave.demoapp.model.DemoTable
import com.technowave.demoapp.repository.MainRepo
import com.technowave.demoapp.service.HelloService
import com.technowave.demoapp.utils.Constants.TAG
import com.technowave.demoapp.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {
    val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "SECOND ACTIVITY")
        binding.title.text = "SECOND ACTIVITY"

        binding.btnGo.setOnClickListener {

            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }


    }


}