package com.example.dog_workshop.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dog_workshop.repository.DogRepository

class DogBreedViewModel(private val dogRepository: DogRepository): ViewModel() {

    private val _dogBreedResponse = MutableLiveData<String>()
    val dogBreedResponse: LiveData<String> = _dogBreedResponse

    fun getDogBreedImage() {
        //TODO call the repository to get the image
    }
}