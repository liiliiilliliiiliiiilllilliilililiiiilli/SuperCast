// My history page

package com.example.supercast.ui.pages.myhistory

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.myhistory.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.myhistory.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.myhistory.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.myhistory.layers.windows.Windows as WindowsLayer



@Composable
fun MyHistory () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        MainLayer ()
        ToolsLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}