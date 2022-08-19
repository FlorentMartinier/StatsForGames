package com.fmartinier.statsforgames.viewControllers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        binding.sectionLabel.text = "Vue des joueurs"
        return binding.root
    }

}