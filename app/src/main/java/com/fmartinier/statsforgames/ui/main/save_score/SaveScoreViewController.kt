package com.fmartinier.statsforgames.ui.main.save_score

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.view.forEach
import androidx.core.view.iterator
import androidx.fragment.app.Fragment
import com.fmartinier.statsforgames.databinding.SaveScoreBinding
import com.fmartinier.statsforgames.model.entities.Game
import com.fmartinier.statsforgames.model.entities.gameList
import com.fmartinier.statsforgames.model.enums.EWinnerRule


class SaveScoreViewController : Fragment() {

    private lateinit var binding: SaveScoreBinding
    private lateinit var selectedGame: Game

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = SaveScoreBinding.inflate(inflater, container, false)
        val gamesSpinner = binding.gamesSpinner

        println("requireContext() = ${requireContext()}")
        val adapter = ArrayAdapter(
            requireContext(),
            R.layout.simple_spinner_item,
            gameList
        )

        adapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)

        // TODO : Je ne comprends pas pourquoi sans le add il ne prends pas en compte la liste d'items.
        adapter.add(Game("test", EWinnerRule.OTHER))
        gamesSpinner.adapter = adapter
        gamesSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                selectedGame = adapter.getItem(position) as Game
                Toast.makeText(context, "Jeu sélectionné : ${selectedGame.name}", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        adapter.notifyDataSetChanged()

        return binding.root
    }

}