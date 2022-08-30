package com.fmartinier.statsforgames.model.entities

import java.util.*

var scoreList = mutableListOf<Score>()

class Score(
    val game: Game,
    val winner: Player,
    val players: List<Player>,
    val date: Date,
    val id: Int? = gameList.size
)