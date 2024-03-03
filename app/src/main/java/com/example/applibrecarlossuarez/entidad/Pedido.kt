package com.example.applibrecarlossuarez.entidad

enum class TipoMasa(var nombre:String){
    FINA("Fina"),NORMAL("Normal"),GRUESA("Gruesa")
}
data class Pedido (
    var masa:TipoMasa = TipoMasa.NORMAL


)