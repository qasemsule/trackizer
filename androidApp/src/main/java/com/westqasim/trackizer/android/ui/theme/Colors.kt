package com.westqasim.trackizer.android.ui.theme


import androidx.compose.ui.graphics.Color


fun String.toColor() = Color(android.graphics.Color.parseColor(this))   //color conversion to hex color
object Colors{

    //gray colors
    val gray100 = "#0E0E12".toColor()
    val gray80 = "#1C1C23".toColor()
    val gray70 = "#353542".toColor()
    val gray60 = "#4E4E61".toColor()
    val gray50 = "#666680".toColor()
    val gray40 = "#83839C".toColor()
    val gray30 = "#A2A2B5".toColor()
    val gray20 = "#C1C1CD".toColor()
    val gray10 = "#E0E0E6".toColor()
    val white = "#FFFFFF".toColor()

    //primary colors
    val primary100 = "#5E00F5".toColor()
    val primary500 = "#7722FF".toColor()
    val primary20 = "#924EFF".toColor()
    val primary10 = "#AD7BFF".toColor()
    val primary05 = "#C9A7FF".toColor()
    val primary0 = "#E4D3FF".toColor()

    //accent primary colors
    val accentP100 = "#FF7966".toColor()
    val accentP50 = "#FFA699".toColor()
    val accentP0 = "#FFD2CC".toColor()

    //accent secondary colors
    val accentS100 = "#00FAD9".toColor()
    val accentS50 = "#7DFFEE".toColor()

}