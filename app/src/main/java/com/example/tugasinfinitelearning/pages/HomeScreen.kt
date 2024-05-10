package com.example.tugasinfinitelearning.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugasinfinitelearning.ui.theme.fontprimary
import com.example.tugasinfinitelearning.ui.theme.interBold

@Composable
fun HomeScreen(
    // Column Parameter


    // Row Parameter


    navController: NavController) {
    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(scrollState)
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 20.dp)
        ) {
            Text(
                text = "Home List",
                fontSize = 34.sp,
                color = fontprimary,
                fontFamily = interBold
            )
            Text(
                text = "Home List",
                fontSize = 34.sp,
                color = fontprimary,
                fontFamily = interBold
            )
            Text(
                text = "Home List",
                fontSize = 34.sp,
                color = fontprimary,
                fontFamily = interBold
            )


        }
    }
}

@Preview
@Composable
fun Preview2() {
    HomeScreen(navController = rememberNavController())
}

@Composable
fun ColumnListItem() {

}