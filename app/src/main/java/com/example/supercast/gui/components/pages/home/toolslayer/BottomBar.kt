// Home page - Bottom bar component

package com.example.supercast.gui.components.pages.home.toolslayer

import androidx.compose.runtime.Composable

import com.example.supercast.gui.components.global.toolslayer.BottomBar as BottomBarComponent



private const val destination = "home"



@Composable
fun BottomBar () {

    BottomBarComponent (
        destination = destination
    )

}