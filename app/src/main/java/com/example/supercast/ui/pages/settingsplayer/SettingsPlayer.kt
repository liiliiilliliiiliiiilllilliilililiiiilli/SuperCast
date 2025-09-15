// Settings page - Player page

package com.example.supercast.ui.pages.settingsplayer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.settingsplayer.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.settingsplayer.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.settingsplayer.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.settingsplayer.layers.windows.Windows as WindowsLayer



@Composable
fun SettingsPlayer () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        MainLayer ()
        ToolsLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}