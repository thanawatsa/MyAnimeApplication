package com.basthanawat.myanimeapplication

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.basthanawat.myanimeapplication.network.ApiService
import com.basthanawat.myanimeapplication.network.Retrofit
import com.basthanawat.myanimeapplication.network.newmodel.Data
import com.google.gson.Gson


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getAnimeList()

    }

    private fun getAnimeList() {
        var retrofit = Retrofit.getInstance()
        var apiInterface = retrofit.create(ApiService::class.java)
        lifecycleScope.launchWhenCreated {
            try {
                val response = apiInterface.getAllUsers()
                if (response.isSuccessful) {
                    var json = Gson().toJson(response.body())
                    if (response.body()?.data?.size!! <= 0) {
                        Toast.makeText(
                            this@MainActivity,
                            "No Data ",
                            Toast.LENGTH_LONG
                        ).show()
                    } else {
                        initRecyclerView(response.body()!!.data)
                    }
                } else {
                    Toast.makeText(
                        this@MainActivity,
                        response.errorBody().toString(),
                        Toast.LENGTH_LONG
                    ).show()
                }
            } catch (Ex: Exception) {
                Log.e("Error", Ex.localizedMessage)
            }
        }
    }

    private fun initRecyclerView(data: List<Data>?) {
        val animeRecycler : RecyclerView = findViewById(R.id.AnimeList)
        animeRecycler.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = AnimeListAdapter(data){
                DetailActivity.init(this@MainActivity,it)
            }

        }


    }
}
