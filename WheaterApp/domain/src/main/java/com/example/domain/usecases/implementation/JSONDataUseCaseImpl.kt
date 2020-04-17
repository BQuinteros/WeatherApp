package com.example.domain.usecases.implementation

import com.example.domain.repositories.CityJSONRepository
import com.example.domain.usecases.JSONDataUseCase
import org.koin.core.KoinComponent
import org.koin.core.inject

class JSONDataUseCaseImpl: JSONDataUseCase, KoinComponent {

    private val cityJSONRepository: CityJSONRepository by inject()

    override fun getJSONData() = cityJSONRepository.getJSONData()

    override fun isNotEmptyData() = cityJSONRepository.isNotEmptyData()

    override fun setJSONData(listOfString: MutableList<String>) {
        cityJSONRepository.setJSONData(listOfString)
    }
}