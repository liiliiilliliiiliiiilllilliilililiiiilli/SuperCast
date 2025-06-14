package com.example.supercast.gui.components.global.mainlayer

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.R
import com.example.supercast.ui.Colors



private val textFont = FontFamily (Font (R.font.arimo_bold))
private val textColor = Colors.OliveMonochromic

private const val picDescription = "[action image]"



@Composable
fun ActionText (
    text: String,
    picture: Painter
) {

    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.padding (vertical = 2.5.dp, horizontal = 8.dp)
    ) {

        Text (
            text = text,
            fontSize = 16.sp,
            fontFamily = textFont,
            color = textColor
        )

        Spacer (
            modifier = Modifier.width (8.dp)
        )

        Image (
            painter = picture,
            contentDescription = picDescription,
            modifier = Modifier
                .size (13.dp)
                .padding (top = 0.75.dp)
        )

    }

}