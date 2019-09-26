package com.mykotlinapplication.kotlin23

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.animal_list_item.view.*

class AnimalAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    // Inflates the items views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.animal_list_item, parent, false))
    }

    // Binds each animal in the ArrayList to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.tvAnimalType?.text = items.get(position)
        holder?.tvAnimalType2?.text = items.get(position)
        holder?.tvAnimalType3?.text = items.get(position)

        Glide.with(context).load("https://s3.amazonaws.com/appsdeveloperblog/Micky.jpg").into(holder.animalImage)


    }

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val tvAnimalType = view.tv_animal_type
    val tvAnimalType2 = view.tv_animal_type2
    val tvAnimalType3 = view.tv_animal_type3
    val animalImage = view.imageView

}