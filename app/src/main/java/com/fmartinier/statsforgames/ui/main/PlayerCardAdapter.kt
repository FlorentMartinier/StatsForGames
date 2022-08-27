package com.fmartinier.statsforgames.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fmartinier.statsforgames.databinding.PlayerCardViewBinding
import com.fmartinier.statsforgames.model.entities.Player

class PlayerCardAdapter(private val players: List<Player>) : RecyclerView.Adapter<CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = PlayerCardViewBinding.inflate(from, parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindPlayer(players[position])
    }

    override fun getItemCount(): Int {
        return players.size
    }


}