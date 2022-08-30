package com.fmartinier.statsforgames.ui.main.games

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fmartinier.statsforgames.databinding.GamesBinding
import com.fmartinier.statsforgames.model.entities.Game
import com.fmartinier.statsforgames.model.entities.Player
import com.fmartinier.statsforgames.model.entities.gameList
import com.fmartinier.statsforgames.model.entities.playerList
import com.fmartinier.statsforgames.model.enums.EWinnerRule
import com.fmartinier.statsforgames.ui.main.players.PlayersCardAdapter

class GamesViewController : Fragment() {

    private lateinit var binding: GamesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        populateGames()
        binding = GamesBinding.inflate(inflater, container, false)
        binding.floatingActionButton.setOnClickListener{
            Toast.makeText(context, "Création de jeu", Toast.LENGTH_LONG).show()
        }
        binding.gamesRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = GamesCardAdapter(gameList)
        }

        return binding.root
    }

    private fun populateGames() {
        gameList.add(Game("Seven wonder", EWinnerRule.MAX_POINT))
        gameList.add(Game("Smash up", EWinnerRule.MAX_POINT))
        gameList.add(Game("Magic", EWinnerRule.MORE_THAN_0_POINTS))
        gameList.add(Game("Splendor", EWinnerRule.MAX_POINT))
        gameList.add(Game("River Dragon", EWinnerRule.OTHER))
    }

}