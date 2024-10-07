package com.example.ufmsportshome.data.model

data class UpcomingMatches(
    val match_list: List<MatchX>,
    val next_page: Int,
    val prev_page: Any
)