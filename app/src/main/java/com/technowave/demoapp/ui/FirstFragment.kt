package com.technowave.demoapp.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import com.technowave.demoapp.R
import com.technowave.demoapp.databinding.FirstFragmentBinding
import com.technowave.demoapp.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import java.util.*


@AndroidEntryPoint
class FirstFragment : Fragment(R.layout.first_fragment) {
    lateinit var binding: FirstFragmentBinding
    lateinit var viewModel: MainViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FirstFragmentBinding.bind(view)

        viewModel = (activity as MainActivity).viewModel

        setupFragment()
    }

    private fun setupFragment() {
       /* lifecycleScope.launchWhenCreated {
            viewModel.latestNews.collect {
                Log.d("Linoop onCreated",it.toString())
            }
        }*/
       /* lifecycleScope.launchWhenCreated {
            viewModel.sateFlowData.collectLatest {
               delay(2000)
                Log.d("Linoop onCreated",it.toString()) }
        }*/
         lifecycleScope.launchWhenCreated {
            viewModel.sharedFlowData.collectLatest {

                Log.d("Linoop first frag",it.toString()) }
        }



        viewModel.errorToast.observe(viewLifecycleOwner) {
            context?.showToast(it.toString())
        }


        lifecycleScope.launchWhenCreated {
        viewModel.sharedFlowToast.collect {
            context?.showToast(it.toString())
        }}

        binding.btnFirst.setOnClickListener {
           //viewModel.toast(1)
          //goToSecond()
        }

        binding.btnSecond.setOnClickListener {
            viewModel.toast(2)
            goToSecond()
        }
    }

    private fun goToSecond() {
        val directions = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
        view?.findNavController()?.navigate(directions)
    }

}