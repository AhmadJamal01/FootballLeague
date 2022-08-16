package com.bignerdranch.android.footballleague

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.footballleague.network.League
import com.bignerdranch.android.footballleague.databinding.ListItemBinding


class MyListAdapter : ListAdapter<League, MyListAdapter.LeagueViewHolder>(DiffCallback){
    companion object DiffCallback: DiffUtil.ItemCallback <League>(){
        override fun areItemsTheSame(oldItem: League, newItem: League): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: League, newItem: League): Boolean {
            return oldItem.id == newItem.id
        }
    }
    class LeagueViewHolder(private var binding : ListItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(league: League){
            binding.football = league
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeagueViewHolder {
        return LeagueViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: LeagueViewHolder, position: Int) {
        val marsProperty =  getItem(position)
        holder.bind(marsProperty)
    }
}