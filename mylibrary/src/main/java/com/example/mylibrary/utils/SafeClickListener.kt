package com.example.mylibrary.utils

import android.view.View

class SafeClickListener(
    private val defaultInterval: Int = 1000,
    private val onSafeClick: (View) -> Unit
) : View.OnClickListener {
    private var lastTimeClicked: Long = 0

    override fun onClick(v: View) {
        if (System.currentTimeMillis() - lastTimeClicked < defaultInterval) {
            return
        }
        lastTimeClicked = System.currentTimeMillis()
        onSafeClick(v)
    }
}

// Extension function to make it easy to use
fun View.setSafeOnClickListener(onSafeClick: (View) -> Unit) {
    val safeClickListener = SafeClickListener {
        onSafeClick(it)
    }
    setOnClickListener(safeClickListener)
}