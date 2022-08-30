package com.fmartinier.statsforgames.model.entities

import com.fmartinier.statsforgames.model.enums.EWinnerRule

var gameList = mutableListOf<Game>()

class Game(
    val name: String,
    val winnerRule: EWinnerRule,
    val id: Int? = gameList.size
) {
    override fun toString(): String {
        return name
    }
}