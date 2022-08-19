package com.fmartinier.statsforgames.viewControllers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fmartinier.statsforgames.databinding.GamesBinding

class GamesView : Fragment() {

    private lateinit var binding: GamesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = GamesBinding.inflate(inflater, container, false)
        binding.sectionLabel.text = "Vue des jeux"
        return binding.root
    }

}