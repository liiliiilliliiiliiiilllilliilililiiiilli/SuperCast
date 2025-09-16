// Settings page - Subscriptions folder page

package com.example.supercast.ui.pages.settingsfoldersfolder

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.settingsfoldersfolder.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.settingsfoldersfolder.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.settingsfoldersfolder.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.settingsfoldersfolder.layers.windows.Windows as WindowsLayer



@Composable
fun SettingsFoldersFolder () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        MainLayer ()
        ToolsLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}