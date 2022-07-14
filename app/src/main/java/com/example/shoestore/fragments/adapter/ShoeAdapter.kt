package com.example.shoestore.fragments.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoestore.R
import com.example.shoestore.models.Shoe
import kotlinx.android.synthetic.main.shoe_list_view.view.*

class ShoeAdapter (val list:List<Shoe>) :RecyclerView.Adapter<ShoeAdapter.ShoeViewHolder>(){

    inner class ShoeViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shoe_list_view,parent,false)
        return ShoeViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShoeViewHolder, position: Int) {
        val current = list[position]
        holder.itemView.apply {
            tv_rv_shoe_name.text= current.name
            tv_rv_shoe_size.text = current.size.toString()
            tv_rv_shoe_description.text = current.description
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }


}