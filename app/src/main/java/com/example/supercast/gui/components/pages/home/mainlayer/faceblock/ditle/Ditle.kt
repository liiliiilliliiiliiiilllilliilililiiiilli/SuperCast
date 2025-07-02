// Home page - Main layer - Face block - Ditle

package com.example.supercast.gui.components.pages.home.mainlayer.faceblock.ditle

import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
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

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Height
import com.example.supercast.gui.components.distinctive.spaces.Width



private val colorEditButtonBack = Colors.BarBackground
private val colorEditButtonCorner = Colors.Button
private val colorText = Colors.PreWhite

private val fontTextEdit = Fonts.ArchivoExtraBold
private val fontTextName = Fonts.GadugiBold
private val fontTextShortName = Fonts.GadugiRegular

private val picPen = Pics.PenOrdinaryGreyLight

private const val textPicPenDescription = "[edit pic]"

private const val textEdit = "Изменить"

private const val textName = "Sydney Sweeney"
private const val textShortName = "@seediness_sweeney"



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

        SubscribeButton ()

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
            fontFamily = fontTextName
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
        fontFamily = fontTextShortName
    )

}



@Composable
private fun SubscribeButton () {

    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .clip (RoundedCornerShape (50))
            .background (colorEditButtonCorner)
            .padding (vertical = 2.5.dp, horizontal = 2.5.dp)

            .clip (RoundedCornerShape (47.5f))
            .background (colorEditButtonBack)
            .padding (top = 6.dp, start = 16.dp, end = 14.dp, bottom = 6.dp)
    ) {

        Text (
            text = textEdit,
            fontSize = 14.sp,
            color = colorText,
            fontFamily = fontTextEdit
        )

        Width (8)

        Image (
            painter = painterResource (picPen),
            contentDescription = textPicPenDescription,
            modifier = Modifier.size (12.dp)
        )

    }

}