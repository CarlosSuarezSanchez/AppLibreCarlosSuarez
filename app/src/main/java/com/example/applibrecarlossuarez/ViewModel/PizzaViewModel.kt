package com.example.applibrecarlossuarez.ViewModel

import androidx.lifecycle.ViewModel
import com.example.applibrecarlossuarez.dto.IngredientesDTO
import com.example.applibrecarlossuarez.dto.PedidoDTO
import com.example.applibrecarlossuarez.entidad.TipoMasa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class PizzaViewModel:ViewModel(){
    private val _uis = MutableStateFlow(PizzaUIState())
    val uis = _uis.asStateFlow()

    fun ponMasa(tipo:TipoMasa){
        _uis.update {
            it.copy(pedido= PedidoDTO(masa = tipo))
        }
    }
    fun anadirIngredientes(listaIngredientes: List<IngredientesDTO>){
        _uis.update {
            it.copy(pedido = PedidoDTO(masa = uis.value.pedido!!.masa, ingredientes = listaIngredientes.toMutableList()))
        }
    }
}