package com.example.planer.api

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.planer.R
import kotlinx.android.synthetic.main.row_30list.view.*

class ListDataAdapter(private val listData: List<ListData>) : RecyclerView.Adapter<ListDataAdapter.ViewHolder>(){
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val description: TextView = itemView.description
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_30list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val list = listData[position]
        Log.d("list", "description? ${list.description}")
        holder.description.text = list.description
    }

    override fun getItemCount() = listData.size

}
