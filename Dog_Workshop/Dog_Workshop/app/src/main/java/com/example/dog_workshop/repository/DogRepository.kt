package com.example.dog_workshop.repository

import com.example.dog_workshop.models.DogModel
import retrofit2.Retrofit

class DogRepository(retrofit: Retrofit) {

    private val service = retrofit.create(DogService::class.java)

    suspend fun getRandomDogImage(): DogModel {
        return service.getRandomDoggo()
    }

    //TODO create suspend function to get the dog breed image
}