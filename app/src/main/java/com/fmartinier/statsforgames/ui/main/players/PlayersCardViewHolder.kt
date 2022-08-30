package com.fmartinier.statsforgames.ui.main.players

import android.content.Context
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.fmartinier.statsforgames.databinding.PlayerCardViewBinding
import com.fmartinier.statsforgames.model.entities.Player

class PlayersCardViewHolder(
    private val playerCardViewBinding: PlayerCardViewBinding,
    private val context: Context
) : RecyclerView.ViewHolder(playerCardViewBinding.root) {
    fun bindPlayer(player: Player){
        playerCardViewBinding.textView.text = getPlayerName(player)

        playerCardViewBinding.editButton.setOnClickListener {
            Toast.makeText(context, "Création du joueur ${getPlayerName(player)}", Toast.LENGTH_SHORT).show()
        }

        playerCardViewBinding.deleteButton.setOnClickListener {
            Toast.makeText(context, "Suppression du joueur ${getPlayerName(player)} ", Toast.LENGTH_SHORT).show()
        }
    }

    private fun getPlayerName(player: Player) : String{
        return "${player.firstName} ${player.name}"
    }
}