// Settings page - Download page

package com.example.supercast.ui.pages.settingsdownload

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.settingsdownload.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.settingsdownload.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.settingsdownload.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.settingsdownload.layers.windows.Windows as WindowsLayer



@Composable
fun SettingsDownload () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        MainLayer ()
        ToolsLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}