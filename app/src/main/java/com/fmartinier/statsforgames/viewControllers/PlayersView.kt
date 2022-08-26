package com.fmartinier.statsforgames.viewControllers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.fmartinier.statsforgames.databinding.PlayersBinding

class PlayersView : Fragment() {

    private lateinit var binding: PlayersBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = PlayersBinding.inflate(inflater, container, false)
        binding.floatingActionButton.setOnClickListener{
            Toast.makeText(context, "Création de joueur", Toast.LENGTH_LONG).show()
        }
        var cardView = context?.let { CardView(it) }
        cardView?.radius = 8F
        binding.constraintLayout.addView(cardView)
        return binding.root
    }

}