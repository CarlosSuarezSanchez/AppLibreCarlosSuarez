package com.example.applibrecarlossuarez.ui.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.applibrecarlossuarez.ViewModel.PizzaViewModel
import com.example.applibrecarlossuarez.dto.IngredientesDTO
import com.example.applibrecarlossuarez.entidad.TipoMasa

const val precioIngrediente = 0.9

@Composable
fun PantallaPagar(nav: NavHostController, pizzaVM: PizzaViewModel) {

    var sacarAviso by remember { mutableStateOf(false) }
    var pedido = pizzaVM.uis.collectAsState()

    var precioMasa = when (pedido.value.pedido?.masa) {
        TipoMasa.FINA -> 4.3
        TipoMasa.NORMAL -> 4.8
        TipoMasa.GRUESA -> 5.3
        else -> {
            0.0
        }
    }
    var numeroIngredientes = pedido.value.pedido?.ingredientes?.size ?: 0
    val precioTotalIngredientes = precioIngrediente * numeroIngredientes

    if (sacarAviso) {
        AlertDialog(onDismissRequest = { sacarAviso = false },
            text = { Text(text = "Ha pedido la pizza por un precio de ${precioTotalIngredientes + precioMasa}€") },
            title = { Text(text = "Pedido confirmado") },
            confirmButton = {
                Button(onClick = {
                    sacarAviso = false
                }
                ) {
                    Text(text = "Aceptar")
                }
            }
        )
    }

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(70.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Text(
            modifier = Modifier
                .padding(vertical = 12.dp),
            fontSize = 22.sp,
            text = "Detalles de su pedido:")

        Text(text = "Masa: ${pedido.value.pedido?.masa ?: TipoMasa.GRUESA}; Precio: $precioMasa€")
        //Text(text = "${pedido.value.pedido?.ingredientes?.toList().toString()}")
        Text(modifier = Modifier
            .padding(vertical = 12.dp),
            text = "Los ingredientes : ")
        Column(modifier = Modifier
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            pedido.value.pedido?.ingredientes?.forEach {
                Text(modifier = Modifier.padding(bottom =  12.dp),
                    text = "- ${it.nombre}",
                    textAlign = TextAlign.Start
                    )
            }
            Text(modifier = Modifier
                .padding(bottom = 12.dp),
                text = "Precio: $precioIngrediente * $numeroIngredientes = $precioTotalIngredientes€")
            HorizontalDivider(thickness = 4.dp)
            Text(modifier = Modifier
                .padding(vertical = 12.dp),
                text = "El total de su pedido es: ${precioTotalIngredientes + precioMasa}€ ")

        }
        Button(onClick = {
            sacarAviso = true
        }) {
            Text(text = "Aceptar y pagar")
        }
    }
}