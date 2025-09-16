// Home page - Main layer - Face block

package com.example.supercast.ui.pages.home.layers.main.components.faceblock

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.spaces.Height

import com.example.supercast.ui.components.avacirclebig.AvaCircleBig as Ava
import com.example.supercast.ui.pages.home.layers.main.components.faceblock.ditle.Ditle
import com.example.supercast.ui.pages.home.layers.main.components.faceblock.voice.Voice
import com.example.supercast.ui.pages.home.layers.main.components.faceblock.stats.Stats
import com.example.supercast.ui.pages.home.layers.main.components.faceblock.buttons.Buttons
import com.example.supercast.ui.pages.home.layers.main.components.faceblock.description.Description


private const val isDescriptionOpened_initialState = false

private val colorBack = Colors.Blocks

private val picAva = Pics.__image_1__



@Composable
fun FaceBlock (
    modifier: Modifier
) {

    Column (
        modifier = Modifier
            .padding (top = 17.dp)
            .then (modifier)
    ) {

        Face ()

        Height (13.5)

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
            .background (colorBack)
            .padding (top = 17.dp, bottom = 12.dp) // left = 20.dp, right = 20.dp
    ) {

        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth ()
        ) {

            Ava (
                pic = picAva,
                modifier = Modifier.padding (start = 17.dp)
            )

            Ditle()

        }

        Height (5)

        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize ()
        ) {

            Voice(
                duration = 25
            )

            Stats()

        }

    }

}



@Composable
private fun ButtonsBar () {

    val (isDescriptionOpened, setDescriptionOpened) = remember {mutableStateOf (isDescriptionOpened_initialState)}


    Column (
        modifier = Modifier.fillMaxWidth ()
    ) {

        Buttons(
            isDescriptionOpened = isDescriptionOpened,
            setDescriptionOpened = setDescriptionOpened
        )

        if (isDescriptionOpened) {

            Height (12.5)

            Description()

        }

    }

}