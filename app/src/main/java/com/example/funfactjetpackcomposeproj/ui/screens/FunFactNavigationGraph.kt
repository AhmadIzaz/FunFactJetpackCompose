package com.example.funfactjetpackcomposeproj.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.funfactjetpackcomposeproj.UserInputViewModel

@Composable
fun FunFactNavigationGraph(userInputViewModel: UserInputViewModel = viewModel()){
    val navControler = rememberNavController()
    NavHost(navController = navControler , startDestination = Routes.USER_INPUT_SCREEN){
        composable(Routes.USER_INPUT_SCREEN){
            UserInputScreen(userInputViewModel)
        }

        composable(Routes.WELCOME_SCREEN){
            WelcomeScreen(navControler)
        }
    }
}