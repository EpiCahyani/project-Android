package com.epi.firstproject

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import org.w3c.dom.Text

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenSatu(navController: NavController) {
    Scaffold  (
        topBar = {
            TopAppBar(
                title = {Text("Home")},
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    titleContentColor = Color.Black
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {
            LazyRowDemo(navController)
            LazyColumnDemo(navController)
        }
    }
}
@Composable
fun LazyRowDemo(navController: NavController) {
    val myList = getAllBuahSegar()
    LazyRow (content = {
        itemsIndexed(myList) { _, item->
            BuahSegarItem(item= item, onClick = {navController.navigate("detail/${item.buahName}")})
        }
    })
}
@Composable
fun BuahSegarItem( item : BuahSegar, onClick: () -> Unit){
    Column(
        modifier = Modifier
            .padding(8.dp)
            .clickable { onClick() },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = item.imageRes),
            contentDescription = item.buahName,
            modifier = Modifier
                .clip(CircleShape)
                .size(64.dp)
                .scale(1.0f)
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = item.buahName,
            style = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Bold)
        )
    }
}

@Composable
fun LazyColumnDemo(navController: NavController) {
    val myList = getAllBuahSayur()
    LazyColumn (content = {
        itemsIndexed(myList){ _, item ->
            BuahSayurItem(item = item, onClick = {navController.navigate("detail/${item.sayurName}")})

        }

    })
}
@Composable
fun BuahSayurItem( item : BuahSayur, onClick: () -> Unit){
    Row (
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp)
            .clickable { onClick() },
/*
        horizontalAlignment = Alignment.CenterHorizontally
*/
    )
    {
        Image(painter = painterResource(id = item.imageRes),
            contentDescription = item.name,
            modifier = Modifier
                .clip(CircleShape)
                .size(64.dp)
                .scale(1.0f)
        )
        Column (
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = item.sayurName,
                style = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = item.name,
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Medium)
            )
        }

    }
}
/*@Composable
fun BuahSayurList(navController: NavController) {
    LazyColumn {
        items(getAllBuahSayur()) { item ->
            BuahSayurItem(item = item, onClick = {
                if (item.sayurName == "Wortel") {
                    navController.navigate("desWortelScreen")
                }
            })
        }
    }
}*/


@Composable
fun SimpleColumn() {
    var scrollState = rememberScrollState()
    Column (
        modifier = Modifier.verticalScroll(scrollState)
    ) {
        for (i in 1..10){
            TextItem(text = "item $i")

        }
    }
}
@Composable
fun TextItem(text: String) {

    Text(text = text,
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        textAlign = TextAlign.Center,
        fontSize = 20.sp
    )
}