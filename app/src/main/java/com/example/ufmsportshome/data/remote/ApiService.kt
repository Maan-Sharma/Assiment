package com.example.ufmsportshome.data.remote


import com.example.ufmsportshome.data.model.Match
import com.example.ufmsportshome.data.model.homeresponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("homepage/1")
    suspend fun getHomePageData(): Response<homeresponse>

    @GET("matches/upcoming/1")
    suspend fun getUpcomingMatches(): Response<List<Match>>

    @GET("matches/featured/1")
    suspend fun getHighlightedMatches(): Response<List<Match>>
}