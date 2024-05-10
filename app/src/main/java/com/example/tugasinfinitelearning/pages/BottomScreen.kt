package com.example.tugasinfinitelearning.pages

import android.annotation.SuppressLint
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.tugasinfinitelearning.ui.theme.primary
import com.example.tugasinfinitelearning.ui.theme.primary2

sealed class BottomNavigationScreen(val title: String, val filledIcon: ImageVector, val outlinedIcon: ImageVector) {
    data object HomeScreen:BottomNavigationScreen("Home", Icons.Filled.Home, Icons.Outlined.Home)
    data object WishlistScreen:BottomNavigationScreen("Wishlist", Icons.Filled.Favorite, Icons.Outlined.Favorite)
    data object AccountScreen:BottomNavigationScreen("Account", Icons.Filled.AccountCircle, Icons.Outlined.AccountCircle)
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BottomScreen() {
    val navController = rememberNavController()
    val items = listOf(
        BottomNavigationScreen.HomeScreen,
        BottomNavigationScreen.WishlistScreen,
        BottomNavigationScreen.AccountScreen
    )
    Scaffold(
        bottomBar = {
            BottomNavigation(
                backgroundColor = Color.White,
                elevation = 15.dp
            ) {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route
                items.forEach { screen ->
                    BottomNavigationItem(
                        selected = currentRoute == screen.title,
                        onClick = {
                            navController.navigate(screen.title) {
                                popUpTo(navController.graph.startDestinationId) {
                                    saveState = true
                                }
                                launchSingleTop = true
                            }
                        },
                        icon = {
                            val selectedIcon =
                                if (currentRoute == screen.title) screen.filledIcon else screen.outlinedIcon
                            Icon(
                                selectedIcon, contentDescription = screen.title,
                                tint = if (currentRoute == screen.title) primary else primary2
                            )
                        },
                        label = {
                            Text(
                                text = screen.title,
                                color = if (currentRoute == screen.title)
                                    primary else primary2
                            )
                        },
                        alwaysShowLabel = false
                    )
                }
            }
        },
        content = {

        }
    )
}