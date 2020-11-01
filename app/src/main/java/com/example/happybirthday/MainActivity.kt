package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
	System.out.println("testing");
        setContentView(R.layout.activity_main)
    }
}