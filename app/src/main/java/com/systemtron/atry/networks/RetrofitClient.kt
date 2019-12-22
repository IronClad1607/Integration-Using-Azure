package com.systemtron.atry.networks

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitClient {

    private fun retrofit() = Retrofit.Builder()
        .baseUrl("https://ussouthcentral.services.azureml.net/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val answerAPI = retrofit().create(InputAPI::class.java)
}