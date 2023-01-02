package com.example.composewidgets.widgets.slider

import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun SliderExample() {
    var sliderPosition by remember { mutableStateOf(0f) }
    Text(text = sliderPosition.toString())
    Slider(value = sliderPosition, onValueChange = { sliderPosition = it })
}