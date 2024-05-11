package com.example.tugasinfinitelearning.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugasinfinitelearning.R
import com.example.tugasinfinitelearning.ui.theme.fontprimary
import com.example.tugasinfinitelearning.ui.theme.interBold
import com.example.tugasinfinitelearning.ui.theme.interRegular
import com.example.tugasinfinitelearning.ui.theme.interSemiBold

@Composable
fun DetailScreenColumn(
    itemIndex: Int?,
    photos: Array<Int>,
    titleanime: Array<String>,
    description: Array<String>,
    navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier.fillMaxHeight()
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(295.dp),
                painter = painterResource(id = photos[itemIndex!!]),
                contentDescription = null
            )
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Text(
                    text = titleanime[itemIndex],
                    fontSize = 24.sp,
                    color = fontprimary,
                    fontFamily = interBold
                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = description[itemIndex],
                    fontSize = 18.sp,
                    color = fontprimary,
                    fontFamily = interRegular
                )
            }
        }
    }
}