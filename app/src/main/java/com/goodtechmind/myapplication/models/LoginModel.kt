package com.goodtechmind.myapplication.models

/**
 * Created by Saurabh Kumar on 17,January,2023
 */
data class LoginModel(
    val is_login: Boolean,
    val msg: String,
    val `user`: User
) {
    data class User(
        val email: String,
        val first_name: String,
        val id: Int,
        val is_collect: Boolean,
        val is_customer: Boolean,
        val mobile: String,
        val username: String
    )
}
