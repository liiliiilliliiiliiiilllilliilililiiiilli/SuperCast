// Collections page - My comments page

package com.example.supercast.gui.pages.mycomments

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.gui.components.distinctive.spaces.Space

import com.example.supercast.gui.components.pages.collectionsmycomments.toolslayer.topbar.TopBar
import com.example.supercast.gui.components.pages.collectionsmycomments.mainlayer.MainLayer as MainLayerComponent
import com.example.supercast.gui.components.pages.collectionsmycomments.toolslayer.bottombar.BottomBar



@Composable
fun MyComments () {

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