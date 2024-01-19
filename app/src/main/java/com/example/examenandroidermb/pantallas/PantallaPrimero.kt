package com.example.examenandroidermb.pantallas

import android.content.res.Configuration
import android.widget.RadioGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.examenandroidermb.R

@Composable
fun PantallaPrimero(navController: NavController) {
    var seleccionado1 by remember { mutableStateOf(false) }
    var seleccionado2 by remember { mutableStateOf(false) }
    var seleccionado3 by remember { mutableStateOf(false) }
    var seleccionado4 by remember { mutableStateOf(false) }
    var seleccionado5 by remember { mutableStateOf(false) }
    var seleccionado6 by remember { mutableStateOf(false) }
    var checkeado by remember { mutableStateOf(true) }
    var colorFondo by remember { mutableIntStateOf(R.color.white) }
    var colorTexto by remember { mutableIntStateOf(R.color.black) }
    var configuracion = LocalConfiguration.current
        if (configuracion.orientation != Configuration.ORIENTATION_LANDSCAPE) {
            Column(modifier = Modifier.fillMaxSize()) {
                if (checkeado) {
                    Box(
                        modifier = Modifier
                            .background(colorResource(id = colorFondo))
                            .fillMaxWidth()
                    ) {
                        Text(text = "Camaleon, guau guau", color = colorResource(id = colorTexto), style = TextStyle(fontSize = 40.sp))
                    }
                }
                Box(modifier = Modifier
                    .background(Color.Blue)
                    .fillMaxWidth()
                ) {
                    Column {
                        Row {
                            RadioButton(selected = seleccionado1, onClick = { seleccionado1 = !seleccionado1; seleccionado2 = false; seleccionado3 = false; colorFondo = R.color.black})
                            Text(text = "Fondo Negro")
                        }
                        Row {
                            RadioButton(selected = seleccionado2, onClick = { seleccionado2 = !seleccionado2; seleccionado1 = false; seleccionado3 = false; colorFondo = R.color.verde })
                            Text(text = "Fondo Verde")
                        }
                        Row {
                            RadioButton(selected = seleccionado3, onClick = { seleccionado3 = !seleccionado3; seleccionado1 = false; seleccionado2 = false; colorFondo = R.color.rojo})
                            Text(text = "Fondo Rojo")
                        }
                    }
                }
                Box(modifier = Modifier
                    .background(Color.Green)
                    .fillMaxWidth()
                ) {
                    Column {
                        Row {
                            RadioButton(selected = seleccionado4, onClick = { seleccionado4 = !seleccionado4; seleccionado5 = false; seleccionado6 = false; colorTexto = R.color.azul })
                            Text(text = "Texto Azul")
                        }
                        Row {
                            RadioButton(selected = seleccionado5, onClick = { seleccionado5 = !seleccionado5; seleccionado4 = false; seleccionado6 = false; colorTexto = R.color.amarillo })
                            Text(text = "Texto Amarillo")
                        }
                        Row {
                            RadioButton(selected = seleccionado6, onClick = { seleccionado6 = !seleccionado6; seleccionado4 = false; seleccionado5 = false; colorTexto = R.color.gris})
                            Text(text = "Texto gris")
                        }
                    }
                }
                Box(modifier = Modifier
                    .background(Color.Cyan)
                    .fillMaxSize()
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxSize()) {
                        Checkbox(checked = checkeado, onCheckedChange = { checkeado = !checkeado })
                        Text(text = "Mostrar Texto")
                    }
                }
            }
        }else{
            Box(
                modifier = Modifier
                    .background(colorResource(id = colorFondo))
                    .fillMaxWidth()
            ) {
                Text(text = "Camaleon, guau guau", color = colorResource(id = colorTexto), style = TextStyle(fontSize = 40.sp))
            }

        }

}


