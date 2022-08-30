package com.fmartinier.statsforgames

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.fmartinier.statsforgames.databinding.ActivityMainBinding
import com.fmartinier.statsforgames.model.enums.EMainActivityType
import com.fmartinier.statsforgames.ui.main.MainViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = MainViewPagerAdapter(this)
        val viewPager2: ViewPager2 = binding.viewPager
        viewPager2.adapter = sectionsPagerAdapter
        val tabLayout: TabLayout = binding.tabs
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.setIcon(getTabIcon(position))
        }.attach()
    }

    private fun getTabIcon(position: Int) = when(position) {
        EMainActivityType.STATS.index -> R.drawable.ic_stats
        EMainActivityType.SAVE_SCORE.index -> R.drawable.ic_save
        EMainActivityType.GAMES.index -> R.drawable.ic_games
        EMainActivityType.PLAYERS.index -> R.drawable.ic_players
        EMainActivityType.HISTORY.index -> R.drawable.ic_history
        else -> 0
    }
}