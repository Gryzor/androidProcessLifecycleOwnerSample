package com.marconcini.processlifecyclesample

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner

class SampleApp : Application() {

    private val lifecycleListener: SampleLifecycleListener by lazy {
        SampleLifecycleListener()
    }

    override fun onCreate() {
        super.onCreate()
        setupLifecycleListener()
    }

    private fun setupLifecycleListener() {
        ProcessLifecycleOwner.get().lifecycle.addObserver(lifecycleListener)
    }
}