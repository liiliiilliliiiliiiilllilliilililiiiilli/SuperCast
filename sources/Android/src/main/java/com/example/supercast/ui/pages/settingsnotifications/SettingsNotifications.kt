// Settings page - Notifications page

package com.example.supercast.ui.pages.settingsnotifications

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.settingsnotifications.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.settingsnotifications.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.settingsnotifications.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.settingsnotifications.layers.windows.Windows as WindowsLayer



@Composable
fun SettingsNotifications () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        MainLayer ()
        ToolsLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}