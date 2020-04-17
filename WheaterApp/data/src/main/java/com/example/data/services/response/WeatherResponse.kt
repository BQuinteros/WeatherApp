package com.example.data.services.response

import com.example.data.utils.DEFAULT_ID
import com.example.data.utils.NOT_FOUND

data class WeatherResponse(
        val id: Int = DEFAULT_ID,
        val main: String = NOT_FOUND,
        val description: String = NOT_FOUND,
        val icon: String = NOT_FOUND
)