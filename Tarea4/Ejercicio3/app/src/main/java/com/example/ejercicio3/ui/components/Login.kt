package com.example.ejercicio3.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun login(modifier : Modifier = Modifier)
{
    var colorText by remember { mutableStateOf(Color.Unspecified) }
    var resultText by remember { mutableStateOf("") }
    var user by remember { mutableStateOf("admin") }
    var pass by remember { mutableStateOf("1234") }
    var textUser by remember { mutableStateOf("Usuario") }
    var textPassoword by remember { mutableStateOf("Password") }
    var textInputUser by remember { mutableStateOf("") }
    var textInputPassword by remember { mutableStateOf("") }
        Box(
            Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Column (horizontalAlignment = Alignment.CenterHorizontally) {
                TextField(
                    value = textInputUser,
                    onValueChange = {textInputUser = it},
                    label = { Text(textUser)}
                )
                Spacer(Modifier.height(50.dp))
                TextField(
                    value = textInputPassword,
                    onValueChange = {textInputPassword = it},
                    label = { Text(textPassoword)},
                    maxLines = 1,
                )
                Spacer(Modifier.height(10.dp))
                Text(
                    text= resultText,
                    color= colorText
                )
                Spacer(Modifier.height(10.dp))
                Button(onClick = {
                    if(textInputUser == user && textInputPassword == pass)
                    {
                        colorText = Color.Green
                        resultText = "Usuario Correcto"
                    }
                    else
                    {
                        colorText = Color.Red
                        resultText = "Usuario Incorrecto"
                    }
                }
                ){
                    Text("Acceder")
                }
            }
        }
}


