package com.fmartinier.statsforgames.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.fmartinier.statsforgames.model.enums.EMainActivityType
import com.fmartinier.statsforgames.viewControllers.*

class SectionsPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            EMainActivityType.STATS.index -> StatsView()
            EMainActivityType.SAVE_SCORE.index -> SaveScoreView()
            EMainActivityType.GAMES.index -> GamesView()
            EMainActivityType.PLAYERS.index -> PlayersView()
            EMainActivityType.HISTORY.index -> HistoryView()
            else -> StatsView()
        }
    }

    override fun getItemCount(): Int {
        return EMainActivityType.values().size
    }

}