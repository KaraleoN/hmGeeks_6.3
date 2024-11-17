package com.geeks.rickandmortyapi.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.geeks.rickandmortyapi.ui.screens.CharacterScreen
import com.geeks.rickandmortyapi.ui.screens.EpisodeScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "characters"
    ) {
        composable("characters") { CharacterScreen() }
        composable("episodes") { EpisodeScreen() }
    }
}