package com.fmartinier.statsforgames.viewControllers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fmartinier.statsforgames.databinding.SaveScoreBinding

class SaveScoreView : Fragment() {

    private lateinit var binding: SaveScoreBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = SaveScoreBinding.inflate(inflater, container, false)
        binding.sectionLabel.text = "Vue des sauvegarde de scores"
        return binding.root
    }

}