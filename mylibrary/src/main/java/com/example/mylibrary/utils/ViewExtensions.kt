package com.example.mylibrary.utils

import android.content.Context
import android.view.View
import android.widget.Toast

    // 1. Easily toggle visibility
    fun View.gone() { visibility = View.GONE }
    fun View.visible() { visibility = View.VISIBLE }
    fun View.invisible() { visibility = View.INVISIBLE }

    // 2. Quick Toast extension
    fun Context.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
}
