package com.example.applibrecarlossuarez.dto

import com.example.applibrecarlossuarez.entidad.TipoMasa

/**
 * TODO Poner lista vacia de ingredientes DTO
 */
data class PedidoDTO (
    var masa: TipoMasa = TipoMasa.NORMAL,
    var ingredientes: MutableList<IngredientesDTO> = mutableListOf(IngredientesDTO("Ejemplo"))
    )