package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

	System.out.println("testing in new branch");

        setContentView(R.layout.activity_main)
    }
}