package com.example.composewidgets.widgets.image

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.composewidgets.R

@Composable
fun ImageResourceDemo() {
    val image: Painter = painterResource(id = R.drawable.thumbnail)
    Image(painter = image,contentDescription = "")
}