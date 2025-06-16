// Global components - Main layer - DescriptionBlock

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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.R
import com.example.supercast.ui.colors.Colors



private val colorBack = Colors.Blocks

private val textLinerFont = FontFamily (Font (R.font.arimo_bold))
private val textAreaFont = FontFamily (Font (R.font.arimo_regular))

private val colorLinerLine = Colors.Line
private val colorLinerText = Colors.PreWhite
private val colorLinerBack = Colors.Blocks

private val colorAreaText = Colors.Text



@Composable
fun DescriptionBlock (
    data: Array <Array <String>>
) {

    Column (
       modifier = Modifier
           .clip (RoundedCornerShape (14.dp))
           .background (color = colorBack)
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
                .background (color = colorLinerLine)
                .clip (RoundedCornerShape (100))
        )

        Text (
            text = text,
            fontSize = 16.sp,
            fontFamily = textLinerFont,
            color = colorLinerText,
            modifier = Modifier
                .absoluteOffset (x = 25.dp)
                .background (color = colorLinerBack)
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
        fontFamily = textAreaFont,
        color = colorAreaText,
        modifier = Modifier.padding (horizontal = 22.dp)
    )

}