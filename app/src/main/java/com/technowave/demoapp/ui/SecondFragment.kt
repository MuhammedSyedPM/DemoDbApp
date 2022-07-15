package com.technowave.demoapp.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.technowave.demoapp.R
import com.technowave.demoapp.databinding.SecondFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SecondFragment : Fragment(R.layout.second_fragment) {
    lateinit var binding: SecondFragmentBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = SecondFragmentBinding.bind(view)

    }


}