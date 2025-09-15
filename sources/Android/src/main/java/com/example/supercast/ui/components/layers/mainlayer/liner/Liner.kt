// Global components - Main layer - Liner

package com.example.supercast.ui.components.layers.mainlayer.liner

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts
import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.common.spaces.Space
import com.example.supercast.ui.components.common.spaces.Width



private val colorLine = Colors.Line
private val colorItemsBack = Colors.Black
private val colorListButton = Colors.PreWhite

private val fontListButton = Fonts.ArchivoSemiBold

private val picTriangle = Pics.TriangleUnwrapLight

private const val textPicTriangleDescription = "[triangle pic]"
private const val textPicPicButtonDescription = "[option pic]"



@Composable
fun Liner (
    text: String? = null,
    fontSize: Int = 27,
    textWrap: String? = null,
    buttonPicRight: (Array <Int>)? = null,
    buttonPicRightOnPress: (() -> Unit)? = null
) {

    Box (
        contentAlignment = Alignment.CenterStart,
        modifier = Modifier.height (42.dp)
    ) {

        Line ()

        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding (horizontal = 34.dp)
        ) {

            if (text != null) {

                JustText (
                    text = text,
                    fontSize = fontSize
                )

            }

            if (textWrap != null) {

                ListButton (
                    text = textWrap
                )

            }

            Space (Modifier.weight (1f))

            if (buttonPicRight != null && buttonPicRightOnPress != null) {

                buttonPicRight.forEachIndexed {index, pic ->

                    PicButton (
                        pic = buttonPicRight[index],
                        picRightOnPress = buttonPicRightOnPress
                    )

                    if (index != buttonPicRight.size - 1) {

                        Width (8)

                    }

                }

            }

        }

    }

}



@Composable
private fun JustText (
    text: String,
    fontSize: Int
) {

    Text (
        text = text,
        fontSize = fontSize.sp,
        color = colorListButton,
        fontFamily = fontListButton,
        modifier = Modifier
            .background (colorItemsBack)
            .padding (horizontal = 10.dp)
    )

}



@Composable
private fun Line () {

    Box (
        modifier = Modifier
            .background (colorLine)
            .height (1.dp)
            .fillMaxWidth ()
            .clip (RoundedCornerShape (100.dp))
    )

}



@Composable
private fun ListButton (
    text: String,
) {

    val unwrapAction = {}


    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .clickable (onClick = unwrapAction)
            .background (colorItemsBack)
            .padding (horizontal = 10.dp)
    ) {

        Text (
            text = text,
            fontSize = 27.sp,
            color = colorListButton,
            fontFamily = fontListButton
        )

        Width (10)

        Image (
            painter = painterResource (picTriangle),
            contentDescription = textPicTriangleDescription,
            modifier = Modifier
                .size (8.dp)
                .offset (y = 2.5.dp)
        )

    }

}



@Composable
private fun PicButton (
    pic: Int,
    picRightOnPress: () -> Unit
) {

    Image (
        painter = painterResource (pic),
        contentDescription = textPicPicButtonDescription,
        modifier = Modifier
            .clickable (onClick = picRightOnPress)
            .background (colorItemsBack)
            .padding (horizontal = 10.dp)
            .size (25.dp)
    )

}