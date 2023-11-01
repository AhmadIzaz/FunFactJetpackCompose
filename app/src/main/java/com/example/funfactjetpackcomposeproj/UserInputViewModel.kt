package com.example.funfactjetpackcomposeproj

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.funfactjetpackcomposeproj.data.UserDataUiEvents
import com.example.funfactjetpackcomposeproj.data.UserInputScreenState

class UserInputViewModel : ViewModel() {

    val uiState = mutableStateOf(UserInputScreenState())


    fun onEvent(event: UserDataUiEvents) {
        when (event) {
            is UserDataUiEvents.UserNameEntered -> {
                uiState.value = uiState.value.copy(
                    nameEntered = event.name
                )
            }

            is UserDataUiEvents.AnimalSelected -> {
                Log.d("AnimalSelected", "Animal Selected")
                Log.d("AnimalSelected", "${uiState.value}")

                uiState.value = uiState.value.copy(
                    animalSelected = event.animalSelected
                )
            }

            else -> {

            }
        }
    }

    fun isValidState() : Boolean{
        return uiState.value.nameEntered.isNotEmpty() && uiState.value.animalSelected.isNotEmpty()
    }

}