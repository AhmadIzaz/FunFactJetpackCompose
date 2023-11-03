package com.example.funfactjetpackcomposeproj.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.funfactjetpackcomposeproj.UserInputViewModel
import com.example.funfactjetpackcomposeproj.ui.screens.Routes.ANIMAL_SELECTED

@Composable
fun FunFactNavigationGraph(userInputViewModel: UserInputViewModel = viewModel()) {
    val navControler = rememberNavController()
    NavHost(navController = navControler, startDestination = Routes.USER_INPUT_SCREEN) {
        composable(Routes.USER_INPUT_SCREEN) {
            UserInputScreen(userInputViewModel, showWelcomeScreen = {
                navControler.navigate(Routes.WELCOME_SCREEN+"/${it.first}/${it.second}")
            })
        }

        composable(
            "${Routes.WELCOME_SCREEN}/{${Routes.NAME}}/{${ANIMAL_SELECTED}}",
            arguments = listOf(
                navArgument(name = Routes.NAME) { type = NavType.StringType },
                navArgument(name = ANIMAL_SELECTED) { type = NavType.StringType }
            )
        ) {
            val username = it.arguments?.getString(Routes.NAME)
            val animalSelected = it.arguments?.getString(Routes.ANIMAL_SELECTED)
            WelcomeScreen(username, animalSelected)
        }
    }
}