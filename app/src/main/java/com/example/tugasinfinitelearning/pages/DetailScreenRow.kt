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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tugasinfinitelearning.ui.theme.fontprimary
import com.example.tugasinfinitelearning.ui.theme.interBold
import com.example.tugasinfinitelearning.ui.theme.interRegular
import com.example.tugasinfinitelearning.ui.theme.interSemiBold

@Composable
fun DetailScreenRow(
    itemIndex: Int?,
    photos2: Array<Int>,
    titleanime2: Array<String>,
    description2: Array<String>,
    navController: NavController
) {
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
                painter = painterResource(id = photos2[itemIndex!!]),
                contentDescription = null
            )
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Text(
                    text = titleanime2[itemIndex],
                    fontSize = 24.sp,
                    color = fontprimary,
                    fontFamily = interBold
                )
                Text(
                    text = description2[itemIndex],
                    fontSize = 18.sp,
                    color = fontprimary,
                    fontFamily = interRegular
                )
            }
        }
    }
}