package com.example.catalog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController

@Composable
fun Order(
    navController: NavController
){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = {
                navController.navigate(route = Screen.Home.route){
                    popUpTo(Screen.Home.route){
                        inclusive = true
                    }
                }
            },
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.color_button))
        ) {
            Text(text = "Заказать")
        }
    }
}