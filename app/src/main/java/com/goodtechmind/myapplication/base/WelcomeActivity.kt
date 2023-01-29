package com.goodtechmind.myapplication.base

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.goodtechmind.myapplication.R
import com.goodtechmind.myapplication.base.authentication.LoginActivity
import com.goodtechmind.myapplication.customization.CustomerProgressDialog
import com.goodtechmind.myapplication.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

            Handler().postDelayed({
                //dialog.dismiss()
                val intent = Intent(this@WelcomeActivity, LoginActivity::class.java)
                startActivity(intent)
                finish()
            },2000)

    }
}