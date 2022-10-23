package com.fmartinier.statsforgames.ui.main.stats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fmartinier.statsforgames.databinding.StatsBinding
import com.fmartinier.statsforgames.model.bdd.PocBddPopulator
import com.fmartinier.statsforgames.model.entities.playerList
import com.fmartinier.statsforgames.model.entities.scoreList
import com.github.mikephil.charting.charts.HorizontalBarChart
import com.github.mikephil.charting.components.XAxis.XAxisPosition
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter


class StatsViewController : Fragment() {

    private lateinit var binding: StatsBinding

    // Liste des noms de joueurs pour la stat des nombres de victoires
    val playersListNbVictory = mutableListOf<String>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        PocBddPopulator.populateAll()
        binding = StatsBinding.inflate(inflater, container, false)
        val barChart = binding.barChart
        barChart.data = buildNbVictoryData()
        setUpNbVictoryChart(barChart)
        return binding.root
    }

    private fun setUpNbVictoryChart(chart: HorizontalBarChart) {
        chart.description.isEnabled = false
        chart.setDrawValueAboveBar(true)
        chart.animateY(1000)

        val xl = chart.xAxis
        xl.granularity = 1f
        xl.position = XAxisPosition.BOTTOM
        xl.setDrawGridLines(false)
        xl.valueFormatter = IndexAxisValueFormatter(playersListNbVictory);

        val yl = chart.axisLeft
        yl.setDrawGridLines(false)
        yl.granularity = 1f
        yl.axisMinimum = 0f

        val yr = chart.axisRight
        yr.setDrawLabels(false)
        yr.setDrawGridLines(false)
    }

    private fun buildNbVictoryData(): BarData {
        val values: ArrayList<BarEntry> = ArrayList()

        // Pour chaque joueur, récupérer son nombre de victoire et le placer dans la liste
        var nbScore = 0
        playerList.forEach { player ->
            val nbVictories = scoreList
                .filter { score -> score.player == player && score.winner }
                .size.toFloat()
            if (nbVictories > 0) {
                values.add(BarEntry(nbScore.toFloat(), nbVictories))
                nbScore++
                playersListNbVictory.add(player.toString())
            }
        }

        // create a dataset and give it a type
        val barDataSet = BarDataSet(values, "Nombre de victoires totale")

        // create a data object with the data sets
        return BarData(barDataSet)
    }
}