// Settings page

package com.example.supercast.ui.pages.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.settings.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.settings.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.settings.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.settings.layers.windows.Windows as WindowsLayer



@Composable
fun Settings () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        MainLayer ()
        ToolsLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}