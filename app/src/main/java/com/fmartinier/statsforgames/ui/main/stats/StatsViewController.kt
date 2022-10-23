package com.fmartinier.statsforgames.ui.main.stats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fmartinier.statsforgames.databinding.StatsBinding
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry


class StatsViewController : Fragment() {

    private lateinit var binding: StatsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = StatsBinding.inflate(inflater, container, false)
        val barChart = binding.barChart
        barChart.data = getData(36, 100)
        return binding.root
    }

    private fun getData(count: Int, range: Int): BarData {
        val values: ArrayList<BarEntry> = ArrayList()
        for (i in 0 until count) {
            val value = (Math.random() * range).toFloat() + 3
            values.add(BarEntry(i.toFloat(), value))
        }

        // create a dataset and give it a type
        val set1 = BarDataSet(values, "DataSet 1")

        // create a data object with the data sets
        return BarData(set1)
    }
}