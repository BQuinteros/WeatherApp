package com.example.domain.usecases.implementation

import com.example.domain.servicies.WeatherCityService
import com.example.domain.usecases.GetCityByIdUseCase
import org.koin.core.KoinComponent
import org.koin.core.inject

class GetCityByIdUseCaseImpl() : GetCityByIdUseCase, KoinComponent {

    private val weatherCityService: WeatherCityService by inject()

    override fun invoke(id: Int) = weatherCityService.getCityById(id)
}