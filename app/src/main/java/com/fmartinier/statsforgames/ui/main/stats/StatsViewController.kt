package com.fmartinier.statsforgames.ui.main.stats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fmartinier.statsforgames.databinding.StatsBinding

class StatsViewController : Fragment() {

    private lateinit var binding: StatsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = StatsBinding.inflate(inflater, container, false)
        binding.sectionLabel.text = "Vue des stats"
        return binding.root
    }

}