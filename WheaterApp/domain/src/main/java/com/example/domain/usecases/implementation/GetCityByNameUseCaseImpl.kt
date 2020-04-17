package com.example.domain.usecases.implementation

import com.example.domain.entities.City
import com.example.domain.usecases.GetCityByNameUseCase
import com.example.domain.utils.ZERO

class GetCityByNameUseCaseImpl: GetCityByNameUseCase {

    override fun invoke(listOfCity: MutableList<City>, name: String): Int {
        for (i in ZERO until listOfCity.size) {
            if (listOfCity[i].name.equals(name)) {
                return listOfCity[i].id
            }
        }
        return ZERO
    }
}