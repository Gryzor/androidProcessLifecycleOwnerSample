package com.marconcini.processlifecyclesample

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ProcessLifecycleOwner

/**
 * Tracks the Lifecycle of the whole application thanks to [DefaultLifecycleObserver].
 * This is registered via [ProcessLifecycleOwner] The events are designed
 * to be dispatched with delay (by design) so activity rotations don't trigger these calls.
 * See: https://developer.android.com/reference/android/arch/lifecycle/ProcessLifecycleOwner.html
 */
class SampleLifecycleListener : DefaultLifecycleObserver {

    override fun onStart(owner: LifecycleOwner) {
        Log.d("SampleLifecycle", "Returning to foreground…")
    }

    override fun onStop(owner: LifecycleOwner) {
        Log.d("SampleLifecycle", "Moving to background…")
    }
}