package com.example.composewidgets.widgets

import androidx.compose.material.RadioButton
import androidx.compose.runtime.*

@Composable
fun MyRadioButton() {
    var isChecked by remember { mutableStateOf(false) }
    RadioButton(selected = isChecked, onClick = {
        isChecked = !isChecked
    }
    )
}