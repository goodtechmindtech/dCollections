package com.goodtechmind.myapplication.retrofit

import com.goodtechmind.myapplication.base.authentication.customer_details.CustomerDetailsModel
import com.goodtechmind.myapplication.models.LoginModel
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * Created by Saurabh Kumar on 17,January,2023
 */
interface ApiInterface {

    @FormUrlEncoded
    @POST("login/loan/collector")
    suspend fun loginUser(
        @Field("username") username: String,
        @Field("password") password: String) : Response<LoginModel>


    @GET("customer/details")
    suspend fun getCustomerDetails(): Response<CustomerDetailsModel>

}