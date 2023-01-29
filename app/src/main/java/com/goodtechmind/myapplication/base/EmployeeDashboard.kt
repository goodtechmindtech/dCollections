package com.goodtechmind.myapplication.base

import android.content.Intent
import android.graphics.Camera
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.goodtechmind.myapplication.R

class EmployeeDashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_dashboard)
    }

    fun todayscollectionlist(view: View) {
        val intent = Intent(this@EmployeeDashboard, TodayList_I::class.java)
        startActivity(intent)
    }
    fun previousdueslist(view: View) {
        val intent = Intent(this@EmployeeDashboard, PreviousListItem::class.java)
        startActivity(intent)
    }
    fun collectionhistory(view: View) {
        val intent = Intent(this@EmployeeDashboard, CollectionHistoryItem::class.java)
        startActivity(intent)
    }
    fun leave(view: View) {
        val intent = Intent(this@EmployeeDashboard, LeaveForm::class.java)
        startActivity(intent)
    }
    fun attendence(view: View) {
        val intent = Intent(this@EmployeeDashboard, CameraIntent::class.java)
        startActivity(intent)
    }
    fun transactionhistory(view: View) {
        val intent = Intent(this@EmployeeDashboard, PaymentHistory::class.java)
        startActivity(intent)
    }
}