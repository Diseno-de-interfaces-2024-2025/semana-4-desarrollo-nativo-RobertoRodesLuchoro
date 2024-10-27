package com.example.ejercicio2.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable

fun MyButtonText()
{
    var cambiarTexto by remember { mutableStateOf(false) }
    var pulsarBoton by remember { mutableStateOf("Pulsar aquí")}
    var botonPulsado by remember { mutableStateOf("Botón Pulsado") }
    Button(onClick =  { cambiarTexto=!cambiarTexto },
    ){
        if(cambiarTexto)
            Text(
                text = botonPulsado
            )
        else
            Text(
                text = pulsarBoton
            )
    }
}
