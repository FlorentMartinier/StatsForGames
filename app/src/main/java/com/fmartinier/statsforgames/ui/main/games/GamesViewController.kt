package com.fmartinier.statsforgames.ui.main.games

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fmartinier.statsforgames.databinding.GamesBinding
import com.fmartinier.statsforgames.model.bdd.PocBddPopulator
import com.fmartinier.statsforgames.model.entities.gameList

class GamesViewController : Fragment() {

    private lateinit var binding: GamesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        PocBddPopulator.populateGames()
        binding = GamesBinding.inflate(inflater, container, false)

        // Création d'un jeu
        binding.floatingActionButton.setOnClickListener{
            Toast.makeText(context, "Création de jeu", Toast.LENGTH_LONG).show()
        }

        // Initialisation de la liste des jeux
        binding.gamesRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = GamesCardAdapter(gameList)
        }

        return binding.root
    }
}