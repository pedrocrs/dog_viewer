package com.example.dog_workshop.repository

import com.example.dog_workshop.models.DogModel
import retrofit2.http.GET
import retrofit2.http.Path

interface DogService {

    @GET("breeds/image/random")
    suspend fun getRandomDoggo(): DogModel

    @GET("breed/{dogBreed}/images/random")
    suspend fun getDoggoByBreed(@Path("dogBreed") dogBreed: String): DogModel
}