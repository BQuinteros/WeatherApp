package com.example.weatherapp

import android.app.Application
import com.example.di.useCasesModule
import com.example.di.repositoriesModule
import com.example.weatherapp.di.viewModelsModule
import org.koin.core.context.startKoin

class SampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(listOf(viewModelsModule, useCasesModule, repositoriesModule))
        }
    }
}