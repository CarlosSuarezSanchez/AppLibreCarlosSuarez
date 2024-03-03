package com.example.applibrecarlossuarez.entidad

enum class tipoMasa(var nombre:String){
    FINA("Fina"),NORMAL("Normal"),GRUESA("Gruesa")
}
data class Pedido (
    var masa:tipoMasa = tipoMasa.NORMAL


)