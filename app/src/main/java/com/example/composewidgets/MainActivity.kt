package com.example.composewidgets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.composewidgets.ui.theme.ComposeWidgetsTheme
import com.example.composewidgets.widgets.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier =  Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                ComposeWidgetsTheme {
                      CustomToggleButton()
//                    MyNormalButton()
//                    Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing*6))
//                    MyOutlinedButton()
//                    Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing*6))
//                    MyTextButton()
//                    Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing*6))
//                    ButtonCornerShape()
//                    MyRadioButton()

                }
            }
        }
    }
}



