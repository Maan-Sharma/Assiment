package com.example.ufmsportshome.data.model

data class homeresponse(
    val current_offers: CurrentOffers,
    val featured_tournament: FeaturedTournament?,
    val upcoming_matches: UpcomingMatches,
    val user_matches: UserMatches,
    val wallet_summary: WalletSummary
)