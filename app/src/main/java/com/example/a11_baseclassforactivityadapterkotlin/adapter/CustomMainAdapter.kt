package com.example.a11_baseclassforactivityadapterkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a11_baseclassforactivityadapterkotlin.R
import com.example.a11_baseclassforactivityadapterkotlin.activity.MainActivity
import com.example.a11_baseclassforactivityadapterkotlin.model.Member

class CustomMainAdapter(val activity: MainActivity, val members: List<Member>): BaseAdapter() {

    override fun getItemCount(): Int {
        return members.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_main_view, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = members.get(position)
        if (holder is CustomViewHolder){
            holder.tv_name.setText(member.tv_name)
            holder.tv_tel_number.setText(member.tv_tel_number)

            holder.LinearLayout.setOnClickListener {
                activity.openDetailActivity()
            }
        }
    }

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tv_name = view.findViewById<TextView>(R.id.tv_name_main)
        val tv_tel_number = view.findViewById<TextView>(R.id.tv_tel_number_main)
        val LinearLayout = view.findViewById<LinearLayout>(R.id.LinearLayout_main)
    }
}