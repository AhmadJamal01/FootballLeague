package com.bignerdranch.android.footballleague.Repository

import com.bignerdranch.android.footballleague.network.LeagueApi

class LeagueRepository {
    suspend fun getLeague() =  LeagueApi.retrofitService.getLeagues()
}