// Main page - Main layer - FaceBlock

package com.example.supercast.gui.components.pages.home.mainlayer.faceblock

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.supercast.ui.Colors

import com.example.supercast.gui.components.pages.home.mainlayer.faceblock.components.*



private val colorBack = Colors.Blocks



@Composable
fun FaceBlock () {

    Column (
        modifier = Modifier.padding (top = 17.dp)
    ) {

        Face ()

        Spacer (
            modifier = Modifier.height (13.5.dp)
        )

        ButtonsBar ()

    }

}



@Composable
private fun Face () {

    Column (
        modifier = Modifier
            .height (279.5.dp)
            .fillMaxWidth ()
            .clip (RoundedCornerShape (topStart = 29.dp, topEnd = 29.dp, bottomStart = 21.dp, bottomEnd = 21.dp))
            .background (color = colorBack)
            .padding (top = 17.dp, bottom = 12.dp, /*left = 20.dp, right = 20.dp*/)
    ) {

        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth ()
        ) {

            Ava ()

            Ditle ()

        }

        Spacer (
            modifier = Modifier.height (5.dp)
        )

        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize ()
        ) {

            Voice (
                duration = 25
            )

            Stats ()

        }

    }

}



@Composable
private fun ButtonsBar () {

    val isDescriptionOpened = true


    Column (
        modifier = Modifier.fillMaxWidth ()
    ) {

        Buttons (
            isDescriptionOpened = isDescriptionOpened
        )

        if (isDescriptionOpened) {

            Spacer (
                modifier = Modifier.height (25.dp)
            )

            Description ()

        }

    }

}