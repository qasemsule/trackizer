package com.westqasim.trackizer.android.ui.screens

import android.graphics.Paint.Align
import android.widget.ImageView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.westqasim.trackizer.android.R
import com.westqasim.trackizer.android.ui.components.FrameAnimation
import com.westqasim.trackizer.android.ui.components.GetStartBtn
import com.westqasim.trackizer.android.ui.theme.Colors

@Composable
fun WelcomeScreen() {
    Surface{
            Box(
                modifier = Modifier
                    .fillMaxSize() //fill max width of the screen
                    .background(Colors.Gray.gray80),
               ){
                Column() {
                    Image(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 60.dp, bottom = 59.dp),
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "Logo")

                    FrameAnimation()
                }
            }


    }
}





@Composable
@Preview
fun DefaultPreview() {
    WelcomeScreen()
}
