package com.fmartinier.statsforgames.ui.main.save_score

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fmartinier.statsforgames.databinding.SaveScoreBinding
import com.fmartinier.statsforgames.model.bdd.PocBddPopulator
import com.fmartinier.statsforgames.model.entities.Game
import com.fmartinier.statsforgames.model.entities.Player
import com.fmartinier.statsforgames.model.entities.gameList
import com.fmartinier.statsforgames.model.entities.playerList


class SaveScoreViewController : Fragment() {

    private lateinit var binding: SaveScoreBinding
    private lateinit var selectedGame: Game

    private var selectedPlayers: MutableList<Player> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        PocBddPopulator.populateAll()
        selectedPlayers.add(playerList[0])
        binding = SaveScoreBinding.inflate(inflater, container, false)

        initializeGameSpinner()

        // Initialisation de la liste des joueurs
        binding.playerRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = PlayerScoreCardAdapter(selectedPlayers)
        }

        // Initialisation du bouton d'action (ajout de joueur + sauvegarde d'un score)
        binding.addPlayerButton.setOnClickListener {
            Toast.makeText(context, "ajout d'un joueur", Toast.LENGTH_LONG).show()
            selectedPlayers.add(playerList[1])
            binding.playerRecyclerView.adapter?.notifyItemChanged(playerList.size)
        }
        binding.validateScoreButton.setOnClickListener {
            Toast.makeText(context, "Validation du score", Toast.LENGTH_LONG).show()
        }
        return binding.root
    }

    /**
     * Initialisation du game spinner : liste déroulante avec tous les jeux possibles
     */
    private fun initializeGameSpinner() {
        val gamesSpinner = binding.gamesSpinner
        val adapter = ArrayAdapter(
            requireContext(),
            R.layout.simple_spinner_item,
            gameList
        )
        adapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
        gamesSpinner.adapter = adapter

        gamesSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                selectedGame = adapter.getItem(position) as Game
                Toast.makeText(context, "Jeu sélectionné : ${selectedGame.name}", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

        }
    }
}