package com.fmartinier.statsforgames.model.entities

import java.util.*

var historyList = mutableListOf<History>()

class History(
    val game: Game,
    val players: List<Player>,
    val winners: List<Player>,
    val scores: List<Score>,
    val date: Date,
    val id: Int? = historyList.size
)