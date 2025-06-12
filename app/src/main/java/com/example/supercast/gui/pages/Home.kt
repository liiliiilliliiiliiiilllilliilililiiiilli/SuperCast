// Home page

package com.example.supercast.gui.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.gui.components.pages.home.toolslayer.TopBar
import com.example.supercast.gui.components.pages.home.mainlayer.Main
import com.example.supercast.gui.components.pages.home.toolslayer.BottomBar



@Composable
fun Home () {

    Box (
        modifier = Modifier
            .fillMaxSize ()
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
        modifier = Modifier.fillMaxSize (),
        verticalArrangement = Arrangement.SpaceBetween
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