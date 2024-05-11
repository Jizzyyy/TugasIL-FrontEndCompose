package com.example.tugasinfinitelearning.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.tugasinfinitelearning.datamodel.description
import com.example.tugasinfinitelearning.datamodel.genre
import com.example.tugasinfinitelearning.datamodel.photos
import com.example.tugasinfinitelearning.datamodel.title
import com.example.tugasinfinitelearning.pages.BottomScreen
import com.example.tugasinfinitelearning.pages.DetailScreenColumn
import com.example.tugasinfinitelearning.pages.HomeScreen
import com.example.tugasinfinitelearning.pages.SplashScreen


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavigationScreen.HomeScreen.name
    )
    {
        composable(NavigationScreen.SplashScreen.name) {
            SplashScreen(navController = rememberNavController())
        }
        composable(NavigationScreen.BottomScreen.name) {
            BottomScreen()
        }
        composable(NavigationScreen.HomeScreen.name) {
            HomeScreen(
                imageId = photos,
                titleHome = title,
                genreHome = genre,
                navController = navController
            )
        }
        composable("${NavigationScreen.DetailScreenColumn.name}/{index}", arguments = listOf(
            navArgument(name = "index") {
                type = NavType.IntType
            }
        )) {index ->
            DetailScreenColumn(
                itemIndex = index.arguments?.getInt("index"),
                photos = photos,
                titleanime = title,
                description = description,
                navController = navController
            )
        }
    }
}