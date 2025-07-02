// Subscribers page

package com.example.supercast.gui.pages.subscribers

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.gui.components.distinctive.spaces.Space

import com.example.supercast.gui.components.pages.subscribers.toolslayer.topbar.TopBar
import com.example.supercast.gui.components.pages.subscribers.mainlayer.MainLayer as MainLayerComponent
import com.example.supercast.gui.components.pages.subscribers.toolslayer.bottombar.BottomBar



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