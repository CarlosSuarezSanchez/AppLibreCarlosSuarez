package com.example.applibrecarlossuarez.dto



var listaIngredientes = listOf(
    IngredientesDTO("Queso"),IngredientesDTO("Pepperoni"),IngredientesDTO("Bacon"),
    IngredientesDTO("Atún"), IngredientesDTO("Carne"), IngredientesDTO("Aceitunas")
)


data class IngredientesDTO (
    var nombre: String
)


