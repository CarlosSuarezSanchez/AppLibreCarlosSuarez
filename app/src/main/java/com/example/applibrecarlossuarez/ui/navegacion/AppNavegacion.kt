package com.example.applibrecarlossuarez.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.applibrecarlossuarez.ViewModel.PizzaViewModel
import com.example.applibrecarlossuarez.ui.pantallas.PantallaIngredientes
import com.example.applibrecarlossuarez.ui.pantallas.PantallaMasa
import com.example.applibrecarlossuarez.ui.pantallas.PantallaPagar

@Composable
fun AppNavegacion(navController: NavHostController) {

    var pizzaVM = PizzaViewModel()

    NavHost(navController = navController, startDestination = AppScreens.rutaMasa.ruta) {


        composable(AppScreens.rutaMasa.ruta) { PantallaMasa(nav =navController, pizzaVM) }
        composable(AppScreens.rutaIngredientes.ruta) { PantallaIngredientes(nav =navController, pizzaVM) }
        composable(AppScreens.rutaPagar.ruta) { PantallaPagar(nav =navController, pizzaVM) }

    }
}