package com.example.composewidgets.widgets.row

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RowExample() {
    Row(horizontalArrangement = Arrangement.SpaceEvenly) {
        Text("Hello World!")
        Spacer(modifier = Modifier.size(10.dp))
        Text("Hello World!2")
    }
}