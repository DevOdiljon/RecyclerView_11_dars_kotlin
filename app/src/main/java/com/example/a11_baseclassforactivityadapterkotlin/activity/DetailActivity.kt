package com.example.a11_baseclassforactivityadapterkotlin.activity

import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.a11_baseclassforactivityadapterkotlin.R
import com.example.a11_baseclassforactivityadapterkotlin.adapter.CustomDetailAdapter
import com.example.a11_baseclassforactivityadapterkotlin.model.Member
import kotlinx.android.synthetic.main.activity_detail.*


class DetailActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        initViews()
        val members = prepareMemberList()
        refreshAdapter(members)
    }

    private fun refreshAdapter(members: List<Member>) {
        val adapter = CustomDetailAdapter(members)
        recyclerView_detail.adapter = adapter

    }

    fun initViews(){
        recyclerView_detail.layoutManager = GridLayoutManager(this, 1)
    }
}