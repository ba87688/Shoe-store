package com.example.shoestore.fragments.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.shoestore.R
import com.example.shoestore.databinding.LoginFragmentBinding
import timber.log.Timber

class LoginFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding:LoginFragmentBinding = DataBindingUtil
            .inflate(inflater,R.layout.login_fragment,container,false)



        binding.buttonLogin.setOnClickListener { view:View->
//           Navigation.findNavController(view).navigate(R.id.action_loginFragment2_to_welcomeFragment2)
            view.findNavController().navigate(R.id.action_loginFragment_to_welcomeFragment)

            Timber.i("Log in Button")
        }
        binding.buttonSignUp.setOnClickListener { view:View->
            view.findNavController().navigate(R.id.action_loginFragment_to_welcomeFragment)

            Timber.i("Sign up Button")
        }
        return binding.root

    }
}