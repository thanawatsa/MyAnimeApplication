package com.basthanawat.myanimeapplication.network

import com.basthanawat.myanimeapplication.network.newmodel.Data
import com.basthanawat.myanimeapplication.network.newmodel.dataFromApi
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/v4/anime")
    suspend fun getAllUsers(): Response<dataFromApi>


}
