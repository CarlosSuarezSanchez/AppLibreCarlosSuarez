package com.example.applibrecarlossuarez.repository

import com.example.applibrecarlossuarez.entidad.Pedido

interface PedidoRepo {
    fun obtenerPedido():Pedido
    fun crearPedido(pedido: Pedido)
}