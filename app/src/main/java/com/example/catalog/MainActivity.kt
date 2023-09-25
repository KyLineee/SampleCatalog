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
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    ListItem(imageId = R.drawable.ice1, title = "ice 1", descriptionTitle = "ice 1")
                    ListItem(imageId = R.drawable.ice2, title = "ice 2", descriptionTitle = "ice 2")
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    ListItem(imageId = R.drawable.ice3, title = "ice 3", descriptionTitle = "ice 3")
                    ListItem(imageId = R.drawable.ice4, title = "ice 4", descriptionTitle = "ice 4")
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    ListItem(imageId = R.drawable.ice5, title = "ice 5", descriptionTitle = "ice 5")
                    ListItem(imageId = R.drawable.ice6, title = "ice 6", descriptionTitle = "ice 6")
                }
            }
        }
    }
}

@Composable
private fun ListItem(imageId: Int, title: String, descriptionTitle: String) {
    Card(
        modifier = Modifier
            .padding(10.dp),
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