// Collections page - My playlists page

package com.example.supercast.gui.pages.myplaylists

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.gui.components.distinctive.spaces.Space
import com.example.supercast.gui.components.pages.collectionsmyplaylists.toolslayer.topbar.TopBar
import com.example.supercast.gui.components.pages.collectionsmyplaylists.toolslayer.bottombar.BottomBar
import com.example.supercast.gui.components.pages.collectionsmyplaylists.mainlayer.MainLayer as MainLayerComponent



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



//  Layers:



@Composable
private fun MainLayer () {

    MainLayerComponent ()

}



@Composable
private fun ToolsLayer () {

    Column (
        modifier = Modifier.fillMaxSize ()
    ) {

        TopBar ()

        Space (modifier = Modifier.weight (1f))

        BottomBar ()

    }

}



@Composable
private fun SlidersLayer () {

    Box {}

}



@Composable
private fun WindowsLayer () {

    Box {}

}