package com.example.composewidgets.widgets.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composewidgets.R

@Composable
fun CustomToggleButton() {
    var isToggled by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Card(
            shape = RoundedCornerShape(50.dp),
            elevation = 0.dp
        ) {
            Box(
                modifier = Modifier
                    .background(
                        if (isToggled) Color(0xFF008000) else Color.Gray
                    )
                    .clickable {
                        isToggled = !isToggled
                    },
                contentAlignment = Alignment.Center
            ) {
                if (isToggled) {
                    Row(
                        modifier = Modifier.padding(5.dp)
                    ) {
                        Text(
                            text = "On", style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.W400
                            ), color = Color.White, modifier = Modifier
                                .padding(start = 10.dp)
                                .align(
                                    Alignment.CenterVertically
                                )
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.on), contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                } else {
                    Row(
                        modifier = Modifier.padding(5.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.off), contentDescription = null,
                            tint = Color.Unspecified
                        )
                        Text(
                            text = "Off", style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.W400
                            ), color = Color.White, modifier = Modifier
                                .padding(start = 10.dp, end = 10.dp)
                                .align(
                                    Alignment.CenterVertically
                                )
                        )
                    }
                }
            }
        }
    }
}