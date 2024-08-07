package com.westqasim.trackizer.android.ui.components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.westqasim.trackizer.android.MyApplicationTheme
import com.westqasim.trackizer.android.ui.theme.Colors
import com.westqasim.trackizer.android.ui.theme.MyTypography


@Composable
fun GetStartBtn(text : String, textColor :Color, color : Color){
    // Rounded Button
    Box{
        Button(
            onClick = { /*TODO*/},
            modifier = Modifier
                .width(324.dp),
            shape = RoundedCornerShape(964.dp),
            colors = ButtonDefaults.buttonColors(color),
            elevation = ButtonDefaults.buttonElevation(2.dp),
            ) {
            Text(
                text = text,
                fontSize = 14.sp,
                fontFamily = MyTypography.labelLarge.fontFamily,
                color = textColor)
        }
    }

}


@Preview
@Composable
fun DefaultPreview() {
    GetStartBtn(
        text = "Get Started",
        textColor = Colors.Gray.white,
        color = Colors.AccentPrimary.accentP100
    )
}




