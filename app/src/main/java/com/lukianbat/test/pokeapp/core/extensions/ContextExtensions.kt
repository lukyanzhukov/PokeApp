package com.lukianbat.test.pokeapp.core.extensions

import android.content.Context
import android.widget.Toast

fun Context.toast(message: String, duration: Duration = Duration.LONG) {
    val toastDuration = when (duration) {
        Duration.LONG -> Toast.LENGTH_LONG
        Duration.SHORT -> Toast.LENGTH_SHORT
    }

    Toast.makeText(this, message, toastDuration).show()
}

enum class Duration {
    SHORT,
    LONG
}