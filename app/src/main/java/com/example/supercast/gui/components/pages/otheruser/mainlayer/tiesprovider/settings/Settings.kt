// Other user page - Main layer - Ties provider - Settings

package com.example.supercast.gui.components.pages.otheruser.mainlayer.tiesprovider.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.global.mainlayer.actiontext.ActionText



private val picSettings = Pics.SettingsAdjustmentsGrey

private const val textSettings = "Настроить"



@Composable
fun Settings (
    onPress: () -> Unit = {}
) {

    Box (
        contentAlignment = Alignment.CenterEnd,
        modifier = Modifier
            .fillMaxWidth ()
            .padding (end = 24.dp)
    ) {

        ActionText (
            text = textSettings,
            pic = picSettings,
            onPress = onPress
        )

    }

}