package com.example.a11_baseclassforactivityadapterkotlin.activity

import androidx.appcompat.app.AppCompatActivity
import com.example.a11_baseclassforactivityadapterkotlin.model.Member
import com.example.a11_baseclassforactivityadapterkotlin.network.BaseServer

open class BaseActivity: AppCompatActivity()  {

    protected fun grtServer():String{
        return if (BaseServer.IS_TESTER){
            BaseServer.SERVER_DEVELOPMENT
        } else{
            BaseServer.SERVER_DEPLOYMENT
        }
    }

    protected fun isEmpty(s:String?):Boolean{
        return s == null||s.trim{it<=' '}.isEmpty()
    }
    protected fun prepareMemberList():List<Member>{
        val members = ArrayList<Member>()

        for (i in 0..30 step 1){
            members.add(Member("Odilbek $i", "+998 97 775 17 79"))
        }

        return members
    }
}