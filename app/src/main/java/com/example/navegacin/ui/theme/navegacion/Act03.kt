package com.example.navegacin.ui.theme.navegacion

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.navigation.NavHostController
@Composable
fun Act03View(navController: NavHostController) {

    var entrada by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Ingresa tu año de nacimiento")

        TextField(
            value = entrada,
            onValueChange = { entrada = it },
            label = { Text("Año") }
        )

        Button(onClick = {
            val nacimiento = entrada.toIntOrNull()

            if (nacimiento != null) {
                val edad = 2026 - nacimiento

                navController.navigate(
                    EdadModel(edad)
                )
            }
        }) {
            Text(text = "Calcular")
        }
    }
}