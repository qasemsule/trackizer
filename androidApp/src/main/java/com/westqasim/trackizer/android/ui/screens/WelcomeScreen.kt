package com.westqasim.trackizer.android.ui.screens

import android.graphics.Paint.Align
import android.widget.ImageView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.westqasim.trackizer.android.R
import com.westqasim.trackizer.android.ui.components.FrameAnimation
import com.westqasim.trackizer.android.ui.components.GetStartBtn
import com.westqasim.trackizer.android.ui.theme.Colors
import com.westqasim.trackizer.android.ui.theme.MyTypography
import kotlin.math.ceil

@Composable
fun WelcomeScreen() {
    Surface{
            Box(
                modifier = Modifier
                    .fillMaxSize() //fill max width of the screen
                    .background(Colors.Gray.gray80),
               ){
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        modifier = Modifier
                            .padding(top = 60.dp, bottom = 59.dp),
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "Logo")

                    FrameAnimation()

                    Text(
                        text = "Congue malesuada in ac justo, a tristique leo massa. Arcu leo leo urna risus." ,
                        fontFamily = MyTypography.labelSmall.fontFamily,
                        color = Colors.Gray.white,
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        letterSpacing = 0.2.sp,
                        modifier = Modifier.width(290.dp),
                        textAlign = TextAlign.Center
                    )

                    GetStartBtn(
                        text = "Get Started",
                        textColor = Colors.Gray.white,
                        color = Colors.AccentPrimary.accentP100,
                    )
                    GetStartBtn(
                        text = "I have an account",
                        textColor = Colors.Gray.white,
                        color = Colors.Gray.gray70
                    )

                }
            }


    }
}





@Composable
@Preview
fun DefaultPreview() {
    WelcomeScreen()
}
