package com.example.recyclerviewktexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class RecyclerContactAdapter(val context: Context, val arrContact: ArrayList<ContactModel>) :
    RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imgContact: ImageView = itemView.findViewById(R.id.imgContact)
        val txtNumber: TextView = itemView.findViewById(R.id.txtNumber)
        val txtName: TextView = itemView.findViewById(R.id.txtName)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.contact_row, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imgContact.setImageResource(arrContact[position].img)
        holder.txtName.text = arrContact[position].name
        holder.txtNumber.text = arrContact[position].number
    }

    override fun getItemCount(): Int {
        return arrContact.size
    }
}