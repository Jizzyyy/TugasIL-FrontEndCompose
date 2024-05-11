package com.example.tugasinfinitelearning.pages

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
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
import com.example.tugasinfinitelearning.datamodel.genre
import com.example.tugasinfinitelearning.navigation.NavigationScreen
import com.example.tugasinfinitelearning.ui.theme.fontprimary
import com.example.tugasinfinitelearning.ui.theme.interBold
import com.example.tugasinfinitelearning.ui.theme.interRegular
import com.example.tugasinfinitelearning.ui.theme.interSemiBold

@Composable
fun HomeScreen(
    // Column Parameter
    imageId: Array<Int>, titleHome: Array<String>, genreHome: Array<String>,

    // Row Parameter
//    titleHome2: Array<String>, genreHome2: Array<String>,

    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 20.dp)
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Anime List",
                fontSize = 26.sp,
                color = fontprimary,
                fontFamily = interBold
            )
            LazyColumn(contentPadding = PaddingValues(2.dp)) {
                val itemCount = imageId.size
                items(itemCount) {
                    ColumnListItem(
                        itemIndex = it,
                        title = titleHome,
                        genre = genreHome,
                        navController
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Lazy Row", fontSize = 26.sp, color = fontprimary, fontFamily = interSemiBold
            )
            Spacer(modifier = Modifier.height(10.dp))
//            LazyRow(contentPadding = PaddingValues(2.dp)) {
//                val itemCount = imageId.size
//                items(itemCount) {
//                    RowListItem(
//                        itemIndex2 = it,
//                        title2 = titleHome2,
//                        genre2 = genreHome2
//                    )
//                }
//            }
        }
    }
}


@Composable
fun ColumnListItem(
    itemIndex: Int, title: Array<String>, genre: Array<String>, navController: NavController
) {
    Column(
        modifier = Modifier.clickable { navController.navigate("${NavigationScreen.DetailScreenColumn.name}/$itemIndex") }
    ) {

        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = title[itemIndex], fontSize = 16.sp, color = fontprimary, fontFamily = interBold
        )
        Text(
            text = genre[itemIndex],
            fontSize = 14.sp,
            color = fontprimary,
            fontFamily = interRegular
        )
    }
}

@Composable
fun RowListItem(
    itemIndex2: Int, title2: Array<String>, genre2: Array<String>
) {
    Column {
        Text(
            text = "Home List", fontSize = 20.sp, color = fontprimary, fontFamily = interBold
        )
        Text(
            text = "Home List", fontSize = 18.sp, color = fontprimary, fontFamily = interRegular
        )
    }
}