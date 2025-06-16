package com.example.supercast.gui.components.global.mainlayer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.R
import com.example.supercast.ui.Colors

import com.example.supercast.gui.components.distinctive.Space
import com.example.supercast.gui.components.distinctive.Width



private val colorLine = Colors.Line
private val colorItemsBack = Colors.Black

private val colorText = Colors.PreWhite
private val fontText = FontFamily (Font (R.font.fredoka_semi_bold))

private val picTriangle = R.drawable.wrap_triangle_light

private const val picOptionDescription = "[option pic]"
private const val picListDescription = "[triangle pic]"



@Composable
fun Liner (
    text: String,
    buttPicRight: Int,
    picRightOnPress: () -> Unit
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

            ListButton (
                text = text
            )

            Space (
                Modifier.weight (1f)
            )

            PicButton (
                pic = buttPicRight,
                picRightOnPress = picRightOnPress
            )

        }

    }

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
            .clickable (onClick = {unwrapAction ()})
            .background (color = colorItemsBack)
            .padding (horizontal = 10.dp)
    ) {

        Text (
            text = text,
            fontSize = 27.sp,
            fontFamily = fontText,
            color = colorText
        )

        Width (
            10.dp
        )

        Image (
            painter = painterResource (picTriangle),
            contentDescription = picListDescription,
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
        contentDescription = picOptionDescription,
        modifier = Modifier
            .clickable (onClick = {picRightOnPress ()})
            .background (color = colorItemsBack)
            .padding (horizontal = 10.dp)
            .size (25.dp)
    )

}