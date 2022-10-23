package com.fmartinier.statsforgames.model.bdd

import com.fmartinier.statsforgames.model.entities.*
import com.fmartinier.statsforgames.model.enums.EWinnerRule
import java.util.*

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

        fun populateScore() {
            scoreList.clear()

            // Score seven wonder
            scoreList.add(Score(playerList[0], 70, true))
            scoreList.add(Score(playerList[1], 50, false))
            scoreList.add(Score(playerList[2], 62, false))

            // Score smash up
            scoreList.add(Score(playerList[0], 11, false))
            scoreList.add(Score(playerList[1], 14, false))
            scoreList.add(Score(playerList[3], 15, true))

            // Score Magic
            scoreList.add(Score(playerList[0], 11, true))
            scoreList.add(Score(playerList[4], 0, false))

            // Score Magic 2
            scoreList.add(Score(playerList[2], 0, false))
            scoreList.add(Score(playerList[4], 20, true))

            // Score Magic 3
            scoreList.add(Score(playerList[2], 11, true))
            scoreList.add(Score(playerList[4], 0, false))
        }

        fun populateParty() {
            partyList.clear()

            // Partie de seven wonder
            partyList.add(Party(
                gameList[0],
                listOf(scoreList[0], scoreList[1], scoreList[2]),
                Date()
            ))

            // Partie de smash up
            partyList.add(Party(
                gameList[1],
                listOf(scoreList[3], scoreList[4], scoreList[5]),
                Date()
            ))

            // Partie de magic
            partyList.add(Party(
                gameList[2],
                listOf(scoreList[6], scoreList[7]),
                Date()
            ))

            // Partie de magic 2
            partyList.add(Party(
                gameList[2],
                listOf(scoreList[8], scoreList[9]),
                Date()
            ))

            // Partie de magic 3
            partyList.add(Party(
                gameList[2],
                listOf(scoreList[10], scoreList[11]),
                Date()
            ))
        }

        fun populateAll() {
            populateGames()
            populatePlayers()
            populateScore()
            populateParty()
        }
    }
}