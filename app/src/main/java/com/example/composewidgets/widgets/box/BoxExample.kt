package com.example.composewidgets.widgets.box


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.unit.dp

@Composable
fun BoxExample() {
    Box(Modifier.fillMaxSize()) {
        Text("This text is drawn first", modifier = Modifier.align(Alignment.TopCenter))
        Box(
            Modifier.align(Alignment.TopCenter).fillMaxHeight().width(
                50.dp
            ).background(Blue)
        )
        Text("This text is drawn last", modifier = Modifier.align(Alignment.Center))
        FloatingActionButton(
            modifier = Modifier.align(Alignment.BottomEnd).padding(12.dp),
            onClick = {}
        ) {
            Text("+")
        }
    }
}