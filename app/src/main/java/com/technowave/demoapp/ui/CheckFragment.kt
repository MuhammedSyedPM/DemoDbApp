package com.technowave.demoapp.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.technowave.demoapp.R
import com.technowave.demoapp.databinding.SecondFragmentBinding
import com.technowave.demoapp.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest

@AndroidEntryPoint
class CheckFragment : Fragment(R.layout.second_fragment) {
    lateinit var binding: SecondFragmentBinding

    lateinit var viewModel: MainViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = SecondFragmentBinding.bind(view)

        viewModel = (activity as MainActivity).viewModel



    }


}