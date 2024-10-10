package com.example.ufmsportshome.Ui.main


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.example.ufmsportshome.data.model.Match
import com.example.ufmsportshome.data.model.homeresponse
import com.example.ufmsportshome.data.remote.ApiClient
import com.example.ufmsportshome.data.remote.HomeRepository
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class HomeViewModel : ViewModel() {

    private val _homeData = MutableLiveData<homeresponse>()
    val homeData: LiveData<homeresponse>
        get() = _homeData

    private val _upcomingMatches = MutableLiveData<List<Match>>()
    val upcomingMatches: LiveData<List<Match>>
        get() = _upcomingMatches

    private val _highlightedMatches = MutableLiveData<List<Match>>()
    val highlightedMatches: LiveData<List<Match>>
        get() = _highlightedMatches

    init {
        fetchHomePageData()
        fetchUpcomingMatches()
        fetchHighlightedMatches()
    }

    private fun fetchHomePageData() {
        viewModelScope.launch {
            val response = ApiClient.apiService.getHomePageData()
            if (response.isSuccessful) {
                _homeData.postValue(response.body())
            }
        }
    }

    private fun fetchUpcomingMatches() {
        viewModelScope.launch {
            val response = ApiClient.apiService.getUpcomingMatches()
            if (response.isSuccessful) {
                _upcomingMatches.postValue(response.body())
            }
        }
    }

    private fun fetchHighlightedMatches() {
        viewModelScope.launch {
            val response = ApiClient.apiService.getHighlightedMatches()
            if (response.isSuccessful) {
                _highlightedMatches.postValue(response.body())
            }
        }
    }
}
