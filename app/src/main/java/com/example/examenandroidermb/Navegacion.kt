package com.example.examenandroidermb

sealed class Navegacion(val ruta: String) {
    object PantallaPrincipal: Navegacion("PantallaPrincipal")
    object PantallaPrimero: Navegacion("PantallaPrimero")
    object PantallaSegundo: Navegacion("PantallaSegundo")
    object PantallaResultado: Navegacion("PantallaResultado")
}