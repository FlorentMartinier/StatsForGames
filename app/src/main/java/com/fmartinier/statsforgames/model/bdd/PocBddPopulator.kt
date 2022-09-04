package com.fmartinier.statsforgames.model.bdd

import com.fmartinier.statsforgames.model.entities.Game
import com.fmartinier.statsforgames.model.entities.Player
import com.fmartinier.statsforgames.model.entities.gameList
import com.fmartinier.statsforgames.model.entities.playerList
import com.fmartinier.statsforgames.model.enums.EWinnerRule

class PocBddPopulator {

    companion object {
        fun populateGames() {
            gameList.clear()
            gameList.add(Game("Seven wonder", EWinnerRule.MAX_POINT))
            gameList.add(Game("Smash up", EWinnerRule.MAX_POINT))
            gameList.add(Game("Magic", EWinnerRule.MORE_THAN_0_POINTS))
            gameList.add(Game("Splendor", EWinnerRule.MAX_POINT))
            gameList.add(Game("River Dragon", EWinnerRule.OTHER))
        }

        fun populatePlayers() {
            playerList.clear()
            playerList.add(Player("Laura", "Callet"))
            playerList.add(Player("Florent", "Martinier"))
            playerList.add(Player("Arnaud", "Martinier"))
            playerList.add(Player("Mam", ""))
            playerList.add(Player("Nico", ""))
        }
    }
}