// Global components - Action text

package com.example.supercast.ui.components.actiontext

import androidx.compose.foundation.clickable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts

import com.example.supercast.ui.components.spaces.Width



private val colorText = Colors.ActionText

private val fontText = Fonts.ArimoBold

private const val textPicActionTextDescription = "[action pic]"



@Composable
fun ActionText (
    text: String,
    color: Color = colorText,
    pic: Int? = null,
    isReversed: Boolean = false,
    onPress: (() -> Unit) = {}
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
                    .size (14.dp)
                    .padding (top = 0.75.dp)
            )

            Width (8)

        }

        Text (
            text = text,
            fontSize = 16.sp,
            color = color,
            fontFamily = fontText
        )

        if (!isReversed && pic is Int) {

            Width (8)

            Image (
                painter = painterResource (pic),
                contentDescription = textPicActionTextDescription,
                modifier = Modifier
                    .size (14.dp)
                    .padding (top = 0.75.dp)
            )

        }

    }

}