package com.example.catalog

sealed class Screen(val route:String) {
    object Home: Screen(route = "home_screen")
    object Order: Screen(route = "order_screen")
}