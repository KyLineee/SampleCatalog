package com.example.catalog

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun HomeScreen(
    navController: NavController
){
    val cards = listOf(
        ItemColumnModel(R.drawable.ice1, "Заголовок 1", "Описание 1", 0),
        ItemColumnModel(R.drawable.ice2, "Заголовок 2", "Описание 2", 1),
        ItemColumnModel(R.drawable.ice3, "Заголовок 3", "Описание 3", 2),
        ItemColumnModel(R.drawable.ice4, "Заголовок 4", "Описание 4", 3),
        ItemColumnModel(R.drawable.ice5, "Заголовок 5", "Описание 5", 4),
        ItemColumnModel(R.drawable.ice6, "Заголовок 6", "Описание 6", 5),
        ItemColumnModel(R.drawable.ice7, "Заголовок 7", "Описание 7", 6),
        ItemColumnModel(R.drawable.ice8, "Заголовок 8", "Описание 8", 7),
        ItemColumnModel(R.drawable.ice9, "Заголовок 9", "Описание 9", 8),
        ItemColumnModel(R.drawable.ice10, "Заголовок 10", "Описание 10", 9),
    )

    val rows = cards.chunked(2)
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        items(rows){ row ->
            LazyRow(){
                items(row){card ->
                    ItemColumn(card,navController)
                }
            }
        }
    }
}