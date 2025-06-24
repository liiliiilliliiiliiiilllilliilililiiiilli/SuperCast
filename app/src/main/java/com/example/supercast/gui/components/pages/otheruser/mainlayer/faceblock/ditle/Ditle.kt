// Main page - Main layer - FaceBlock - Ditle

package com.example.supercast.gui.components.pages.otheruser.mainlayer.faceblock.ditle

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.distinctive.spaces.Width



private const val textName = "Котик полевой"
private const val textShortName = "@cesty_cat"
private const val textSubscribed = "Подписано"
private const val textSubscribedSomeOf = "из"

private val fontName = Fonts.GadugiBold
private val fontShortName = Fonts.GadugiRegular
private val fontEditButton = Fonts.ArchivoExtraBold

private val colorText = Colors.PreWhite

private val colorEditButtonBack = Colors.Button
private val colorEditButtonCorner = Colors.Button

private val picTriangle = Pics.UnwrapTriangleLight
private const val textPicTriangleDescription = "[edit pic]"



@Composable
fun Ditle () {

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth ()
            .padding (end = 8.dp)
    ) {

        Name (
            text = textName
        )

        Height (10)

        ShortName (
            text = textShortName
        )

        Height (20)

        EditButton ()

    }

}



@Composable
private fun Name (
    text: String
) {

    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        Text (
            text = text,
            fontSize = 23.sp,
            color = colorText,
            fontFamily = fontName
        )

    }

}



@Composable
private fun ShortName (
    text: String
) {

    Text (
        text = text,
        fontSize = 16.sp,
        color = colorText,
        fontFamily = fontShortName
    )

}



@Composable
private fun EditButton () {

    val numSubscribed = 5
    val numTotalSubscriptions = 6

    val text = "$textSubscribed ($numSubscribed $textSubscribedSomeOf $numTotalSubscriptions)"


    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .clip (RoundedCornerShape (50))
            .background (color = colorEditButtonCorner)
            .padding (vertical = 2.5.dp, horizontal = 2.5.dp)
            .clip (RoundedCornerShape (47.5f))
            .background (color = colorEditButtonBack)
            .padding (top = 6.dp, start = 15.dp, end = 15.dp, bottom = 6.dp)
    ) {

        Text (
            text = text,
            fontSize = 14.sp,
            color = colorText,
            fontFamily = fontEditButton
        )

        Width (8)

        Image (
            painter = painterResource (picTriangle),
            contentDescription = textPicTriangleDescription,
            modifier = Modifier
                .size (8.dp)
                .offset (y = 0.75.dp)
        )

    }

}