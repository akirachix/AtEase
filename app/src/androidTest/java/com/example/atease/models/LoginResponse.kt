package com.example.atease.models

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    var messege: String,
    @SerializedName("access_token") var accessToken: String,
    @SerializedName("user_id") var userId: String
)
