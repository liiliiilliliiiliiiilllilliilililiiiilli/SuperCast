// Main page

package com.example.supercast.gui.pages.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier

import com.example.supercast.gui.components.pages.main.toolslayer.topbar.TopBar
import com.example.supercast.gui.components.pages.main.toolslayer.bottombar.BottomBar
import com.example.supercast.gui.components.pages.main.mainlayer.MainLayer as MainLayerComponent



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



//  Layers:



@Composable
private fun MainLayer () {

    MainLayerComponent ()

}



@Composable
private fun ToolsLayer () {

    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxSize ()
    ) {

        TopBar ()
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