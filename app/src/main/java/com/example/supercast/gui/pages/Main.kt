// Main page

package com.example.supercast.gui.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier

import com.example.supercast.gui.components.pages.main.toolslayer.TopBar
import com.example.supercast.gui.components.pages.main.mainlayer.Main
import com.example.supercast.gui.components.pages.main.toolslayer.BottomBar



@Composable
fun Main () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        ToolsLayer ()
        MainLayer ()
        SlidersLayer ()
        WindowsLayer ()

    }

}



//  Layers:



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
private fun MainLayer () {

    Main ()

}



@Composable
private fun SlidersLayer () {

    Box {}

}



@Composable
private fun WindowsLayer () {

    Box {}

}