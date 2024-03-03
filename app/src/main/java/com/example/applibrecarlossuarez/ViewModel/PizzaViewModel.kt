package com.example.applibrecarlossuarez.ViewModel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class PizzaViewModel:ViewModel(){
    private val _uis = MutableStateFlow(PizzaUIState())
    val uis = _uis.asStateFlow()
}