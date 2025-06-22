// Home page - Tools layer - Bottom bar

package com.example.supercast.gui.components.pages.otheruser.toolslayer.bottombar

import androidx.compose.runtime.Composable

import com.example.supercast.gui.components.global.toolslayer.bottombar.BottomBar as BottomBarComponent



private const val destination = "home"



@Composable
fun BottomBar () {

    BottomBarComponent (
        destination = destination
    )

}