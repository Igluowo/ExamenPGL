package com.example.examenandroidermb.pantallas

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import androidx.navigation.NavController
import com.example.examenandroidermb.Navegacion
import com.example.examenandroidermb.R

@Composable
fun PantallaSegundo(navController: NavController, context: Context, valores: ArrayList<String>) {
    var valor1 by remember { mutableStateOf("") }
    var valor2 by remember { mutableStateOf("") }
    var operacion by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            TextField(value = valor1, onValueChange = {valor1 = it}, modifier = Modifier
                .weight(1f)
                .padding(5.dp, 0.dp),
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number))
            TextField(value = valor2, onValueChange = {valor2 = it}, modifier = Modifier.weight(1f),
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number))
        }
        Image(painter = painterResource(id = R.drawable.calculator), contentDescription = null)
        Row {
            Button(onClick = { operacion = "sumar";  if(!(valor1.isEmpty() || valor2.isEmpty())) {
                valores.add(valor1); valores.add(valor2); valores.add(operacion);
                navController.navigate(Navegacion.PantallaResultado.ruta)
            }else{ Toast.makeText(context, "Calculator will need some numbers or I will punch you in the face", Toast.LENGTH_SHORT).show()}
            }
            ) {
                Text(text = "+")
            }
            Button(onClick = { operacion = "restar"; if(!(valor1.isEmpty() || valor2.isEmpty())) {
                valores.add(valor1); valores.add(valor2); valores.add(operacion);
                navController.navigate(Navegacion.PantallaResultado.ruta)
            }else{ Toast.makeText(context, "Calculator will need some numbers or I will punch you in the faces", Toast.LENGTH_SHORT).show()}}
            ) {
                Text(text = "-")
            }
            Button(onClick = { operacion = "multiplicar"; if(!(valor1.isEmpty() || valor2.isEmpty())) {
                valores.add(valor1); valores.add(valor2); valores.add(operacion);
                navController.navigate(Navegacion.PantallaResultado.ruta)
            }else{ Toast.makeText(context, "Calculator will need some numbers or I will punch you in the face", Toast.LENGTH_SHORT).show()} }
            ) {
                Text(text = "*")
            }
            FloatingActionButton(onClick = { operacion = "dividir"; if(!(valor1.isEmpty() || valor2.isEmpty())) {
                valores.add(valor1); valores.add(valor2); valores.add(operacion);
                navController.navigate(Navegacion.PantallaResultado.ruta)
            }else{ Toast.makeText(context, "Calculator will need some numbers or I will punch you in the face", Toast.LENGTH_SHORT).show()} }) {
                Text(text = "/")
            }
        }
    }
}