package com.fmartinier.statsforgames.model.entities

var scoreList = mutableListOf<Score>()

class Score(
    // val party: Party, TODO : A voir si c'est possible de valoriser les instances comme avec hibernate
    val player: Player,
    val score: Int,
    val winner: Boolean,
    val id: Int? = scoreList.size
)