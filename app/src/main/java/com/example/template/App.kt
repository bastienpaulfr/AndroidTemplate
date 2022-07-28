package com.example.template

import android.app.Application
import timber.log.Timber

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        setupLog()
    }

    private fun setupLog() {
        Timber.plant(Timber.DebugTree())
    }
}
