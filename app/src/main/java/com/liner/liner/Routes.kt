package com.liner.liner

sealed class Routes (val route: String) {
    object Login : Routes("Login")
}