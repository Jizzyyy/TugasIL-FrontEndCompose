package com.example.tugasinfinitelearning.navigation

enum class NavigationScreen {
    SplashScreen,
    BottomScreen,
    HomeScreen,
    DetailScreenColumn,
    DetailScreenRow;


    fun fromRoute(route: String): NavigationScreen =
        when (route.substringBefore("/")) {
            SplashScreen.name -> SplashScreen
            BottomScreen.name -> BottomScreen
            HomeScreen.name -> HomeScreen
            DetailScreenColumn.name -> DetailScreenColumn
            DetailScreenRow.name -> DetailScreenRow
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
}