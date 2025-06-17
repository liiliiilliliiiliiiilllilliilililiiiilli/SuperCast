// Main page - Main layer - FaceBlock - Voice

package com.example.supercast.gui.components.pages.home.mainlayer.faceblock.voice

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts

import com.example.supercast.gui.components.distinctive.spaces.Width
import com.example.supercast.gui.components.global.mainlayer.playbutton.PlayButton



private val colorTube = Colors.OliveLight

private val textFont = Fonts.FiraSansSemiBold
private val colorText = Colors.Olive



@Composable
fun Voice (
    duration: Int,
    signs: Array <Dp> = arrayOf (
        4.dp,
        12.dp,
        28.dp,
        12.dp,
        36.dp,
        12.dp,
        20.dp,
        12.dp,
        4.dp,
        12.dp,
        4.dp
    )
) {

    Row (
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .width (163.5.dp)
            .padding (start = 17.dp)
    ) {

        PlayButton (
            scale = 1f
        )

        Width (
            8.dp
        )

        Column {

            SoundPrint (
                signs = signs
            )

            Times (
                duration = duration
            )

        }

    }

}



@Composable
private fun SoundPrint (
    signs: Array <Dp>
) {

    Row (
        verticalAlignment = Alignment.CenterVertically
    ) {

        @Composable
        fun Tube (
            height: Dp
        ) {

            Box (
                modifier = Modifier
                    .padding (horizontal = 2.5.dp)
                    .clip (RoundedCornerShape (100))
                    .height (height)
                    .width (4.dp)
                    .background (color = colorTube)
            )

        }


        signs.forEach {height ->

            Tube (
                height = height
            )

        }

    }

}



@Composable
private fun Times (
    duration: Int
) {

    val durationSeconds = duration % 60
    val durationMinutes = (duration - durationSeconds) % 60

    val text = "$durationSeconds".padStart(2, '0') + ":" + "$durationMinutes".padStart(2, '0')


    Text (
        text = text,
        fontSize = 14.sp,
        color = colorText,
        fontFamily = textFont,
        modifier = Modifier.offset (x = 5.dp, y = 11.dp)
    )

}