package com.example.ejercicio1.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit

@Composable
fun Mytext(modifier: Modifier = Modifier, name: String, textUnit: TextUnit, color: Color)
{
    Box(modifier){
        Text(
            text = name,
            style = TextStyle(
                fontSize = textUnit,
                color = color
            )
        )
    }
}