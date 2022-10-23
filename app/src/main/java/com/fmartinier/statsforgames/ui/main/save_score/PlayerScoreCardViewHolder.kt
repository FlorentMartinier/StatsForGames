package com.fmartinier.statsforgames.ui.main.save_score

import android.content.Context
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.fmartinier.statsforgames.databinding.PlayerScoreCardViewBinding
import com.fmartinier.statsforgames.model.entities.Player

class PlayerScoreCardViewHolder(
    private val playerCardViewBinding: PlayerScoreCardViewBinding,
    private val context: Context
) : RecyclerView.ViewHolder(playerCardViewBinding.root) {
    fun bindPlayer(player: Player){
        playerCardViewBinding.textView.text = getPlayerName(player)

        playerCardViewBinding.switch1.setOnClickListener {
            Toast.makeText(context, "Le joueur ${getPlayerName(player)} est gagnant ou perdant", Toast.LENGTH_SHORT).show()
        }

        playerCardViewBinding.imageView.setOnClickListener {
            Toast.makeText(context, "Suppression du joueur ${getPlayerName(player)} ", Toast.LENGTH_SHORT).show()
        }
    }

    private fun getPlayerName(player: Player) : String{
        return "${player.firstName} ${player.name}"
    }
}