package com.goodtechmind.myapplication.base

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import com.goodtechmind.myapplication.R
import com.goodtechmind.myapplication.databinding.ActivitySalaryBinding
import java.util.ArrayList

class SalaryActivity : AppCompatActivity() {

    lateinit var binding: ActivitySalaryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySalaryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId =
            intArrayOf(R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e)
        val name =
            arrayOf("Saurabh Kumar", "Kanhiya Singh", "Utsav Dwivedi", "Vicky Raj", "Gajendar Yadav")
        val lastMassage = arrayOf("hello", "hello", "hello", "hello", "hello")
        val lastmsgTime = arrayOf("8:00 Am", "8:00 Am", "8:00 Am", "8:00 Am", "8:00 Am")
        val phoneNo = arrayOf("9661171289", "9661171289", "9661171289", "9661171289", "9661171289")
        val country = arrayOf("India", "India", "India", "India", "India")
        val userArrayList = ArrayList<User?>()
        for (i in imageId.indices) {
            val user = User(name[i], lastMassage[i], phoneNo[i], country[i], imageId[i])
            userArrayList.add(user)
        }
//        val listAdapter = ListAdapter(this@SalaryActivity, userArrayList)
//        binding!!.salarylistview.adapter = listAdapter
        binding.salarylistview.isClickable = true
        binding.salarylistview.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->
                val intent = Intent(this@SalaryActivity, UserActivity::class.java)
                intent.putExtra("name", name[i])
                intent.putExtra("phone", phoneNo[i])
                intent.putExtra("country", country[i])
                intent.putExtra("imageid", imageId[i])
                startActivity(intent)
            }
    }
}