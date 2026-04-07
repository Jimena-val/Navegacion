package com.example.navegacin.ui.theme.navegacion

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.navegacin.R

@Composable
fun ResultadoView(datos: EdadModel, navController: NavHostController) {

    val edad = datos.edad

    val respuesta =
        if (edad >= 1 && edad <=14) "Menor de edad"
        else if (edad == 15) "Mayor de edad en Indonesia pero no en México"
        else if (edad == 16) "Mayor de edad en Cuba pero no en México"
        else if (edad == 17) "Mayor de edad en Corea del norte pero no en México"
        else if (edad == 18) "Mayor de edad en México y gran parte de Latinoamérica"
        else if (edad == 19) "Mayor de edad en Corea del sur"
        else if (edad == 20) "Mayor de edad en Japón"
        else if (edad >= 21 && edad <= 59) "Mayor de edad en USA y posiblemente en todo el mundo"
        else if (edad >= 60 && edad <=64) "Eres de la tercera edad"
        else{"Ya te puedes jubilar"}

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Tu edad es: $edad")
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Entonces: $respuesta")
        Spacer(modifier = Modifier.height(16.dp))
        if (edad >= 1 && edad <=14){
            Image(
                painter = painterResource(R.drawable.icononino),
                contentDescription = "imagen_niño",
                modifier = Modifier
                    .size(150.dp)
            )
        }
        if (edad >=15 && edad <= 59) {
            Image(
                painter = painterResource(R.drawable.iconojoven),
                contentDescription = "imagen_adulto",
                modifier = Modifier
                    .size(150.dp)
            )
        } else if (edad >= 60 && edad <=64){
            Image(
                painter = painterResource(R.drawable.iconoanciano),
                contentDescription = "imagen_anciano",
                modifier = Modifier
                    .size(150.dp)
            )
        }
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Regresar")
        }
    }
}