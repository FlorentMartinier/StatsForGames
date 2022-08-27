package com.fmartinier.statsforgames.model.entities

var playerList = mutableListOf<Player>()

class Player(
    val firstName: String,
    val name: String,
    val id: Int? = playerList.size
)