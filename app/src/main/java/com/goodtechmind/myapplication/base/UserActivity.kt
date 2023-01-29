package com.goodtechmind.myapplication.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.goodtechmind.myapplication.R
import com.goodtechmind.myapplication.databinding.ActivityUser2Binding

class UserActivity : AppCompatActivity() {

    lateinit var binding: ActivityUser2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUser2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = this.intent
        if (intent != null) {
            val name = intent.getStringExtra("name")
            val phone = intent.getStringExtra("phone")
            val country = intent.getStringExtra("country")
            val imageid = intent.getIntExtra("imageid", R.drawable.a)
            binding.namep.text = name
            binding.number.text = phone
            binding.con.text = country
            binding.profileImahe.setImageResource(imageid)
        }
    }
}