// Settings page - Recommendation system page

package com.example.supercast.ui.pages.settingsrecssystem

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.settingsrecssystem.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.settingsrecssystem.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.settingsrecssystem.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.settingsrecssystem.layers.windows.Windows as WindowsLayer



@Composable
fun SettingsRecsSystem () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        MainLayer ()
        ToolsLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}