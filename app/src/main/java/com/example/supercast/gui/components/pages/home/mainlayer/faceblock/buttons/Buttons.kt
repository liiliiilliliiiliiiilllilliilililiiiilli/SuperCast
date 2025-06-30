// Main page - Main layer - Face block - Buttons

package com.example.supercast.gui.components.pages.home.mainlayer.faceblock.buttons

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Space
import com.example.supercast.gui.components.distinctive.spaces.Width
import com.example.supercast.gui.components.global.mainlayer.actiontext.ActionText
import com.example.supercast.gui.components.global.mainlayer.circleopeneclosebuttonclosed.CircleOpenCloseButton_Closed
import com.example.supercast.gui.components.global.mainlayer.circleactionbutton.CircleActionButton



private val picOpenAction = Pics.ArrowCompactDownGreyLight
private val picLink = Pics.LinkDark
private val picQr = Pics.QrCodeDark

private const val textActionText = "Обо мне"



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
                pic = picOpenAction,
                onPress = {setDescriptionOpened (true)}
            )

            Width (14)

        }

        else {

            CircleOpenCloseButton_Closed (
                onPress = {setDescriptionOpened (false)}
            )

            Space (Modifier.weight (1f))

        }

        CircleActionButton (
            pic = picLink,
            onPress = {}
        )

        Width (14)

        CircleActionButton (
            pic = picQr,
            onPress = {}
        )

    }

}