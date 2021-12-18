package org.algosketch.androidtemplate.global.di

import org.algosketch.androidtemplate.data.model.Memo
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Url

interface MemoService {
    @GET(".")
    suspend fun getMemo(): Memo

    @POST(".")
    fun writeMemo(
        @Body requestBody: Memo
    ): Response<Unit>
}