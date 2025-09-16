// Settings page - Subscriptions folders page

package com.example.supercast.ui.pages.settingsfolders

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.settingsfolders.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.settingsfolders.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.settingsfolders.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.settingsfolders.layers.windows.Windows as WindowsLayer



@Composable
fun SettingsFolders () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        MainLayer ()
        ToolsLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}