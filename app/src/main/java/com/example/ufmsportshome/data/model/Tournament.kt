package com.example.ufmsportshome.data.model

data class Tournament(
    val match_list: List<Match>,
    val next_page: Int,
    val prev_page: Any,
    val tournament_id: String,
    val tournament_name: String
)