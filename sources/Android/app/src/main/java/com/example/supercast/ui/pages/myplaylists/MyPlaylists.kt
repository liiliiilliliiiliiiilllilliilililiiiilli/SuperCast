// My playlists page

package com.example.supercast.ui.pages.myplaylists

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.myplaylists.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.myplaylists.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.myplaylists.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.myplaylists.layers.windows.Windows as WindowsLayer



@Composable
fun MyPlaylists () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        MainLayer ()
        ToolsLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}