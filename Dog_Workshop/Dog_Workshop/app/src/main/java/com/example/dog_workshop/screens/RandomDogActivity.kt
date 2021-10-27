package com.example.dog_workshop.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.dog_workshop.databinding.ActivityRandomDogBinding
import com.example.dog_workshop.viewmodel.RandomDogViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class RandomDogActivity: AppCompatActivity() {

    private lateinit var randomDogActivityBinding: ActivityRandomDogBinding
    private val viewModel by viewModel<RandomDogViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        randomDogActivityBinding = ActivityRandomDogBinding.inflate(layoutInflater)
        setContentView(randomDogActivityBinding.root)
        setupListener()
        setupObserver()
        viewModel.getRandomDog()
    }

    private fun setupListener() {
        randomDogActivityBinding.randomizeButton.setOnClickListener {
            viewModel.getRandomDog()
        }
    }

    private fun setupObserver() {
        viewModel.dogImage.observe(this) {
            Glide.with(this).load(it).into(randomDogActivityBinding.dogImageView)
        }
    }
}