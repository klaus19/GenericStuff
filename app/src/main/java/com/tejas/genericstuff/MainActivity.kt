package com.tejas.genericstuff

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tejas.genericstuff.seperate.Prototype

class MainActivity : Prototype() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeViews()
    }

    private fun initializeViews() {
        setScreenTitle("Mseb Exam")
    }
}