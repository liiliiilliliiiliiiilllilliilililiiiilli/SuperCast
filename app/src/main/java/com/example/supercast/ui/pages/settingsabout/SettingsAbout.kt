// Settings page - About page

package com.example.supercast.ui.pages.settingsabout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.settingsabout.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.settingsabout.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.settingsabout.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.settingsabout.layers.windows.Windows as WindowsLayer



@Composable
fun SettingsAbout () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        MainLayer ()
        ToolsLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}