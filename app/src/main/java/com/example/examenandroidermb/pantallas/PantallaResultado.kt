package com.example.examenandroidermb.pantallas

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.examenandroidermb.R

@Composable
fun PantallaResultado(navController: NavController, context: Context, valores: ArrayList<String>) {
    var operacion = valores.get(2)
    var resultado = 0.0f
    var valor1 = valores.get(0).trim().toInt()
    var valor2 = valores.get(1).trim().toFloat()
    when(operacion) {
        "sumar" -> resultado = valor1 + valor2
        "restar" -> resultado = valor1 - valor2
        "multiplicar" -> resultado = valor1 * valor2
        "dividir" -> resultado = valor1 / valor2
    }
    Column {
        Image(painter = painterResource(id = R.drawable.beback), contentDescription = null)
        Text(text = "El resultado de la $operacion es: $resultado")
    }
}