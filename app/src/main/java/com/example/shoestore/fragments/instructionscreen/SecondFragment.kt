package com.example.shoestore.fragments.instructionscreen

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController

import androidx.navigation.ui.onNavDestinationSelected
import com.example.shoestore.R
import com.example.shoestore.databinding.ShoeListDestinationBinding
import com.example.shoestore.fragments.adapter.ShoeAdapter
import com.example.shoestore.viewmodel.ShoeStoreViewModel
import timber.log.Timber

class SecondFragment : Fragment() {

    private lateinit var viewModel: ShoeStoreViewModel


    lateinit var ar: SecondFragmentArgs


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)

        val binding: ShoeListDestinationBinding = DataBindingUtil
            .inflate(inflater, R.layout.shoe_list_destination, container, false)
        viewModel = ViewModelProvider(this).get(ShoeStoreViewModel::class.java)


//
//        val shoe1 = Shoe("Evan",11.2,"Nike","Crappy shoes")
//        val shoe2 = Shoe("Evan",11.2,"Nike","Crappy shoes")
//        val shoe3 = Shoe("Evan",11.2,"Nike","Crappy shoes")
//
//        val listOfShoes = mutableListOf<Shoe>(shoe1,shoe2,shoe2)


        var ar = arguments?.let { SecondFragmentArgs.fromBundle(it) }
        if (ar?.shoeH?.name!=null){
            Timber.i(""+ar.shoeH)
            viewModel.shoeList.value?.add(ar.shoeH!!)



//
//            val layout = binding.crazyLayout
//            var textView =TextView(context)
//            textView.text = ar.shoeH!!.name
//            layout.addView(textView)

        }
        viewModel.shoeList.observe(viewLifecycleOwner, Observer { it ->

            binding.recyclerView.adapter = ShoeAdapter(it)


        })


        //Floating action button click listener
        binding.floatingActionButton.setOnClickListener { it ->
            Timber.i("Clicked action buttom")
            it.findNavController().navigate(R.id.action_secondFragment_to_shoeDetailFragment)


        }
        return binding.root
    }

    fun onFabClicked() {
        Timber.i("Clicked action buttom")


    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {

        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.logout_menu, menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        Timber.i("clicked on teh menu")

        val navContoller = requireView().findNavController()
        return item.onNavDestinationSelected(navContoller)


//        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
//                || super.onOptionsItemSelected(item)

    }
}