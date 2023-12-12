package com.example.planer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.planer.api.ApiService
import com.example.planer.api.ListData
import com.example.planer.api.ListDataAdapter
import kotlinx.android.synthetic.main.activity_recycler_view_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RecyclerViewList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_list)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://demo4216223.mockable.io")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api = retrofit.create(ApiService::class.java)

        api.fetchAllData().enqueue(object : Callback<List<ListData>> {
            override fun onResponse(call: Call<List<ListData>>, response: Response<List<ListData>>) {
                Log.d("Get tatto", response.body().toString())
                showData(response.body()!!)
            }

            override fun onFailure(call: Call<List<ListData>>, t: Throwable) {
                Log.d("Get tatto", t.toString())
            }

        })
    }

    private fun showData(listData: List<ListData>) {
        recyclerview30List.apply {
            layoutManager = LinearLayoutManager(this@RecyclerViewList)
            adapter = ListDataAdapter(listData)
        }
    }


}