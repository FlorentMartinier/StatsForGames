package com.fmartinier.statsforgames

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.fmartinier.statsforgames.databinding.ActivityMainBinding
import com.fmartinier.statsforgames.ui.main.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this)
        val viewPager2: ViewPager2 = binding.viewPager
        viewPager2.adapter = sectionsPagerAdapter
        val tabLayout: TabLayout = binding.tabs
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.setIcon(getTabIcon(position))
        }.attach()
    }

    fun getTabIcon(position: Int) = when(position) {
        0 -> R.drawable.ic_stats
        1 -> R.drawable.ic_save
        2 -> R.drawable.ic_games
        3 -> R.drawable.ic_players
        4 -> R.drawable.ic_history
        else -> 0
    }
}