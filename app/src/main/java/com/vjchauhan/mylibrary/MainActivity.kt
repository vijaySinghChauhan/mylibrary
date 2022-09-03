package com.vjchauhan.mylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vjchauhan.vjtoast.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toaster.s(this,"")
    }
}