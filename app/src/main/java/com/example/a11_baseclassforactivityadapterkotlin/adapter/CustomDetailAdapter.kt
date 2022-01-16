package com.example.a11_baseclassforactivityadapterkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a11_baseclassforactivityadapterkotlin.R
import com.example.a11_baseclassforactivityadapterkotlin.model.Member

class CustomDetailAdapter(val members: List<Member>): BaseAdapter() {
    override fun getItemCount(): Int {
        return members.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomMainAdapterDetail {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_detil_view, parent, false)
        return CustomMainAdapterDetail(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = members.get(position)
        if (holder is CustomMainAdapterDetail){
            holder.tv_name_detail.setText(member.tv_name)
            holder.tv_tel_number_detail.setText(member.tv_tel_number)
        }
    }

    class CustomMainAdapterDetail(view: View) : RecyclerView.ViewHolder(view) {
        val tv_name_detail = view.findViewById<TextView>(R.id.tv_name_detail)
        val tv_tel_number_detail = view.findViewById<TextView>(R.id.tv_tel_number_detail)
    }
}