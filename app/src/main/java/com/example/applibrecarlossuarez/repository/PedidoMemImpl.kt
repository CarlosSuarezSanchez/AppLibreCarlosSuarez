package com.example.applibrecarlossuarez.repository

import com.example.applibrecarlossuarez.entidad.Pedido

class PedidoMemImpl: PedidoRepo {
    var lista: MutableList<Pedido> = mutableListOf(Pedido())
    override fun obtenerPedido(): Pedido {
        TODO("Not yet implemented")
    }

    override fun crearPedido(pedido: Pedido) {
        TODO("Not yet implemented")
    }

}