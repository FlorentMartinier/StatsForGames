package com.fmartinier.statsforgames.ui.main.players

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fmartinier.statsforgames.databinding.PlayerCardViewBinding
import com.fmartinier.statsforgames.model.entities.Player

class PlayersCardAdapter(private val players: List<Player>) : RecyclerView.Adapter<PlayersCardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayersCardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = PlayerCardViewBinding.inflate(from, parent, false)
        return PlayersCardViewHolder(binding, parent.context)
    }

    override fun onBindViewHolder(holder: PlayersCardViewHolder, position: Int) {
        holder.bindPlayer(players[position])
    }

    override fun getItemCount(): Int {
        return players.size
    }


}