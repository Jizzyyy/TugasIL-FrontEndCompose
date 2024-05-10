package com.example.tugasinfinitelearning.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugasinfinitelearning.R
import com.example.tugasinfinitelearning.ui.theme.interBold
import com.example.tugasinfinitelearning.ui.theme.interSemiBold
import com.example.tugasinfinitelearning.ui.theme.primary
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController, onSplashScreenFinished: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.earth), contentDescription = null)
    }
    LaunchedEffect(key1 = true) {
        delay(3000)
        onSplashScreenFinished()
    }
}

@Preview
@Composable
fun Preview() {
    SplashScreen(navController = rememberNavController()) {
    }
}