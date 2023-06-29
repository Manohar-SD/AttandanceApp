package com.example.attandanceapp

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class CustomAdaptor(val myList:ArrayList<ItemsModel>):RecyclerView.Adapter<CustomAdaptor.ViewHolder>() {
    class ViewHolder (ItemView: View):RecyclerView.ViewHolder(ItemView){
        val image:ImageView = itemView.findViewById(R.id.image)
        val name:TextView = itemView.findViewById(R.id.name)
        val description:TextView=itemView.findViewById(R.id.description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}