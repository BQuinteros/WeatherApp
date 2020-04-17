package com.example.data.services.api

import com.example.data.services.response.CityResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface WeatherApi {

    @GET("weather")
    fun getCityById(@QueryMap filter: HashMap<String, String>): Call<CityResponse>
}