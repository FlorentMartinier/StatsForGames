package com.fmartinier.statsforgames.viewControllers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.fmartinier.statsforgames.databinding.PlayersBinding
import com.fmartinier.statsforgames.model.entities.Player
import com.fmartinier.statsforgames.model.entities.playerList
import com.fmartinier.statsforgames.ui.main.PlayerCardAdapter

class PlayersView : Fragment() {

    private lateinit var binding: PlayersBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        populatePlayers()
        binding = PlayersBinding.inflate(inflater, container, false)
        binding.floatingActionButton.setOnClickListener{
            Toast.makeText(context, "Création de joueur", Toast.LENGTH_LONG).show()
        }
        binding.playerRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = PlayerCardAdapter(playerList)
        }
        return binding.root
    }

    private fun populatePlayers() {
        for (i in 0..20) {
            playerList.add(Player("Test$i", "Test$i"))
        }
    }

}