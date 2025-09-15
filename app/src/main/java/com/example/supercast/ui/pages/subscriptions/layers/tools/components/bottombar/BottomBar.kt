// Subscriptions page - Tools layer - Bottom bar

package com.example.supercast.ui.pages.subscriptions.layers.tools.components.bottombar

import androidx.compose.runtime.Composable

import com.example.supercast.ui.components.layers.toolslayer.bottombar.BottomBar as BottomBarComponet



private const val textDestination = "home"



@Composable
fun BottomBar () {

    BottomBarComponet (
        destination = textDestination
    )

}