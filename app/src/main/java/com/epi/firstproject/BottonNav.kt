package com.epi.firstproject

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

enum class BottomNavItem(val title: String, val icon: ImageVector) {
    Home("Home", Icons.Default.Home),
    Grid("Grid", Icons.Default.ShoppingCart),
    About("About", Icons.Default.Info)
}
