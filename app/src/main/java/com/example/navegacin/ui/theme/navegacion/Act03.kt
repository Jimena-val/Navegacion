package com.example.navegacin.ui.theme.navegacion

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
@Composable
//@Preview(showBackground = true)
fun Act03(navController: NavController) {
    var entrada by remember { mutableStateOf("") }
    var edad by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Ingresar el año de nacimiento a calcular...")
        Spacer(modifier = Modifier.padding(12.dp))

        TextField(
            value = entrada,
            onValueChange = { entrada = it },
            placeholder = { Text(text = "Año de nacimiento") }
        )

        Spacer(modifier = Modifier.padding(16.dp))

        Button(onClick = {
            val nacimiento = entrada.toIntOrNull()

            if (nacimiento != null) {
                edad = 2026 - nacimiento

                // NAVEGAR Y MANDAR EDAD
                navController.navigate("resultado/$edad")
            }
        }) {
            Text(text = "Calcular edad")
        }
    }
}