package com.example.shoestore.fragments.instructionscreen

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.shoestore.R
import com.example.shoestore.databinding.FragmentInstructionsBinding
import com.example.shoestore.databinding.ShoeListDestinationBinding
import timber.log.Timber

class SecondFragment: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        setHasOptionsMenu(true)

        val binding:ShoeListDestinationBinding=  DataBindingUtil
            .inflate(inflater,R.layout.shoe_list_destination,container,false)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {

        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.logout_menu, menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        Timber.i("clicked on teh menu")
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)    }
}