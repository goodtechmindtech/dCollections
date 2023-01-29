package com.goodtechmind.myapplication.base

/**
 * Created by Saurabh Kumar on 17,January,2023
 */
class User(
    var name: String,
    var lastmassage: String,
    var lastMsgTime: String,
    var phoneNo: String,
    imageid: Int
) {
    lateinit var country: String
    var imageid: Int

    init {
        this.imageid = imageid
    }
}