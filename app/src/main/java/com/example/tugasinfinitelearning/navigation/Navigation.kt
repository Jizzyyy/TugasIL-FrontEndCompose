package com.example.tugasinfinitelearning.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tugasinfinitelearning.pages.SplashScreen


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavigationScreen.SplashScreen.name
    )
    {
        composable(NavigationScreen.SplashScreen.name) {
            SplashScreen(navController = rememberNavController()) {

            }
        }
    }
}