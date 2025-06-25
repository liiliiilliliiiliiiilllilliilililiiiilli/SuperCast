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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts

import com.example.supercast.gui.components.distinctive.spaces.Width



private val colorText = Colors.ActionText

private val fontText = Fonts.ArimoBold

private const val textPicActionTextDescription = "[action pic]"



@Composable
fun ActionText (
    text: String,
    color: Color = colorText,
    pic: Int? = null,
    isReversed: Boolean = false,
    onPress: (() -> Unit) = {},
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
                .clickable (onClick = onPress)
                .padding (vertical = 2.5.dp, horizontal = 8.dp)

        ) {

            if (isReversed && pic is Int) {

                Image (
                    painter = painterResource (pic),
                    contentDescription = textPicActionTextDescription,
                    modifier = Modifier
                        .size (13.dp)
                        .padding (top = 0.75.dp)
                )

                Width (8)

            }

            Text (
                text = text,
                fontSize = 14.5.sp,
                color = color,
                fontFamily = fontText
            )

            if (!isReversed && pic is Int) {

                Width (8)

                Image (
                    painter = painterResource (pic),
                    contentDescription = textPicActionTextDescription,
                    modifier = Modifier
                        .size (13.dp)
                        .padding (top = 0.75.dp)
                )

            }

        }

    }

}