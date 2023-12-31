package com.example.funfactjetpackcomposeproj.data


sealed class UserDataUiEvents {
    data class UserNameEntered(val name: String) : UserDataUiEvents()
    data class AnimalSelected(val animalSelected: String) : UserDataUiEvents()
}