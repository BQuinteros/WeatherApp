package com.example.data.repositories

import com.example.data.utils.JSONData
import com.example.domain.repositories.CityJSONRepository

class CityJSONRepositoryImpl : CityJSONRepository {

    override fun getJSONData() = JSONData.getJSON()

    override fun isNotEmptyData(): Boolean {
        return JSONData.isNotEmpty()
    }

    override fun setJSONData(listOfString: MutableList<String>) {
        JSONData.setJSON(listOfString)
    }
}