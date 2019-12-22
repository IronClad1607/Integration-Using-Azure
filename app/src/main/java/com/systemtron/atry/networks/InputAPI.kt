package com.systemtron.atry.networks

import com.systemtron.atry.modals.recieve.Output
import com.systemtron.atry.modals.send.Input
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface InputAPI {

    @Headers("Content-Type:application/json","Authorization:Bearer CsDJA4AWW2eDRur9q7gVQEv9DvTrVFFoPSmjh/BkrcV7MsiwJfsEuqVD3SZLd73DlFbaTzWdlY2aFtTW7b1EAA==")
    @POST("/workspaces/bab8cc2e60bc4d67afb046a2214b8079/services/6dc96cb3b21d4a0289e8dca1ee19075a/execute?api-version=2.0&format=swagger")
    suspend fun getAnswer(@Body input: Input): Response<Output>
}