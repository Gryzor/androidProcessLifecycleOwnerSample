package com.marconcini.processlifecyclesample

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log

/**
 * Tracks the Lifecycle of the whole application thanks to {@link LifecycleObserver}.
 * This is registered via {@link ProcessLifecycleOwner#get()} ()}. The events are designed
 * to be dispatched with delay (by design) so activity rotations don't trigger these calls.
 * See: https://developer.android.com/reference/android/arch/lifecycle/ProcessLifecycleOwner.html
 */
class SampleLifecycleListener : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onMoveToForeground() {
        Log.d("LIFECYCLE", "Returning to foreground…")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onMoveToBackground() {
        Log.d("LIFECYCLE", "Moving to background…")
    }
}