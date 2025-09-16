// Subscribers page

package com.example.supercast.ui.pages.subscribers

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.subscribers.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.subscribers.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.subscribers.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.subscribers.layers.windows.Windows as WindowsLayer



@Composable
fun Subscribers () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        MainLayer ()
        ToolsLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}