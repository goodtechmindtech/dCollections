package com.goodtechmind.myapplication.base.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.goodtechmind.myapplication.R
import com.goodtechmind.myapplication.base.User
import com.goodtechmind.myapplication.models.LoginModel
import java.util.ArrayList

/**
 * Created by Saurabh Kumar on 17,January,2023
 */

class SalaryAdapter : ArrayAdapter<User?> {
    constructor(context: Context?, userArrayList: ArrayList<User?>?) : super(
        context!!, R.layout.salary_list, userArrayList!!
    ) {
    }

    constructor(context: Context, resource: Int) : super(context, resource) {}

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val user = getItem(position)
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }
        val imageView = convertView!!.findViewById<ImageView>(R.id.profile_pic)
        val userName = convertView.findViewById<TextView>(R.id.personname)
        val accountno = convertView.findViewById<TextView>(R.id.accountno)
        imageView.setImageResource(user!!.imageid)
        userName.text = user.name
        accountno.text = user.lastmassage
        return convertView
    }
}