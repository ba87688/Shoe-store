package com.example.shoestore.fragments.instructionscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.shoestore.R
import com.example.shoestore.databinding.FragmentInstructionsBinding
import com.example.shoestore.viewmodel.ShoeStoreViewModel

class InstructionsFragment : Fragment() {

    private lateinit var viewModel:ShoeStoreViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentInstructionsBinding =  DataBindingUtil
            .inflate(inflater,R.layout.fragment_instructions,container,false)
//            .inflate(inflater,R.layout.shoe_list_destination,container,false)

        viewModel = ViewModelProvider(this).get(ShoeStoreViewModel::class.java)

        viewModel.shoe.observe(viewLifecycleOwner, Observer{it->

            binding.tvShoeName.text =it.name
        })

        // Inflate the layout for this fragment
        return binding.root
    }

}