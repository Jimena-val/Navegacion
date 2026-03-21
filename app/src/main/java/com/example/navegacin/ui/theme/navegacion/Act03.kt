package com.example.navegacin.ui.theme.navegacion

import android.widget.Space
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
import kotlinx.serialization.descriptors.PrimitiveKind

@Composable
@Preview(showBackground = true)
fun Act03(){
    var entrada by remember {mutableStateOf("")}
    Column(modifier= Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = entrada,
            onValueChange = {entrada = it},
            placeholder = {Text(text = "Año de nacimiento")
        })
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = {
            val nacimiento = entrada.toInt()
            val edad = 2026 - nacimiento

        }){
            Texto(texto = "Calcular edad")
        }
    }
    }