package com.example.shoestore.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Shoe(var name: String, var size:Double, var company:String,var description:String)

    :Parcelable {

//var images: List<String> = mutableListOf())
@Parcelize
class Shoes: ArrayList<Shoe>(), Parcelable






















}