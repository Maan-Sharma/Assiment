package com.example.ufmsportshome.data.model

data class MatchXXX(
    val id: String,
    val match_format: String,
    val match_offers: List<MatchOffer>,
    val metadata: MetadataXX,
    val name: String,
    val starts_at: Long,
    val status: String,
    val teams: TeamsXX,
    val tournament_name: String
)