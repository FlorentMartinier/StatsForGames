package com.fmartinier.statsforgames.ui.main.save_score

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fmartinier.statsforgames.databinding.PlayerCardViewBinding
import com.fmartinier.statsforgames.databinding.PlayerScoreCardViewBinding
import com.fmartinier.statsforgames.model.entities.Player

class PlayerScoreCardAdapter(private val players: List<Player>) : RecyclerView.Adapter<PlayerScoreCardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerScoreCardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = PlayerScoreCardViewBinding.inflate(from, parent, false)
        return PlayerScoreCardViewHolder(binding, parent.context)
    }

    override fun onBindViewHolder(holder: PlayerScoreCardViewHolder, position: Int) {
        holder.bindPlayer(players[position])
    }

    override fun getItemCount(): Int {
        return players.size
    }


}