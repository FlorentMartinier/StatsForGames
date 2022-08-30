package com.fmartinier.statsforgames.ui.main.games

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fmartinier.statsforgames.databinding.GameCardViewBinding
import com.fmartinier.statsforgames.model.entities.Game

class GamesCardAdapter(private val games: List<Game>) : RecyclerView.Adapter<GamesCardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GamesCardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = GameCardViewBinding.inflate(from, parent, false)
        return GamesCardViewHolder(binding, parent.context)
    }

    override fun onBindViewHolder(holder: GamesCardViewHolder, position: Int) {
        holder.bindGame(games[position])
    }

    override fun getItemCount(): Int {
        return games.size
    }


}