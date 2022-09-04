package com.fmartinier.statsforgames.model.entities

import java.util.*

var scoreList = mutableListOf<Score>()

class Score(
    val game: Game,
    val player: Player,
    val score: Int,
    val winner: Boolean,
    val date: Date,
    val id: Int? = scoreList.size
)