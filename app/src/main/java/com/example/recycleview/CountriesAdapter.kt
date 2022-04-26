package com.example.recycleview

import com.example.recycleview.R
import android.widget.TextView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.UserDto

class CountriesAdapter(var items: ArrayList<UserDto>): RecyclerView.Adapter<CountriesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.city_list_row, parent, false)

        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int
    {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        val userDto = items[position]
        holder.txtName?.text = userDto.country
        holder.txtComment?.text = userDto.city
    }

    class ViewHolder(row: View) : RecyclerView.ViewHolder(row)
    {
        var txtName: TextView? = null
        var txtComment: TextView? = null
        init
        {
            this.txtName = row.findViewById<TextView>(R.id.txtName)
            this.txtComment = row.findViewById<TextView>(R.id.txtComment)
        }
    }
}