package com.epi.firstproject

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenTiga(navController: NavHostController) {
    Scaffold  (
        topBar = {
            TopAppBar(
                title = {Text("Card")},
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    titleContentColor = Color.Black
                )
            )
        }
    ) { paddingValues ->

        val sayurList = getAllBuahSayur()
        val segarList = getAllBuahSegar()
        val combinedList = (sayurList + segarList).shuffled()

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentPadding = PaddingValues(8.dp),
        ) {
            items(combinedList) { item ->
                when (item) {
                    is BuahSayur -> BuahSayurItemGrid(item, navController)
                    is BuahSegar -> BuahSegarItemGrid(item, navController)
                }
            }
        }
    }
}

@Composable
fun BuahSayurItemGrid(item: BuahSayur, navController: NavController) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable {
                navController.navigate("detail/${item.sayurName}")
            },

        horizontalAlignment = Alignment.CenterHorizontally
    ) {

            Image(
                painter = painterResource(id = item.imageRes),
                contentDescription = item.name,
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = item.sayurName,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = item.name,
                fontSize = 14.sp
            )

    }
}

@Composable
fun BuahSegarItemGrid(item: BuahSegar, navController: NavController) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable {
                navController.navigate("detail/${item.buahName}")
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = item.imageRes),
            contentDescription = item.buahName,
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = item.buahName,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
