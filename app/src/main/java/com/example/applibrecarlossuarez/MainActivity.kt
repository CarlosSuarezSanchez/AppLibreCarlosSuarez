package com.example.applibrecarlossuarez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.applibrecarlossuarez.ui.navegacion.AppNavegacion
import com.example.applibrecarlossuarez.ui.pantallas.PizzaApp
import com.example.applibrecarlossuarez.ui.theme.AppLibreCarlosSuarezTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppLibreCarlosSuarezTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //AppNavegacion()
                    PizzaApp()
                }
            }
        }
    }
}
