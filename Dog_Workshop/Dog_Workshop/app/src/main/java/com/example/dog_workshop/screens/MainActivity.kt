package com.example.dog_workshop.screens

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dog_workshop.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {
    private lateinit var mainActivityBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityBinding.root)
        setupListeners()
    }

    private fun setupListeners(): Unit {
        mainActivityBinding.randomButton.setOnClickListener {
            val intent = Intent(this, RandomDogActivity::class.java)
            startActivity(intent)
        }

        //TODO add navigation to DogBreedActivity on breedButton click
    }
}