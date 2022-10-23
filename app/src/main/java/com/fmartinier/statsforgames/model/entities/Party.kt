package com.fmartinier.statsforgames.model.entities

import java.util.*

var partyList = mutableListOf<Party>()

class Party(
    val game: Game,
    val scores: List<Score>,
    val date: Date,
    val id: Int? = partyList.size
)