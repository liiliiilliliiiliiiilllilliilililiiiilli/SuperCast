// Home page - Main layer - Ties provider - Settings

package com.example.supercast.ui.pages.home.layers.main.components.tiesprovider.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.layers.mainlayer.actiontext.ActionText



private val picSettings = Pics.SettingsWheelLight

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