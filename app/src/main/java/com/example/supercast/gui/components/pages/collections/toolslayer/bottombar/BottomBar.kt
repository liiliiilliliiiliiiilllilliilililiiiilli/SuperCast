// Collections page - Tools layer - Bottom bar

package com.example.supercast.gui.components.pages.collections.toolslayer.bottombar

import androidx.compose.runtime.Composable

import com.example.supercast.gui.components.global.toolslayer.bottombar.BottomBar as BottomBarComponent



private const val textDestination = "collections"



@Composable
fun BottomBar () {

    BottomBarComponent (
        destination = textDestination
    )

}