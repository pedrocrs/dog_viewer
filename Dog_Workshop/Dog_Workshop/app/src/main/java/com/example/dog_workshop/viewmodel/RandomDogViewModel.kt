package com.example.dog_workshop.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dog_workshop.repository.DogRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RandomDogViewModel(private val dogRepository: DogRepository): ViewModel() {

    private val _dogImage = MutableLiveData<String>()
    val dogImage: LiveData<String> = _dogImage

    fun getRandomDog() {
        viewModelScope.launch(Dispatchers.IO) {
            val dogResponse = dogRepository.getRandomDogImage()
            _dogImage.postValue(dogResponse.message)
        }
    }
}