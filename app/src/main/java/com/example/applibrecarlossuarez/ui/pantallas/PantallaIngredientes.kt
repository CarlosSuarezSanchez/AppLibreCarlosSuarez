package com.example.applibrecarlossuarez.ui.pantallas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.applibrecarlossuarez.ViewModel.PizzaViewModel
import com.example.applibrecarlossuarez.dto.IngredientesDTO
import com.example.applibrecarlossuarez.dto.PedidoDTO
import com.example.applibrecarlossuarez.dto.listaIngredientes
import com.example.applibrecarlossuarez.entidad.TipoMasa
import com.example.applibrecarlossuarez.ui.navegacion.AppScreens
import org.w3c.dom.Text

@Composable
fun PantallaIngredientes(nav: NavHostController, pizzaVM: PizzaViewModel) {

    var pedido = pizzaVM.uis.collectAsState()
    var listaSeleccionados by remember { mutableStateOf(emptyList<IngredientesDTO>()) }

    Column(

    ) {
        Text(text = "Ingredientes, masa: ${pedido.value.pedido?.masa ?: TipoMasa.GRUESA}")
        Text(text = "ELIJA LOS INGREDIENTES QUE DESEA PARA SU PIZZA:")

        LazyColumn(modifier = Modifier.fillMaxWidth(0.9f)){
            items(listaIngredientes){ingrediente->
                FilaIngrediente(ingrediente,listaSeleccionados.contains(ingrediente)) {estaseleccionado->
                    if (estaseleccionado){
                        listaSeleccionados = listaSeleccionados + ingrediente
                    }else{
                        listaSeleccionados = listaSeleccionados - ingrediente
                    }
                }
            }
        }
        Button(onClick = {
            pizzaVM.anadirIngredientes(listaSeleccionados)
            nav.navigate(AppScreens.rutaPagar.ruta)
        }) {
            Text(text = "Aceptar y pagar")
        }
    }

}

@Composable
fun FilaIngrediente(ing: IngredientesDTO, sel:Boolean, onSeleccionado:(Boolean)->Unit ) {
        Row {
            Checkbox(checked = sel, onCheckedChange = onSeleccionado )
            Text(text = ing.nombre)
        }
}
