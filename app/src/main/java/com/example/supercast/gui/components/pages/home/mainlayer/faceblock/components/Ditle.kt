package com.example.supercast.gui.components.pages.home.mainlayer.faceblock.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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



private const val textName = "Sydney Sweeney"
private const val textShortName = "@seediness_sweeney"
private const val textEdit = "Изменить"

private val textNameFont = FontFamily (Font (R.font.gadugi_bold))
private val textShortNameFont = FontFamily (Font (R.font.gadugi_normal))
private val textEditFont = FontFamily (Font (R.font.archivo_extra_bold))

private val colorText = Colors.PreWhite

private val colorEditButtonBack = Colors.BarBackground
private val colorEditButtonCorner = Colors.Button

private val picPen = R.drawable.edit_ordinary_light

private const val picDescription = "[edit image]"



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

        Spacer (
            modifier = Modifier.height (10.dp)
        )

        ShortName (
            text = textShortName
        )

        Spacer (
            modifier = Modifier.height (20.dp)
        )

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
            fontFamily = textNameFont,
            color = colorText
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
        fontFamily = textShortNameFont,
        color = colorText
    )

}



@Composable
private fun EditButton () {

    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .clip (RoundedCornerShape (50))
            .background (color = colorEditButtonCorner)
            .padding (vertical = 2.5.dp, horizontal = 2.5.dp)
            .clip (RoundedCornerShape (47.5f))
            .background (color = colorEditButtonBack)
            .padding (top = 6.dp, start = 16.dp, end = 14.dp, bottom = 6.dp)
    ) {

        Text (
            text = textEdit,
            fontSize = 14.sp,
            fontFamily = textEditFont,
            color = colorText
        )

        Spacer (
            modifier = Modifier.width (8.dp)
        )

        Image (
            painter = painterResource (picPen),
            contentDescription = picDescription,
            modifier = Modifier.size (12.dp)
        )

    }

}