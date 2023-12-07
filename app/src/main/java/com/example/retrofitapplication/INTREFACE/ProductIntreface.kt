package com.example.retrofitapplication.INTREFACE


import com.example.retrofitapplication.RESPONSE.RetrofitResponseItem
import retrofit2.http.GET

interface ProductIntreface {

    @GET("photos")
    suspend fun getProduct() : List<RetrofitResponseItem>
}