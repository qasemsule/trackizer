package com.westqasim.trackizer.android.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.westqasim.trackizer.android.ui.theme.MyTypography


@Composable

fun GetStartBtn(text : String, color : Color){
    // Rounded Button
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier.padding(8.dp).fillMaxWidth(),
        shape = RoundedCornerShape(964.dp),
        colors = ButtonDefaults.buttonColors(color),
    ) {
        Text(text = text, fontSize = 14.sp, fontFamily = MyTypography.labelLarge.fontFamily)
    }
}




