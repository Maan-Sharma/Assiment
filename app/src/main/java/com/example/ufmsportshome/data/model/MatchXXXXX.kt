package com.example.ufmsportshome.data.model

data class MatchXXXXX(
    val id: String,
    val match_format: String,
    val match_offers: List<MatchOfferXX>,
    val metadata: MetadataXX,
    val name: String,
    val starts_at: Long,
    val status: String,
    val teams: TeamsXXXX,
    val tournament_name: String
)