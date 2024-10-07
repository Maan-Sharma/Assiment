package com.example.ufmsportshome.data.remote

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.ufmsportshome.data.model.Match
import com.example.ufmsportshome.data.model.homeresponse


class HomeRepository(private val apiService: ApiService) {

    private val homelivedata=MutableLiveData<homeresponse?>()
    val homedata: LiveData<homeresponse?>
    get() = homelivedata

    private val upcomingMatchesLiveData = MutableLiveData<List<Match>?>()
    val upcomingMatchesData: LiveData<List<Match>?> get() = upcomingMatchesLiveData

    private val highlightedMatchesLiveData = MutableLiveData<List<Match>?>()
    val highlightedMatchesData: LiveData<List<Match>?> get() = highlightedMatchesLiveData

    // Fetch home page data and post to LiveData
    suspend fun getHomePageData() {
        val response = apiService.getHomePageData()
        if (response.isSuccessful) {
            homelivedata.postValue(response.body())
        } else {
            homelivedata.postValue(null) // Handle unsuccessful response
        }
    }

    // Fetch upcoming matches and post to LiveData
    suspend fun getUpcomingMatches() {
        val response = apiService.getUpcomingMatches()
        if (response.isSuccessful) {
            upcomingMatchesLiveData.postValue(response.body())
        } else {
            upcomingMatchesLiveData.postValue(null) // Handle unsuccessful response
        }
    }

    // Fetch highlighted matches and post to LiveData
    suspend fun getHighlightedMatches() {
        val response = apiService.getHighlightedMatches()
        if (response.isSuccessful) {
            highlightedMatchesLiveData.postValue(response.body())
        } else {
            highlightedMatchesLiveData.postValue(null) // Handle unsuccessful response
        }
    }
}
