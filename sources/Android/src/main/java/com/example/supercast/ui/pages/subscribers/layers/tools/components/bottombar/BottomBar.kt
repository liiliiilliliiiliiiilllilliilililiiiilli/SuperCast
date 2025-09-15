// Subscribers page - Tools layer - Bottom bar

package com.example.supercast.ui.pages.subscribers.layers.tools.components.bottombar

import androidx.compose.runtime.Composable

import com.example.supercast.ui.components.layers.toolslayer.bottombar.BottomBar as BottomBarComponent



private const val textDestination = "home"



@Composable
fun BottomBar () {

    BottomBarComponent (
        destination = textDestination
    )

}