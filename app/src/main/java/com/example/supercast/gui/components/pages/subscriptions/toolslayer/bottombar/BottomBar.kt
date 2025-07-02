// Subscriptions page - Tools layer - Bottom bar

package com.example.supercast.gui.components.pages.subscriptions.toolslayer.bottombar

import androidx.compose.runtime.Composable

import com.example.supercast.gui.components.global.toolslayer.bottombar.BottomBar as BottomBarComponet



private const val textDestination = "home"



@Composable
fun BottomBar () {

    BottomBarComponet (
        destination = textDestination
    )

}