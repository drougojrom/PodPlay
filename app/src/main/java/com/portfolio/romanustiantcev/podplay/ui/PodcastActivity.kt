package com.portfolio.romanustiantcev.podplay.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.portfolio.romanustiantcev.podplay.R
import com.portfolio.romanustiantcev.podplay.repository.ItunesRepo
import com.portfolio.romanustiantcev.podplay.service.ItunesService

class PodcastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_podcast)

        val TAG = javaClass.simpleName
        val itunesService = ItunesService.instance
        val itunesRepo = ItunesRepo(itunesService)
        itunesRepo.searchByTerm("Android Developer", {
            Log.i(TAG, "Results = $it")
        })
    }
}
