package com.example.tugasinfinitelearning.pages

import android.icu.text.CaseMap.Title
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.compose.rememberNavController

sealed class BottomNavigationScreen(val title: String, val filledIcon: ImageVector, val outlinedIcon: ImageVector) {
    object HomeScreen:BottomNavigationScreen("Home", Icons.Filled.Home, Icons.Outlined.Home)
    object WishlistScreen:BottomNavigationScreen("Wishlist", Icons.Filled.Favorite, Icons.Outlined.Favorite)
    object AccountScreen:BottomNavigationScreen("Account", Icons.Filled.AccountCircle, Icons.Outlined.AccountCircle)
}

@Composable
fun BottomNavigation() {
    val navController = rememberNavController()
    val items = listOf(
        BottomNavigationScreen.HomeScreen,
        BottomNavigationScreen.WishlistScreen,
        BottomNavigationScreen.AccountScreen
    )


}