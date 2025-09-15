// Main page

package com.example.supercast.ui.pages.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


import com.example.supercast.ui.pages.main.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.main.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.main.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.main.layers.windows.Windows as WindowsLayer



@Composable
fun Main () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        MainLayer ()
        ToolsLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}