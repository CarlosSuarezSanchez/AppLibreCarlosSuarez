package com.example.applibrecarlossuarez.ui.pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.applibrecarlossuarez.R
import com.example.applibrecarlossuarez.ViewModel.PizzaViewModel
import com.example.applibrecarlossuarez.entidad.TipoMasa
import com.example.applibrecarlossuarez.ui.navegacion.AppScreens

@Composable
fun PantallaMasa(nav: NavHostController, pizzaVM: PizzaViewModel){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){

        Image(modifier = Modifier.size(300.dp),
            painter = painterResource(id =R.drawable.masa ), contentDescription ="masa" )

        Text(fontSize = 22.sp,
            text = "ELIJA EL TIPO DE MASA")
        Spacer(modifier = Modifier.size(40.dp))
        Button(modifier = Modifier.fillMaxWidth(0.7F).height(50.dp),
            onClick = {
            pizzaVM.ponMasa(TipoMasa.FINA)
            nav.navigate(AppScreens.rutaIngredientes.ruta)
        }) {
            Text(text = "FINA")
        }
        Spacer(modifier = Modifier.size(20.dp))


        Button(modifier = Modifier.fillMaxWidth(0.7F).height(50.dp),
            onClick = {
            pizzaVM.ponMasa(TipoMasa.NORMAL)
            nav.navigate(AppScreens.rutaIngredientes.ruta)
        }) {
            Text(text = "NORMAL")
        }
        Spacer(modifier = Modifier.size(20.dp))


        Button(modifier = Modifier.fillMaxWidth(0.7F).height(50.dp),
            onClick = {
            pizzaVM.ponMasa(TipoMasa.GRUESA)
            nav.navigate(AppScreens.rutaIngredientes.ruta)
        }) {
            Text(text = "GRUESA")
        }
    }
}