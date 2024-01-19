package com.example.examenandroidermb

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.examenandroidermb.pantallas.PantallaPrimero
import com.example.examenandroidermb.pantallas.PantallaPrincipal
import com.example.examenandroidermb.pantallas.PantallaResultado
import com.example.examenandroidermb.pantallas.PantallaSegundo

@Composable
fun NavegacionHost(context: Context) {
    val navController = rememberNavController()
    var valores = ArrayList<String>()
    NavHost(navController = navController, startDestination = Navegacion.PantallaPrincipal.ruta) {
        composable(route = Navegacion.PantallaPrincipal.ruta) {
            PantallaPrincipal(navController = navController, context = context)
        }
        composable(route = Navegacion.PantallaPrimero.ruta) {
            PantallaPrimero(navController)
        }
        composable(route = Navegacion.PantallaSegundo.ruta) {
            PantallaSegundo(navController = navController, context = context, valores = valores)
        }
        composable(route = Navegacion.PantallaResultado.ruta) {
            PantallaResultado(navController = navController, context = context, valores = valores)
        }
    }
}