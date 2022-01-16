package com.example.a11_baseclassforactivityadapterkotlin.activity

import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.a11_baseclassforactivityadapterkotlin.R
import com.example.a11_baseclassforactivityadapterkotlin.adapter.CustomMainAdapter
import com.example.a11_baseclassforactivityadapterkotlin.model.Member
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        val members = prepareMemberList()
        refreshAdapter(members)
    }

    private fun refreshAdapter(members: List<Member>) {
        val adapter = CustomMainAdapter(this, members)
        recyclerView_main.adapter = adapter
    }

    fun initViews(){
        recyclerView_main.layoutManager = GridLayoutManager(this, 1)
    }

    fun openDetailActivity(){
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }

}