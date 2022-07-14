package com.example.shoestore.fragments.shoedetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.shoestore.R
import com.example.shoestore.databinding.FragmentShoeDetailBinding
import com.example.shoestore.fragments.instructionscreen.SecondFragmentDirections
import com.example.shoestore.fragments.login.LoginFragmentDirections
import com.example.shoestore.models.Shoe
import com.example.shoestore.viewmodel.ShoeStoreViewModel
import timber.log.Timber

class ShoeDetailFragment : Fragment() {


    private lateinit var viewModel: ShoeStoreViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding:FragmentShoeDetailBinding = DataBindingUtil
            .inflate(inflater,R.layout.fragment_shoe_detail,container,false)

        viewModel = ViewModelProvider(this).get(ShoeStoreViewModel::class.java)




        binding.buttonCancelShoe.setOnClickListener {view->
            view.findNavController().navigate(R.id.action_shoeDetailFragment_to_secondFragment)
//            view.findNavController().navigate(ShoeDetailFragmentDirections.actionShoeDetailFragmentToSecondFragment(shoeName = "Name"))

        }

        binding.buttonSaveShoe.setOnClickListener {view->

            val shoeName = binding.etShoeName.toString()
            val shoeNum = binding.etShoeSize.toString()
            val shoeCompany = binding.etShoeCompany.toString()
            val shoeDescription = binding.etShoeDescription.toString()
            val shoeToPass = Shoe("shoeName",1.2,"shoeCompany","shoeDescription")



//            view.findNavController().navigate(R.id.action_shoeDetailFragment_to_secondFragment)


            var action = ShoeDetailFragmentDirections.actionShoeDetailFragmentToSecondFragment(shoeToPass)
            view.findNavController().navigate(action)


        }

        return binding.root
    }


}