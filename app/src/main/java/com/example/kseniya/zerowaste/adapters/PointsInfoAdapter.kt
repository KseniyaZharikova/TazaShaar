package com.example.kseniya.zerowaste.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.kseniya.zerowaste.R
import com.example.kseniya.zerowaste.data.ReceptionPoint

class PointsInfoAdapter(private val myDataset: List<ReceptionPoint>) : RecyclerView.Adapter<PointsInfoAdapter.MyViewHolder>() {

    class MyViewHolder(val v: View) : RecyclerView.ViewHolder(v) {
        val tvName= v.findViewById<TextView>(R.id.tvName)
        val tvAddress= v.findViewById<TextView>(R.id.tvAddress)
        val tvPhone= v.findViewById<TextView>(R.id.tvPhone)
        val tvWorkTime= v.findViewById<TextView>(R.id.tvWorkTime)
        val tvPrice= v.findViewById<TextView>(R.id.tvPrice)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PointsInfoAdapter.MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.item_point_info, parent, false))
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.tvName.text = myDataset[position].name
        holder.tvAddress.text = myDataset[position].address
        holder.tvPhone.text = myDataset[position].phone
        holder.tvWorkTime.text = myDataset[position].work_time
        holder.tvPrice.text = myDataset[position].price

    }


    override fun getItemCount() = myDataset.size

}

