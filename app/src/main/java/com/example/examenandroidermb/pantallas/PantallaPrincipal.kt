package com.example.examenandroidermb.pantallas

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.examenandroidermb.Navegacion
import com.example.examenandroidermb.R

@Composable
fun PantallaPrincipal(navController: NavController, context: Context) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Examen de PGL, profe yo no me he copiado")
        Image(painter = painterResource(id = R.drawable.sudando), contentDescription = null)
        Button(onClick = { navController.navigate(Navegacion.PantallaPrimero.ruta) }) {
            Text(text = "Primer Ejercicio")
        }
        Button(onClick = { navController.navigate(Navegacion.PantallaSegundo.ruta) }) {
            Text(text = "Segundo Ejercicio")
        }
    }
}