package com.jaytaravia.retrofit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val list:ArrayList<DataModelItem>, val context: Context):RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.design_layout,parent,false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val currentItem = list[position]

        holder.apply {

            userIdTxt.text= currentItem.userId.toString()
            idTxt.text= currentItem.id.toString()
            titleTxt.text= currentItem.title
            bodyTxt.text= currentItem.body

        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        val userIdTxt: TextView=itemView.findViewById(R.id.user_id_txt)
        val idTxt: TextView = itemView.findViewById(R.id.id_txt)
        val titleTxt: TextView = itemView.findViewById(R.id.title_txt)
        val bodyTxt: TextView= itemView.findViewById(R.id.body_txt)

    }
}