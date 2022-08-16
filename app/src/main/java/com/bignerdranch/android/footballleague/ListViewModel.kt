package com.bignerdranch.android.footballleague

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bignerdranch.android.footballleague.Repository.LeagueRepository
import com.bignerdranch.android.footballleague.network.ApiModel
import com.bignerdranch.android.footballleague.network.League
import kotlinx.coroutines.launch

class ListViewModel: ViewModel() {
    private val _football = MutableLiveData<List<ApiModel>>()
    val football : LiveData<List<ApiModel>>
        get() = _football
    val repo = LeagueRepository()
    init {
        getLeague()
    }
    fun getLeague(){
        viewModelScope.launch {
            _football.value = repo.getLeague()
        }
}
}