package com.fmartinier.statsforgames.ui.main

import androidx.recyclerview.widget.RecyclerView
import com.fmartinier.statsforgames.databinding.PlayerCardViewBinding
import com.fmartinier.statsforgames.model.entities.Player

class CardViewHolder(
    private val playerCardViewBinding: PlayerCardViewBinding
) : RecyclerView.ViewHolder(playerCardViewBinding.root) {
    fun bindPlayer(player: Player){
        playerCardViewBinding.textView.text = "${player.firstName} ${player.name}"
    }
}