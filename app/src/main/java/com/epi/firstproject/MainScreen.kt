package com.epi.firstproject

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen(modifier: Modifier = Modifier){
    val navController = rememberNavController()

    val navItemList = listOf(
        NavItem("Home", Icons.Default.Home),
        NavItem("Card", Icons.Default.ShoppingCart),
        NavItem("About", Icons.Default.AccountCircle),
    )
    var selectedIndex by remember {
        mutableIntStateOf(value = 0)
    }
    Scaffold (
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navItemList.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick = {
                            selectedIndex = index
                            when (index){
                                0 -> navController.navigate("home")
                                1 -> navController.navigate("card")
                                2 -> navController.navigate("about")
                            }
                        },
                        icon = {
                            Icon(imageVector = navItem.icon, contentDescription = "icon")
                        },
                        label = {
                            Text(text = navItem.label)
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("home"){ ScreenSatu(navController) }
            composable("card"){ ScreenTiga(navController) }
            composable("about"){ ScreenDua() }
            composable("detail/{itemName") {backStackEntry ->
                val itemName = backStackEntry.arguments?.getString("itemName") ?: ""
                DetileCard(itemName = itemName)
            }
        }
/*
        ContentScreen(modifier = Modifier.padding(innerPadding), selectedIndex)
*/
    }
}


/*@Composable
fun ContentScreen(modifier: Modifier = Modifier, selectIndex : Int){
    when(selectIndex){
        0-> ScreenSatu()
        1-> ScreenTiga(navController)
        2-> ScreenDua()
    }
}*/
