package com.example.ejercicio2.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun MyButtonColor(backgroundColor : Color)
{
    var backgroundColor1 by remember { mutableStateOf(Color.Black) }
    var myColorText1 by remember { mutableStateOf(Color.White)}
    var pulsarBoton by remember { mutableStateOf("Pulsar aquí")}
    var myShape1 by remember { mutableStateOf(RoundedCornerShape(20.dp)) }
    var myBorder1 by remember { mutableStateOf(BorderStroke(1.dp, Color.Black)) }
    var cambiarTexto by remember { mutableStateOf(false) }
    Button(

        onClick =  { cambiarTexto=!cambiarTexto
            myColorText1 = Color.Black;
            pulsarBoton = "He cambiado el texto!";
            myShape1 = RoundedCornerShape(4.dp);
            myBorder1 = BorderStroke(1.dp, Color.Black);
                   },
        border = myBorder1, // Borde negro de 1dp
        shape = myShape1, // Esquinas redondeadas de 20dp

        colors = ButtonDefaults.buttonColors(
            containerColor = if(cambiarTexto) backgroundColor else backgroundColor1
        )
    ){
        Text(
            text = pulsarBoton,
            style = TextStyle(
                color = myColorText1,
            )
        )
    }
}