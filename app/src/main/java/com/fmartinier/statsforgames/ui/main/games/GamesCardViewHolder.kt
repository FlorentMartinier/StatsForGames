package com.fmartinier.statsforgames.ui.main.games

import android.content.Context
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.fmartinier.statsforgames.databinding.GameCardViewBinding
import com.fmartinier.statsforgames.model.entities.Game

class GamesCardViewHolder(
    private val gameCardViewBinding: GameCardViewBinding,
    private val context: Context
) : RecyclerView.ViewHolder(gameCardViewBinding.root) {
    fun bindGame(game: Game){
        gameCardViewBinding.textView.text = game.name

        gameCardViewBinding.editButton.setOnClickListener {
            Toast.makeText(context, "Création du jeu ${game.name}", Toast.LENGTH_SHORT).show()
        }

        gameCardViewBinding.deleteButton.setOnClickListener {
            Toast.makeText(context, "Suppression du jeu ${game.name} ", Toast.LENGTH_SHORT).show()
        }
    }
}