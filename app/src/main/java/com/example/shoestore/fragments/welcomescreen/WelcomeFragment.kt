package com.example.shoestore.fragments.welcomescreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.shoestore.R
import com.example.shoestore.databinding.FragmentInstructionsBinding
import com.example.shoestore.databinding.FragmentWelcomeBinding
import com.example.shoestore.databinding.LoginFragmentBinding
import timber.log.Timber

class WelcomeFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentInstructionsBinding = DataBindingUtil
            .inflate(inflater,R.layout.fragment_instructions,container,false)




        binding.buttonToShoeList.setOnClickListener { view:View->
            view.findNavController().navigate(R.id.action_welcomeFragment_to_instructionsFragment)

            Timber.i("Sign up Button")
        }
        binding.freeButton.setOnClickListener { view:View->
            view.findNavController().navigate(R.id.action_welcomeFragment_to_secondFragment)

            Timber.i("Sign up Button")
        }


        return binding.root
    }

}