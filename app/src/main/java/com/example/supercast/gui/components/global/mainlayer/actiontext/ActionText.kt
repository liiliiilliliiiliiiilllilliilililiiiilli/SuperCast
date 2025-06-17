// Global components - Main layer - Action text

package com.example.supercast.gui.components.global.mainlayer.actiontext

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.supercast.R
import com.example.supercast.ui.colors.Colors

import com.example.supercast.gui.components.distinctive.spaces.Width



private val textFont = FontFamily (Font (R.font.arimo_bold))
private val textColor = Colors.ActionText

private const val picDescription = "[action image]"



@Composable
fun ActionText (
    isReversed: Boolean = false,
    text: String,
    color: Color = textColor,
    picture: Painter? = null,
    onPress: () -> Unit = {},
    contentAlignment: Alignment = Alignment.TopStart,
    modifier: Modifier = Modifier
) {

    Box (
        modifier = modifier,
        contentAlignment = contentAlignment
    ) {

        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .clickable (onClick = {onPress ()})
                .padding (vertical = 2.5.dp, horizontal = 8.dp)

        ) {

            if (isReversed && picture is Painter) {

                Image (
                    painter = picture,
                    contentDescription = picDescription,
                    modifier = Modifier
                        .size (13.dp)
                        .padding (top = 0.75.dp)
                )

                Width (
                    8.dp
                )

            }

            Text (
                text = text,
                fontSize = 16.sp,
                fontFamily = textFont,
                color = color
            )

            if (!isReversed && picture is Painter) {

                Width (
                    8.dp
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

    }

}