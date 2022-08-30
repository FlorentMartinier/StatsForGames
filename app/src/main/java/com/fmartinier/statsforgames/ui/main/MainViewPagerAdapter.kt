package com.fmartinier.statsforgames.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.fmartinier.statsforgames.model.enums.EMainActivityType
import com.fmartinier.statsforgames.ui.main.games.GamesViewController
import com.fmartinier.statsforgames.ui.main.history.HistoryViewController
import com.fmartinier.statsforgames.ui.main.players.PlayersViewController
import com.fmartinier.statsforgames.ui.main.save_score.SaveScoreViewController
import com.fmartinier.statsforgames.ui.main.stats.StatsViewController

class MainViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    /**
     * Création des vues adaptées en fonction des onglets du viewpager.
     */
    override fun createFragment(position: Int): Fragment {
        return when(position) {
            EMainActivityType.STATS.index -> StatsViewController()
            EMainActivityType.SAVE_SCORE.index -> SaveScoreViewController()
            EMainActivityType.GAMES.index -> GamesViewController()
            EMainActivityType.PLAYERS.index -> PlayersViewController()
            EMainActivityType.HISTORY.index -> HistoryViewController()
            else -> StatsViewController()
        }
    }

    override fun getItemCount(): Int {
        return EMainActivityType.values().size
    }

}