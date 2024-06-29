package com.aaliyah.alfamind.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Topup: Screen("topup")
    object Profile : Screen("profile")
}