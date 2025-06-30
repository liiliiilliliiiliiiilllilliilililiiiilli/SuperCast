// Global components - Main layer - Description block

package com.example.supercast.gui.components.global.mainlayer.descriptionblock

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts



private val colorBack = Colors.Blocks
private val colorAreaText = Colors.Text
private val colorLinerBack = Colors.Blocks
private val colorLinerLine = Colors.Line
private val colorLinerText = Colors.PreWhite

private val fontTextArea = Fonts.ArimoRegular
private val fontTextLiner = Fonts.ArimoBold



@Composable
fun DescriptionBlock (
    data: Array <Array <String>>
) {

    Column (
       modifier = Modifier
           .clip (RoundedCornerShape (14.dp))
           .background (colorBack)
           .fillMaxWidth ()
           .padding (bottom = 15.dp)
   ) {

       data.forEach {e ->

           Liner (
               text = e[0]
           )

           TextArea (
               text = e[1]
           )

       }

   }

}



@Composable
private fun Liner (
    text: String
) {

    Box (
        contentAlignment = Alignment.CenterStart,
        modifier = Modifier.padding (top = 25.5.dp, bottom = 14.5.dp)
    ) {

        Box (
            modifier = Modifier
                .height (1.dp)
                .fillMaxWidth ()
                .background (colorLinerLine)
                .clip (RoundedCornerShape (100))
        )

        Text (
            text = text,
            fontSize = 16.sp,
            color = colorLinerText,
            fontFamily = fontTextLiner,
            modifier = Modifier
                .absoluteOffset (x = 25.dp)
                .background (colorLinerBack)
                .padding (horizontal = 5.dp)
        )

    }

}



@Composable
private fun TextArea (
    text: String
) {

    Text (
        text = text,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        color = colorAreaText,
        fontFamily = fontTextArea,
        modifier = Modifier.padding (horizontal = 22.dp)
    )

}