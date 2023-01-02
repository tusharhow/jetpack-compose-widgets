package com.example.composewidgets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.composewidgets.ui.theme.ComposeWidgetsTheme
import com.example.composewidgets.widgets.badgebox.BadgeBoxExample
import com.example.composewidgets.widgets.box.BoxExample
import com.example.composewidgets.widgets.buttons.CustomToggleButton
import com.example.composewidgets.widgets.chips.ChipExample
import com.example.composewidgets.widgets.column.ColumnExample
import com.example.composewidgets.widgets.constraint_layout.ConstraintLayoutExample
import com.example.composewidgets.widgets.dropdown.DropdownExample
import com.example.composewidgets.widgets.image.ImageResourceDemo
import com.example.composewidgets.widgets.lazy_column.LazyColumnDemo
import com.example.composewidgets.widgets.lazy_row.LazyRowDemo
import com.example.composewidgets.widgets.lazy_vertical_grid.LazyVerticalGridDemo
import com.example.composewidgets.widgets.modalbottomsheetlayout.ModalBottomSheetSample
import com.example.composewidgets.widgets.row.RowExample
import com.example.composewidgets.widgets.slider.SliderExample
import com.example.composewidgets.widgets.snackbar.SnackBarExample
import com.example.composewidgets.widgets.textfield.TextFieldExample
import com.example.composewidgets.widgets.topappbar.TopAppBarExample


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
//                    CustomToggleButton()
//                    MyNormalButton()
//                    Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing*6))
//                    MyOutlinedButton()
//                    Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing*6))
//                    MyTextButton()
//                    Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing*6))
//                    ButtonCornerShape()
//                    MyRadioButton()
//                    RowExample()
//                    ColumnExample()
//                    ImageResourceDemo()
//                    BoxExample()
//                    ConstraintLayoutExample()
//                    LazyRowDemo()
//                    LazyColumnDemo()
//                    LazyVerticalGridDemo()
//                    ChipExample()
//                    SliderExample()
//                    DropdownExample()
//                    ModalBottomSheetSample()
//                    SnackBarExample()
//                    TopAppBarExample()
//                    TextFieldExample()
                    BadgeBoxExample()
                }
            }
        }
    }
}



