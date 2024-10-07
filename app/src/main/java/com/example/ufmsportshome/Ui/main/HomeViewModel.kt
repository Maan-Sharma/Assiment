package com.example.ufmsportshome.Ui.main


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ufmsportshome.data.remote.HomeRepository
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HomeViewModel(private val repository: HomeRepository) : ViewModel() {

   init {
       viewModelScope.launch(Dispatchers.IO) {
           repository.getHomePageData()

       }
   }
}
