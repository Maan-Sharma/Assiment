package com.example.ufmsportshome.data.model

data class MatchX(
    val id: String,
    val match_format: String,
    val match_offers: List<MatchOffer>,
    val metadata: MetadataX,
    val name: String,
    val starts_at: Long,
    val status: String,
    val teams: TeamsX,
    val tournament_name: String
)