package com.portfolio.romanustiantcev.podplay.service

import android.telecom.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ItunesService {
    @GET("search?/mediaType=podcast")
    fun searchPodcastByTerm(@Query("term") term: String):
        Call
    companion object {
        val instance: ItunesService by lazy {
            val retrofit = Retrofit.Builder()
                    .baseUrl("https://itunes.apple.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            retrofit.create(ItunesService::class.java)
            }
        }
}