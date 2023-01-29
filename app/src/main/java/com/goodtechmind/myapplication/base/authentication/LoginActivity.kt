package com.goodtechmind.myapplication.base.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.goodtechmind.myapplication.MainActivity
import com.goodtechmind.myapplication.R
import com.goodtechmind.myapplication.base.DashboardActivity
import com.goodtechmind.myapplication.customization.CustomerProgressDialog
import com.goodtechmind.myapplication.databinding.ActivityLoginBinding
import com.goodtechmind.myapplication.retrofit.ApiInterface
import com.goodtechmind.myapplication.retrofit.RetrofitClient

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding
    lateinit var dialog : CustomerProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        dialog = CustomerProgressDialog(this)

        binding.loginBtn.setOnClickListener {


            val username = binding.loginUsername.text.toString().trim()
            val password = binding.loginPassword.text.toString().trim()

            if (TextUtils.isEmpty(username)){
                binding!!.loginUsername.error="Username required"
            }else if (TextUtils.isEmpty(password)){
                binding!!.loginPassword.error="Password required"
            }else{

                login()

            }
        }

    }

    private fun login() {

        dialog.show()
        var retrofit = RetrofitClient.getInstance()
        var apiInterface = retrofit.create(ApiInterface::class.java)
        lifecycleScope.launchWhenCreated {
            try {
                val response = apiInterface.loginUser(binding!!.loginUsername.text.toString().trim(),binding!!.loginPassword.text.toString().trim())
                if (response.isSuccessful){
                    dialog.dismiss()
                    Toast.makeText(this@LoginActivity,"Logged In Successfully", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this@LoginActivity,MainActivity::class.java))
                }else{
                    dialog.dismiss()
                    Toast.makeText(this@LoginActivity,"Please enter the right credentials", Toast.LENGTH_SHORT).show()
                }
            }catch (Ex:java.lang.Exception){

                dialog.dismiss()
                Toast.makeText(this@LoginActivity,Ex.localizedMessage, Toast.LENGTH_SHORT).show()

                Log.e("Error ",Ex.localizedMessage)
            }
        }

    }
}