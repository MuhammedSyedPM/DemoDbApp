package com.technowave.demoapp.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.technowave.demoapp.R
import com.technowave.demoapp.communicator.Connector
import com.technowave.demoapp.databinding.FirstFragmentBinding
import dagger.hilt.android.AndroidEntryPoint
import java.util.*


@AndroidEntryPoint
class FirstFragment : Fragment(R.layout.first_fragment) {
    lateinit var binding: FirstFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FirstFragmentBinding.bind(view)


    }


}