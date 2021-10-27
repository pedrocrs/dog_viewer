package com.example.dog_workshop.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dog_workshop.databinding.ActivityDogBreedBinding
import com.example.dog_workshop.viewmodel.DogBreedViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class DogBreedActivity: AppCompatActivity() {

    private lateinit var dogBreedActivityBinding: ActivityDogBreedBinding
    private val viewModel by viewModel<DogBreedViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dogBreedActivityBinding = ActivityDogBreedBinding.inflate(layoutInflater)
        setContentView(dogBreedActivityBinding.root)
        setupListeners()
    }

    private fun setupListeners() {
        dogBreedActivityBinding.searchBreedButton.setOnClickListener {
            //TODO call the viewModel to update the imageView, the breed string must be all lowercase
        }
    }
}