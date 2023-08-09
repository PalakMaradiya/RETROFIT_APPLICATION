package com.example.retrofitapplication.INTREFACE

import com.example.retrofitapplication.RESPONSE.RetrofitResponse
import retrofit2.http.GET

interface ProductIntreface {

    @GET("products")
    suspend fun getProduct() : retrofit2.Response<RetrofitResponse>
}