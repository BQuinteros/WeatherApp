package com.example.domain.usecases

import com.example.domain.entities.City

interface GetCityByNameUseCase {

    operator fun invoke(listOfCity:MutableList<City>, name: String): Int
}