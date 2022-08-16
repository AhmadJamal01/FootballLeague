package com.bignerdranch.android.footballleague.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

val BASE_URL = "https://api-football-standings.azharimm.site/"
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface ApiService {
    @GET("leagues")
    suspend fun getLeagues(): List<ApiModel>
}

object LeagueApi{
    val retrofitService: ApiService by lazy{
        retrofit.create(ApiService::class.java)
    }
}