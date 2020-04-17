package com.example.data

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WeatherRequestGenerator {

    private val httpClient = OkHttpClient.Builder().build()

    private val builder = Retrofit.Builder()
            .baseUrl(WEATHER_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())

    fun <S> createService(serviceClass: Class<S>): S {
        val retrofit = builder.client(httpClient).build()
        return retrofit.create(serviceClass)
    }

    companion object {
        const val API_KEY = "eaa0b49f2f1a2ceadfccae68c4e9d7e3"
        private const val WEATHER_BASE_URL = "http://api.openweathermap.org/data/2.5/"
    }
}