package com.example.catalog

import android.hardware.ConsumerIrManager.CarrierFrequencyRange
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.catalog.ui.theme.CatalogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val cards = listOf(
                ItemColumnModel(R.drawable.ice1, "Заголовок 1", "Описание 1"),
                ItemColumnModel(R.drawable.ice2, "Заголовок 2", "Описание 2"),
                ItemColumnModel(R.drawable.ice3, "Заголовок 3", "Описание 3"),
                ItemColumnModel(R.drawable.ice4, "Заголовок 4", "Описание 4"),
                ItemColumnModel(R.drawable.ice5, "Заголовок 5", "Описание 5"),
                ItemColumnModel(R.drawable.ice6, "Заголовок 6", "Описание 6"),
                ItemColumnModel(R.drawable.ice7, "Заголовок 7", "Описание 7"),
                ItemColumnModel(R.drawable.ice8, "Заголовок 8", "Описание 8"),
                ItemColumnModel(R.drawable.ice9, "Заголовок 9", "Описание 9"),
                ItemColumnModel(R.drawable.ice10, "Заголовок 10", "Описание 10"),
            )

            val rows = cards.chunked(2)
            LazyColumn(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ){
                items(rows){ row ->
                    LazyRow(){
                        items(row){card ->
                            ItemColumn(card)
                        }
                    }
                }
            }
        }
    }
}