package com.example.data.services

import com.example.data.WeatherRequestGenerator
import com.example.data.services.api.WeatherApi
import com.example.domain.servicies.WeatherCityService

class WeatherCityServiceImpl : WeatherCityService {

    private val api: WeatherRequestGenerator = WeatherRequestGenerator()

    override fun getCityById(id: Int): Boolean {
        val queryHashMap = LinkedHashMap<String, String>()
        queryHashMap.put(ID, id.toString())
        queryHashMap.put(APPID, WeatherRequestGenerator.API_KEY)
        val callResponse = api.createService(WeatherApi::class.java).getCityById(queryHashMap)
        val response = callResponse.execute()
        if (response != null) {
            return true
        }
        return false
    }

    companion object {
        private const val ID = "id"
        private const val APPID = "APPID"
    }
}