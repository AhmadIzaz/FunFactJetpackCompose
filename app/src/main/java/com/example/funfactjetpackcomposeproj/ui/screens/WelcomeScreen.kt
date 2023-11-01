package com.example.funfactjetpackcomposeproj.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun WelcomeScreen(navControler: NavHostController) {
    Surface(modifier = Modifier.fillMaxWidth().clickable {
        navControler.navigate(Routes.USER_INPUT_SCREEN)
    }) {
        Text(text = Routes.WELCOME_SCREEN, modifier = Modifier
            .fillMaxWidth()
            .height(80.dp))
    }
}

@Preview
@Composable
fun WelcomeScreenPreview(){
    WelcomeScreen(rememberNavController())
}
