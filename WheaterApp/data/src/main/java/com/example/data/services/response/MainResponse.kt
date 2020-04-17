package com.example.data.services.response

import com.example.data.utils.DEFAULT_TEMP

class MainResponse(
        val temp: Double = DEFAULT_TEMP,
        val feels_like: Double = DEFAULT_TEMP,
        val temp_min: Double = DEFAULT_TEMP,
        val temp_max: Double = DEFAULT_TEMP,
        val pressure: Double = DEFAULT_TEMP,
        val humidity: Double = DEFAULT_TEMP,
        val sea_level: Double = DEFAULT_TEMP,
        val grnd_level: Double = DEFAULT_TEMP
)