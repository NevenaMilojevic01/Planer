package com.example.planer.api

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/30list")
    fun fetchAllData(): Call<List<ListData>>
}