// Settings subscriptions folders folder page

package com.example.supercast.gui.pages.settingssubsfoldersfolder

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.gui.components.distinctive.spaces.Space
import com.example.supercast.gui.components.pages.settingssubsfoldersfolder.toolslayer.topbar.TopBar
import com.example.supercast.gui.components.pages.settingssubsfoldersfolder.mainlayer.MainLayer as MainLayerComponent



@Composable
fun SettingsSubsFoldersFolder () {

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