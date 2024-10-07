package com.example.ufmsportshome.data.model

data class MatchXXXX(
    val id: String,
    val match_format: String,
    val match_offers: List<MatchOfferX>,
    val metadata: MetadataX,
    val name: String,
    val starts_at: Long,
    val status: String,
    val teams: TeamsXXX,
    val tournament_name: String
)