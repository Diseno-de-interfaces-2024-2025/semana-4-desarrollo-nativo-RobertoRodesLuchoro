package com.example.ejercicio4.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen() {
    var textName by remember { mutableStateOf("") }
    var textEmail by remember { mutableStateOf("") }
    var textAddress by remember { mutableStateOf("") }
    var textCountry by remember { mutableStateOf("") }
    var textName2 by remember { mutableStateOf("")}
    var textEmail2 by remember { mutableStateOf("")}
    var textAddress2 by remember { mutableStateOf("")}
    var textCountry2 by remember { mutableStateOf("")}
    var name = "Nombre"
    var email ="Email"
    var address ="Dirección"
    var country = "País"

    Column(Modifier.fillMaxSize())
    {
        Box(
            Modifier
                .fillMaxWidth()
                //.weight(0.6f)
                .background(Color(0xFF122562))
                .padding(20.dp),
            contentAlignment = Alignment.Center
        )
        {
            Text("Screen", fontSize = 34.sp, color = Color.White)
        }
        Box(
            Modifier
                //.weight(0.4f)
                .background(Color.LightGray)
        )
        {
            Row(
                modifier = Modifier
                    .horizontalScroll(rememberScrollState()) // Habilita el scroll horizontal
                    .fillMaxWidth() // Ocupa el ancho completo de la pantalla
            ) {
                // Añadimos varios elementos para desplazarse horizontalmente
                repeat(10)
                {
                    Box(
                        modifier = Modifier
                            .size(75.dp) // Tamaño cuadrado del contenedor del círculo
                            .padding(8.dp)
                            .clip(CircleShape) // Hace que el Box tenga forma de círculo
                            .background(Color(0xFF3e3b32)), // Color de fondo
                    )
                }
            }
        }
        Box(
            Modifier
                .weight(0.75f)
                .background(Color.White)
                .padding(10.dp)
        )
        {
            Row()
            {
                //Hacerlo con boxeos padding y lcibutton
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Blue)
                        .fillMaxHeight()
                )
                Spacer(Modifier.width(10.dp))
                Box(
                    Modifier
                        .weight(1f)
                        .background(Color.White)
                        .verticalScroll(rememberScrollState())
                )
                {
                    Text(
                        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla quis mauris luctus nibh consectetur pretium et sit amet tellus. Nullam tincidunt libero id ultrices hendrerit. Vestibulum id suscipit est. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Fusce in urna tincidunt, pellentesque odio sit amet, venenatis lorem. Nunc semper id nisl a eleifend. Praesent mollis felis quis diam vulputate varius. Nunc laoreet feugiat erat in accumsan. Vestibulum sit amet lacus at ex bibendum congue et ut diam. Ut sagittis augue ut turpis facilisis condimentum. Nunc et sollicitudin justo. Nulla sollicitudin sodales urna, nec faucibus velit vestibulum sit amet. Vivamus feugiat cursus nisi, id sagittis nulla pharetra eu.\n" +
                                "\n" +
                                "Sed sollicitudin nulla ac quam viverra aliquam. Phasellus nulla eros, ornare in mi et, facilisis semper leo. In imperdiet lacus diam, eget lacinia mauris gravida quis. Vivamus scelerisque arcu lobortis sodales mollis. Fusce et ante sed nulla semper efficitur. Nullam malesuada arcu quis ante sollicitudin finibus. Integer nulla libero, euismod a porta at, tempor maximus ligula.\n" +
                                "\n" +
                                "Integer cursus faucibus nisl vel pharetra. Vestibulum posuere velit sapien, id lacinia erat tincidunt a. Nulla ut augue non tortor dapibus pharetra non nec libero. Nulla facilisi. Proin accumsan ullamcorper ipsum eget ultricies. Integer viverra dapibus tristique. Cras urna velit, elementum vel neque ut, lobortis congue ante.\n" +
                                "\n" +
                                "Ut egestas eleifend tortor, et condimentum metus facilisis at. Pellentesque pellentesque diam lacus, id interdum justo malesuada a. Praesent lobortis justo ac quam aliquam, eget venenatis sapien dignissim. Nulla luctus porta ex et aliquet. Donec placerat neque leo, sed ornare urna elementum a. Suspendisse potenti. Morbi tempor tincidunt mauris. Nam varius mi a quam dapibus cursus eu ut magna. Praesent commodo, tellus et tempor eleifend, dui dui vulputate nibh, at congue eros dui eget leo.\n" +
                                "\n" +
                                "In a urna in sem aliquet lacinia eget vitae velit. Ut vel risus vel leo finibus vestibulum quis ac libero. Proin eros magna, egestas eget malesuada non, vulputate et quam. Sed viverra ultricies nisl, ac sodales ligula egestas ut. Sed ornare blandit tortor malesuada malesuada. Sed sit amet nibh nisi. Vestibulum et magna maximus, vulputate ligula sed, volutpat turpis. Nullam commodo ex magna, eget posuere felis hendrerit in. Sed luctus erat quis cursus rutrum. Aenean nec lorem non mauris iaculis tincidunt. Phasellus finibus augue sit amet euismod finibus. Pellentesque dictum viverra vestibulum. Morbi sit amet congue metus. Fusce blandit dui at nisi volutpat, lobortis consequat lacus maximus."
                    )
                }
            }
        }
        Column(
            Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Color.LightGray)
        )
        {
            Box(
                Modifier
                    .fillMaxWidth()
                    //.weight(0.6f)
                    .background(Color.White)
                    .padding(20.dp),
                contentAlignment = Alignment.Center
            )
            {
                Text("Formulario", fontSize = 34.sp, color = Color.Black)
            }
            Spacer(Modifier.width(10.dp))
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Column(
                    Modifier
                        .background(Color.White)
                        .weight(1f)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    // Nombre
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(IntrinsicSize.Min) // Asegura que los hijos compartan la misma altura mínima
                    ) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight() // Ajusta la altura para llenar la del padre (Row)
                                .padding(end = 8.dp)
                        ) {
                            TextField(
                                value = textName,
                                label = { Text(name) },
                                onValueChange = { textName = it },
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(), // Ajusta la altura para llenar la del padre (Row)
                            contentAlignment = Alignment.Center
                        ) {
                            Text(textName2)
                        }
                    }

                    // Email
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(IntrinsicSize.Min) // Asegura que los hijos compartan la misma altura mínima
                    ) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight()
                                .padding(end = 8.dp)
                        ) {
                            TextField(
                                value = textEmail,
                                label = { Text(email) },
                                onValueChange = { textEmail = it },
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(textEmail2)
                        }
                    }

                    // Dirección
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(IntrinsicSize.Min) // Asegura que los hijos compartan la misma altura mínima
                    ) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight()
                                .padding(end = 8.dp)
                        ) {
                            TextField(
                                value = textAddress,
                                label = { Text(address) },
                                onValueChange = { textAddress = it },
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(textAddress2)
                        }
                    }

                    // País
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(IntrinsicSize.Min) // Asegura que los hijos compartan la misma altura mínima
                    ) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight()
                                .padding(end = 8.dp)
                        ) {
                            TextField(
                                value = textCountry,
                                label = { Text(country) },
                                onValueChange = { textCountry = it },
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(textCountry2)
                        }
                    }

                    // Botón de Acceso
                    Row(Modifier.fillMaxWidth()) {
                        Box(
                            Modifier
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Button(onClick =
                            {
                                textName2 = textName
                                textEmail2 = textEmail
                                textAddress2 = textAddress
                                textCountry2 = textCountry
                            }) {
                                Text("Acceder")
                            }
                        }
                    }
                }
            }
        }
    }
}
