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
                Pair(R.drawable.ice1, Pair("Заголовок 1", "Описание 1")),
                Pair(R.drawable.ice2, Pair("Заголовок 2", "Описание 2")),
                Pair(R.drawable.ice3, Pair("Заголовок 3", "Описание 3")),
                Pair(R.drawable.ice4, Pair("Заголовок 4", "Описание 4")),
                Pair(R.drawable.ice5, Pair("Заголовок 5", "Описание 5")),
                Pair(R.drawable.ice6, Pair("Заголовок 6", "Описание 6")),
                Pair(R.drawable.ice7, Pair("Заголовок 7", "Описание 7")),
                Pair(R.drawable.ice8, Pair("Заголовок 8", "Описание 8")),
                Pair(R.drawable.ice9, Pair("Заголовок 9", "Описание 9")),
                Pair(R.drawable.ice10, Pair("Заголовок 10", "Описание 10")),
            )

            val rows = cards.chunked(2)
            LazyColumn(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ){
                items(rows){ row ->
                    LazyRow(){
                        items(row){card ->
                            ListItem(imageId = card.first, title = card.second.first, descriptionTitle = card.second.second)
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun ListItem(imageId: Int, title: String, descriptionTitle: String) {
    Card(
        modifier = Modifier.padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation =CardDefaults.cardElevation(5.dp)
    ) {
        Box(
            modifier = Modifier.background(Color.LightGray)
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = imageId),
                    contentDescription = "ice",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(150.dp)
                )
                Text(text = title)
                Text(text = descriptionTitle)
            }
        }
    }
}