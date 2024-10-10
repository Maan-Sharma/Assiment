package com.example.ufmsportshome.Ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import com.example.ufmsportshome.R
import com.example.ufmsportshome.data.remote.ApiService
import com.example.ufmsportshome.data.remote.HomeRepository
import com.example.ufmsportshome.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        observeViewModel()
    }

    @SuppressLint("SetTextI18n")
    private fun observeViewModel() {
        viewModel.homeData.observe(this, Observer { response ->
            response?.let {
                val offerListSize = it.current_offers.offer_list?.size ?: 0
                binding.textep.text = offerListSize.toString()
            }
        })
    }
}