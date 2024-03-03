package com.example.applibrecarlossuarez.ui.pantallas

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.applibrecarlossuarez.ViewModel.PizzaViewModel

@Composable
fun PantallaPagar(nav: NavHostController, pizzaVM: PizzaViewModel) {
    Text(text = "Pagar")
}