package com.example.atease.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AnxietyRepository (val service: ApiInterface){
    suspend fun fetchStress(accessToken: String)
    = withContext(Dispatchers.IO){
        var response = service.fetchStress(accessToken)
        response.body()



    }
}

