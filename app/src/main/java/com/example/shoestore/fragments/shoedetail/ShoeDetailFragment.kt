package com.example.shoestore.fragments.shoedetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.shoestore.R
import com.example.shoestore.databinding.FragmentShoeDetailBinding

class ShoeDetailFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding:FragmentShoeDetailBinding = DataBindingUtil
            .inflate(inflater,R.layout.fragment_shoe_detail,container,false)

        binding.buttonCancelShoe.setOnClickListener {view->
            view.findNavController().navigate(R.id.action_shoeDetailFragment_to_secondFragment)
        }
        binding.buttonSaveShoe.setOnClickListener {

        }

        return binding.root
    }


}