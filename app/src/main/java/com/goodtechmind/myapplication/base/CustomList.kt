package com.goodtechmind.myapplication.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.goodtechmind.myapplication.R

class CustomList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list)
    }
}