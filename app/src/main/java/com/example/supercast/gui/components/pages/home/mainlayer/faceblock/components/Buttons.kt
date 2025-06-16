package com.example.supercast.gui.components.pages.home.mainlayer.faceblock.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.supercast.R

import com.example.supercast.gui.components.distinctive.Space
import com.example.supercast.gui.components.distinctive.Width
import com.example.supercast.gui.components.global.mainlayer.ActionText
import com.example.supercast.gui.components.global.mainlayer.CircleActionButton
import com.example.supercast.gui.components.global.mainlayer.CircleOpenCloseButton_Closed


private const val textActionText = "Обо мне"

private val picOpenAction = R.drawable.arrow_compact_light
private val picLink = R.drawable.link_dark
private val picQr = R.drawable.qr_code_dark



@Composable
fun Buttons (
    isDescriptionOpened: Boolean,
    setDescriptionOpened: (Boolean) -> Unit
) {

    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .height (34.dp)
            .fillMaxWidth ()
            .padding (horizontal = 31.dp)
    ) {

        if (!isDescriptionOpened) {

            ActionText (
                text = textActionText,
                picture = painterResource (picOpenAction),
                onPress = {setDescriptionOpened (true)}
            )

            Width (
                14.dp
            )

        }

        else {

            CircleOpenCloseButton_Closed (
                onPress = {setDescriptionOpened (false)}
            )

            Space (
                Modifier.weight (1f)
            )

        }

        CircleActionButton (
            picture = painterResource (picLink),
            onPress = {}
        )

        Width (
            14.dp
        )

        CircleActionButton (
            picture = painterResource (picQr),
            onPress = {}
        )

    }

}