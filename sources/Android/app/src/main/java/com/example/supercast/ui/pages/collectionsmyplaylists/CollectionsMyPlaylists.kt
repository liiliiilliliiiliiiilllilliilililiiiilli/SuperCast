// Collections page - My playlists page

package com.example.supercast.ui.pages.collectionsmyplaylists

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.collections.layers.main.Main as MainLayer
import com.example.supercast.ui.pages.collections.layers.tools.Tools as ToolsLayer
import com.example.supercast.ui.pages.collections.layers.sliders.Sliders as SlidersLayer
import com.example.supercast.ui.pages.collections.layers.windows.Windows as WindowsLayer



@Composable
fun CollectionsMyPlaylists () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        MainLayer ()
        ToolsLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}