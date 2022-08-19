package com.fmartinier.statsforgames.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.fmartinier.statsforgames.model.enums.EMainActivityType

class PageViewModel() : ViewModel() {

    private val _index = MutableLiveData<Int>()
    private lateinit var _activityType: EMainActivityType

    val text: LiveData<String> = Transformations.map(_index) {
        "Hello world from section: $it"
    }

    fun setIndex(index: Int) {
        _index.value = index
    }

    fun setPageType(activityType: EMainActivityType) {
        _activityType = activityType
    }
}