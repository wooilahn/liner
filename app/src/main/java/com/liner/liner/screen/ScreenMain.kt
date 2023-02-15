package com.liner.liner.screen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.liner.liner.Routes

@Composable
fun ScreenMain() {
    val navController = rememberNavController()

    NavHost(navController=navController, startDestination = Routes.Login.route) {
        composable(Routes.Login.route) {
            LoginPage(navController = navController)
        }
    }
}
