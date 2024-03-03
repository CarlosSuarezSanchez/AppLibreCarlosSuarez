package com.example.applibrecarlossuarez.ui.navegacion

sealed class AppScreens(val ruta: String){

    object PizzaApp:AppScreens("PizzaApp")

    object rutaMasa:AppScreens("PantallaMasa")

    object rutaIngredientes:AppScreens("PantallaIngredientes")

    object rutaPagar: AppScreens("PantallaPagar")
}