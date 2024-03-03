package com.example.applibrecarlossuarez.ui.pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.applibrecarlossuarez.R
import com.example.applibrecarlossuarez.ViewModel.PizzaViewModel
import com.example.applibrecarlossuarez.entidad.TipoMasa
import com.example.applibrecarlossuarez.ui.navegacion.AppScreens

@Composable
fun PantallaMasa(nav: NavHostController, pizzaVM: PizzaViewModel){
    Column (
        modifier = Modifier.fillMaxWidth()
            .padding(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){

        Image(modifier = Modifier.size(300.dp),
            painter = painterResource(id =R.drawable.masa ), contentDescription ="masa" )

        Text(text = "Elija su masa")

        Button(onClick = {
            pizzaVM.ponMasa(TipoMasa.FINA)
            nav.navigate(AppScreens.rutaIngredientes.ruta)
        }) {
            Text(text = "FINA")
        }


        Button(onClick = {
            pizzaVM.ponMasa(TipoMasa.NORMAL)
            nav.navigate(AppScreens.rutaIngredientes.ruta)
        }) {
            Text(text = "NORMAL")
        }


        Button(onClick = {
            pizzaVM.ponMasa(TipoMasa.GRUESA)
            nav.navigate(AppScreens.rutaIngredientes.ruta)
        }) {
            Text(text = "GRUESA")
        }
    }
}