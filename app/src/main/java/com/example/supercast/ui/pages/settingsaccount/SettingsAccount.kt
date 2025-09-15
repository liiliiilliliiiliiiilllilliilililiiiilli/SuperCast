// Settings page - Account page

package com.example.supercast.ui.pages.settingsaccount

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.settingsaccount.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.settingsaccount.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.settingsaccount.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.settingsaccount.layers.windows.Windows as WindowsLayer



@Composable
fun SettingsAccount () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        MainLayer ()
        ToolsLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}