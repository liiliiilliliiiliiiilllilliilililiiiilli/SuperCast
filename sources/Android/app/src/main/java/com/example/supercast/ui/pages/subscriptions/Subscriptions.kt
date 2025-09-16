// Subscriptions page

package com.example.supercast.ui.pages.subscriptions

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.subscriptions.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.subscriptions.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.subscriptions.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.subscriptions.layers.windows.Windows as WindowsLayer



@Composable
fun Subscriptions () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        MainLayer ()
        ToolsLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}