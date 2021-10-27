package com.example.dog_workshop.injection

import com.example.dog_workshop.R
import com.example.dog_workshop.repository.DogRepository
import com.example.dog_workshop.viewmodel.DogBreedViewModel
import com.example.dog_workshop.viewmodel.RandomDogViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val dogModule = module {
    single<Retrofit> {
        Retrofit.Builder().baseUrl(androidContext().getString(R.string.base_url))
            .addConverterFactory(MoshiConverterFactory.create()).build()
    }

    single { DogRepository(get()) }

    viewModel<RandomDogViewModel> { RandomDogViewModel(get()) }

    viewModel<DogBreedViewModel> { DogBreedViewModel(get()) }
}