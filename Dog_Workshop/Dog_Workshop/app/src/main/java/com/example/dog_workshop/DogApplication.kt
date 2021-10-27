package com.example.dog_workshop

import android.app.Application
import com.example.dog_workshop.injection.dogModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class DogApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger()
            androidContext(this@DogApplication)
            modules(dogModule)
        }
    }
}