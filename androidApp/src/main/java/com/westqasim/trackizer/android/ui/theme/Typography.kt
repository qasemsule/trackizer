package com.westqasim.trackizer.android.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.westqasim.trackizer.android.R

val MyTypography = Typography(
    labelLarge = TextStyle(
        fontFamily = FontFamily(Font(resId = R.font.inter_28pt_bold)),
        fontWeight = FontWeight.Bold,
        lineHeight = 108.sp
    ),
    labelMedium = TextStyle(
        fontFamily = FontFamily(Font(resId = R.font.inter_24pt_medium)),
        fontWeight = FontWeight.Bold,
        lineHeight = 108.sp

    ),
    displayMedium = TextStyle(
        fontFamily = FontFamily(Font(resId = R.font.inter_18pt_medium)),
        fontWeight = FontWeight.SemiBold,
        lineHeight = 108.sp

    ),
    displaySmall = TextStyle(
        fontFamily = FontFamily(Font(resId = R.font.inter_18pt_regular)),
        fontWeight = FontWeight.Thin,
        lineHeight = 108.sp
    )

)