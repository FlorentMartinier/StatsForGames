package com.fmartinier.statsforgames.viewControllers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fmartinier.statsforgames.databinding.HistoryBinding

class HistoryView : Fragment() {

    private lateinit var binding: HistoryBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = HistoryBinding.inflate(inflater, container, false)
        binding.sectionLabel.text = "Vue des historiques"
        return binding.root
    }

}