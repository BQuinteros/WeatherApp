package com.example.domain.repositories

interface CityJSONRepository {

    fun isNotEmptyData(): Boolean

    fun getJSONData(): MutableList<String>

    fun setJSONData(listOfString: MutableList<String>)
}