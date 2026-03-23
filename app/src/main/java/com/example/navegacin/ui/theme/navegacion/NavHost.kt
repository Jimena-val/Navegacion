package com.example.navegacin.ui.theme.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*

@Composable
fun Navegacion() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "act03") {

        composable("act03") {
            Act03(navController)
        }

        composable("resultado/{edad}") { backStackEntry ->
            val edad = backStackEntry.arguments?.getString("edad") ?: "0"
            Resultado(edad)
        }
    }
}