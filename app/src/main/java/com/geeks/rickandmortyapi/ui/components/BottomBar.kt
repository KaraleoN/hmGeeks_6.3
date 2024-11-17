package com.geeks.rickandmortyapi.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.Person

@Composable
fun BottomBar(navController: NavController) {
    val currentRoute = navController.currentBackStackEntryAsState()?.value?.destination?.route

    NavigationBar {
        NavigationBarItem(
            icon = { Icon(Icons.Filled.Person, contentDescription = "Characters") },
            label = { Text("Characters") },
            selected = currentRoute == "characters",
            onClick = {
                if (currentRoute != "characters") {
                    navController.navigate("characters") {
                        popUpTo(navController.graph.startDestinationId) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Filled.Movie, contentDescription = "Episodes") },
            label = { Text("Episodes") },
            selected = currentRoute == "episodes",
            onClick = {
                if (currentRoute != "episodes") {
                    navController.navigate("episodes") {
                        popUpTo(navController.graph.startDestinationId) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            }
        )
    }
}