package com.vjchauhan.vjtoast

import android.content.Context
import android.widget.Toast


object  Toaster {
    fun call(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}