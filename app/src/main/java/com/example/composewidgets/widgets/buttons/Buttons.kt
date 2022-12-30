package com.example.composewidgets.widgets.buttons


import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


fun showToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

@Composable
fun MyNormalButton() {

    val context = LocalContext.current

    Button(
        onClick = { showToast(context, "Add Button Clicked") },

        modifier = Modifier
            .height(50.dp)
            .width(130.dp),

        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Red,
            contentColor = Color.White
        )
    ) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = "Add Icon",
            modifier = Modifier.size(ButtonDefaults.IconSize*1.5f)
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text("Add",fontSize = 20.sp)
    }
}

@Composable
fun  MyOutlinedButton() {

    val context = LocalContext.current
    OutlinedButton(onClick = { showToast(context, message = "Like Button Clicked") }, modifier = Modifier
        .height(50.dp)
        .width(130.dp),) {

        Icon(
            imageVector = Icons.Filled.Favorite,
            contentDescription = "Favourite Icon",
            modifier = Modifier.size(ButtonDefaults.IconSize*1.5f)
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text("Like",fontSize = 20.sp)
    }


}

@Composable
fun  MyTextButton(){
    val context = LocalContext.current
    TextButton(onClick = { showToast(context, message = "Text Button Clicked") }) {
        Text("Text Button",fontSize = 20.sp)
    }
}
@Composable
fun ButtonCornerShape() {
    val context = LocalContext.current
    Button(onClick = { showToast(context, message = "Corner Shape Button Clicked") }, shape = CutCornerShape(4.dp), modifier = Modifier
        .height(50.dp)
        .width(250.dp)) {
        Text(text = "Cut corner shape",fontSize = 20.sp)
    }
}