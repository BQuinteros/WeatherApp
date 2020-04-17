package com.example.data.services.response

import com.example.data.utils.DEFAULT_ID
import com.example.data.utils.NOT_FOUND

data class CityResponse(
        val id: Int = DEFAULT_ID,
        val name: String = NOT_FOUND,
        val weather: ArrayList<WeatherResponse>,
        val main: MainResponse
)