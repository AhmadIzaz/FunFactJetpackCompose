package com.example.funfactjetpackcomposeproj.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController

@Composable
fun WelcomeScreen(name: String?, animalSelected: String?) {
    Surface(modifier = Modifier
        .fillMaxWidth()
        .clickable {
        }) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp)
        ) {
            TopBar(textValue = "Welcome $name \uD83D\uDE0A")

            TextComponent(textValue = "Lets learn about it", textSize = 24.sp)

            Spacer(modifier = Modifier.size(20.dp))

            TextComponent(
                textValue = "This app will create a detailed page base on the option you selected",
                textSize = 18.sp
            )

            Spacer(modifier = Modifier.size(60.dp))

            val finalText =
                if (animalSelected == "Cat") "You are a cat lover \uD83D\uDC31" else "You are a dog lover \uD83D\uDC36"

            TextComponent(textValue = finalText, textSize = 24.sp, fontWeight = FontWeight.Light)

            FactComposable(value = "Use the viewModel to show your facts here")

        }
    }
}
