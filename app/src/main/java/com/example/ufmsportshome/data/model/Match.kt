package com.example.ufmsportshome.data.model

data class Match(
    val id: String,
    val match_format: String,
    val match_offers: List<MatchOffer>,
    val metadata: Metadata,
    val name: String,
    val starts_at: Long,
    val status: String,
    val teams: Teams,
    val tournament_name: String
)