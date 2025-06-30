// Other user page - Main layer - Face block - Buttons

package com.example.supercast.gui.components.pages.otheruser.mainlayer.faceblock.buttons

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Space
import com.example.supercast.gui.components.global.mainlayer.actionsbutton.ActionsButton
import com.example.supercast.gui.components.global.mainlayer.actiontext.ActionText
import com.example.supercast.gui.components.global.mainlayer.circleopeneclosebuttonclosed.CircleOpenCloseButton_Closed



private val picArrow = Pics.ArrowCompactDownGreyLight

private const val textActionText = "Об авторе"



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
                pic = picArrow,
                onPress = {setDescriptionOpened (true)}
            )

            Space (Modifier.weight (1f))

        }

        else {

            CircleOpenCloseButton_Closed (
                onPress = {setDescriptionOpened (false)}
            )

            Space (Modifier.weight (1f))

        }

        ActionsButton (
            onPress = {},
            modifier = Modifier.rotate (90f)
        )

    }

}