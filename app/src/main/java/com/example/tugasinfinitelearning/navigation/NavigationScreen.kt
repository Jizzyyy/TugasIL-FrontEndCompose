package com.example.tugasinfinitelearning.navigation

enum class NavigationScreen {
    SplashScreen;

    fun fromRoute(route: String): NavigationScreen =
        when (route.substringBefore("/")) {
            SplashScreen.name -> SplashScreen
            SplashScreen.name -> SplashScreen
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
}