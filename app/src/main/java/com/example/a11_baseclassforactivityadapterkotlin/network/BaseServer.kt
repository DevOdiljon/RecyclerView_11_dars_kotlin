package com.example.a11_baseclassforactivityadapterkotlin.network

interface BaseServer {
    companion object{
        val IS_TESTER = true
        val SERVER_DEVELOPMENT = "https://dev_mysite.com/"
        val SERVER_DEPLOYMENT = "https://www.mysite.com/"
    }
}