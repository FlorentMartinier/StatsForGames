package com.fmartinier.statsforgames.ui.main.players

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fmartinier.statsforgames.databinding.PlayersBinding
import com.fmartinier.statsforgames.model.bdd.PocBddPopulator
import com.fmartinier.statsforgames.model.entities.playerList

class PlayersViewController : Fragment() {

    private lateinit var binding: PlayersBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        PocBddPopulator.populateAll()
        binding = PlayersBinding.inflate(inflater, container, false)
        binding.floatingActionButton.setOnClickListener{
            Toast.makeText(context, "Création de joueur", Toast.LENGTH_LONG).show()
        }
        binding.playerRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = PlayersCardAdapter(playerList)
        }
        return binding.root
    }
}