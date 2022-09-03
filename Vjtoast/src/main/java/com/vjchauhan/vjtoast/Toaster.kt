package com.vjchauhan.vjtoast

import android.content.Context
import android.widget.Toast


class Toaster {
    fun s(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}