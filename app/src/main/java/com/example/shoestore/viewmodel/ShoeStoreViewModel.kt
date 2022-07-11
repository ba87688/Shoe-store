package com.example.shoestore.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoestore.models.Shoe
import timber.log.Timber

class ShoeStoreViewModel:ViewModel() {

    private lateinit var list :List<Shoe>
    lateinit var shoe: MutableLiveData<Shoe>



    init {

        createList()
    }

    fun createList(){
        list =  mutableListOf<Shoe>(Shoe("Evan",11.1,"Nike","Idiot"))
        shoe = MutableLiveData()
        shoe.value = list.get(0)

    }

    fun onFabClicked(){
        Timber.i("Clicked fab")


    }
    override fun onCleared() {
        super.onCleared()
    }
}