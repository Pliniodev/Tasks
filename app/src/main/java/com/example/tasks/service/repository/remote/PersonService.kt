package com.example.tasks.service.repository.remote

import com.example.tasks.service.repository.HeaderModel
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface PersonService {

    /**
     * Define o método associado ao endpoint
     */

    @POST("Authentication/Login")
    @FormUrlEncoded
    fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<HeaderModel>
}