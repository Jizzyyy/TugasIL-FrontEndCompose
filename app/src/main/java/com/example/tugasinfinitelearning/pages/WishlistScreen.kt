package com.example.tugasinfinitelearning.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tugasinfinitelearning.datamodel.photos
import com.example.tugasinfinitelearning.navigation.NavigationScreen
import com.example.tugasinfinitelearning.ui.theme.fontprimary
import com.example.tugasinfinitelearning.ui.theme.interMedium
import com.example.tugasinfinitelearning.ui.theme.interSemiBold

@Composable
fun WishlistScreen(
    imageId2: Array<Int>,
    titleAnimeWishlist: Array<String>,
    navController: NavController
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.padding(16.dp)) {
            val itemCount = imageId2.size
            items(itemCount) {
                GridItem(itemIndex3 = it, photosAnime = imageId2, titleAnime = titleAnimeWishlist, navController)
            }
        }
    }
}

@Composable
fun GridItem(itemIndex3: Int, photosAnime: Array<Int>, titleAnime: Array<String>, navController: NavController) {
    Spacer(modifier = Modifier.width(10.dp))
    Column(
        modifier = Modifier.padding(8.dp).clickable { navController.navigate("${NavigationScreen.DetailScreenRow.name}/$itemIndex3") },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = photosAnime[itemIndex3]), contentDescription = null)
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = titleAnime[itemIndex3],
            fontSize = 14.sp,
            color = fontprimary,
            fontFamily = interMedium
        )
    }
}


