package com.epi.firstproject

import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.pager.PageInfo
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.epi.firstproject.ui.theme.FirstProjectTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*enableEdgeToEdge()*/
        setContent {
            FirstProjectTheme {
                MainScreen()
            }
        }
    }
}














/*
@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    Scaffold  (
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ){
        paddingValues ->

        NavHost(
            navController= navController,
            startDestination = "screenSatu",
            modifier = Modifier.padding(paddingValues)
        ){
            composable("screenSatu") { ScreenSatu() }
            composable("screenDua") { ScreenDua() }
            composable("screenTiga") { ScreenTiga() }
        }
    }
}
@Composable
fun BottomNavigationBar(navController: NavController){
    BottomNavigation(
        modifier = Modifier.height(56.dp)
    ){
        BottomNavigationItem(
            selected = currentRoute(navController) == "screenSatu",
            onClick = {
                navController.navigate("screenSatu") {
                    popUpTo("screenSatu") { inclusive = true }
                }
            },
            icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
            label = { Text("Home") }
        ){
        BottomNavigationItem(
            selected = currentRoute(navController) == "screenTiga",
            onClick = {
                navController.navigate("screenTiga") {
                    popUpTo("screenTiga") { inclusive = true }
                }
            },
            icon = { Icon(Icons.Filled.CardGiftcard, contentDescription = "Card") },
            label = { Text("Card") }
        )
            }
        BottomNavigationItem(
            selected = currentRoute(navController) == "screenDua",
            onClick = {
                navController.navigate("screenDua") {
                    popUpTo("screenDua") { inclusive = true }
                }
            },
            icon = { Icon(Icons.Filled.Info, contentDescription = "About") },
            label = { Text("About") }
        )
    }
}


@Composable
fun currentRoute(navController: NavController): String {
    return navController.currentBackStackEntry?.destination?.route ?: ""
}

*/





