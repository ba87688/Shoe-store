package com.example.shoestore.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoestore.fragments.adapter.ShoeAdapter
import com.example.shoestore.models.Shoe
import timber.log.Timber

class ShoeStoreViewModel:ViewModel() {

    private lateinit var list :List<Shoe>
    lateinit var shoe: MutableLiveData<Shoe>
    lateinit var shoeList: MutableLiveData<MutableList<Shoe>>




    init {

        createList()
    }

    fun createList(){
        list =  mutableListOf<Shoe>(Shoe("Evan",11.1,"Nike","Idiot"))
        shoe = MutableLiveData()

        shoe.value = list.get(0)




        val shoe1 = Shoe("Evan",11.2,"Nike","Crappy shoes")
        val shoe2 = Shoe("Evan",11.2,"Nike","Crappy shoes")
        val shoe3 = Shoe("Evan",11.2,"Nike","Crappy shoes")
        shoeList =  MutableLiveData()

        shoeList = MutableLiveData<MutableList<Shoe>>()
        shoeList.value = mutableListOf(shoe1,shoe2,shoe3)






    }

    fun onFabClicked(){
        Timber.i("Clicked fab")


    }
    override fun onCleared() {
        super.onCleared()
    }
}