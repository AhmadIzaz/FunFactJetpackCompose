package com.example.funfactjetpackcomposeproj.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.funfactjetpackcomposeproj.R
import com.example.funfactjetpackcomposeproj.UserInputViewModel
import com.example.funfactjetpackcomposeproj.data.UserDataUiEvents


@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ) {
            TopBar("Hi Ahmad! \uD83D\uDE0A")

            TextComponent(textValue = "Let us Learn about you !", textSize = 24.sp)

            Spacer(modifier = Modifier.size(20.dp))

            TextComponent(
                textValue = "This app will prepare a details page based on input provided by you.",
                textSize = 18.sp
            )

            Spacer(modifier = Modifier.size(20.dp))

            TextComponent(textValue = "Name", textSize = 18.sp)

            Spacer(modifier = Modifier.size(10.dp))

            TextFieldComponent(onTextChanged = {
                userInputViewModel.onEvent(UserDataUiEvents.UserNameEntered(it))
            })

            Spacer(modifier = Modifier.size(20.dp))

            TextComponent(textValue = "What do you like", textSize = 18.sp)

            Spacer(modifier = Modifier.size(20.dp))

            Row(modifier = Modifier.fillMaxWidth()) {
                AnimalCard(
                    R.drawable.ic_launcher_background, animalSelected = {
                        userInputViewModel.onEvent(UserDataUiEvents.AnimalSelected(it))
                    }, selected = userInputViewModel.uiState.value.animalSelected == "Cat"
                )

                AnimalCard(R.drawable.ic_launcher_foreground, animalSelected = {
                    userInputViewModel.onEvent(UserDataUiEvents.AnimalSelected(it))
                }, selected = userInputViewModel.uiState.value.animalSelected == "Dog")

            }

            Spacer(modifier = Modifier.weight(1f))

            if (userInputViewModel.isValidState()) ButtonComponent(onClick = {

            })
            else {
            }

        }
    }
}
