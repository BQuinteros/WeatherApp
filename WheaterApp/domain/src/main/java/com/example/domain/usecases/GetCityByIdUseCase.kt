package com.example.domain.usecases

interface GetCityByIdUseCase {

    operator fun invoke(id: Int): Boolean
}