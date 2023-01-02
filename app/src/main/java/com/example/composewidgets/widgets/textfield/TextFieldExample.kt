package com.example.composewidgets.widgets.textfield

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember


@Composable
fun TextFieldExample() {
    Column {
        var state =  remember { mutableStateOf("") }
          TextField(value = state.value, onValueChange = { state.value = it })
        Text("The textfield has this text: ${state.value}")
    }
}