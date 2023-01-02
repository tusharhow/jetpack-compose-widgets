package com.example.composewidgets.widgets.chips


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ChipExample() {
    val selectedIndex = remember {
        mutableStateOf(0) // default selected index
    }
    val items = listOf("Orange", "Apple", "Mango")
    LazyRow() {
        items(3) {
            Card(
                modifier = Modifier
                    .width(110.dp)
                    .height(60.dp)
                    .padding(5.dp),

                shape = RoundedCornerShape(30.dp),
                backgroundColor = if (selectedIndex.value == it) Red else Gray,
                elevation = 8.dp
            ) {
                Column(

                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.clickable {
                        selectedIndex.value = it
                        println("Selected Index: $it")
                    }
                ) {
                    Text(
                        text = items[it],
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color = White
                        )
                    )
                }

            }

        }
    }
}