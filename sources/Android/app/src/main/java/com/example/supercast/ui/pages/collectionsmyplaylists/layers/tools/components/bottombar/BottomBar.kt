// Collections page - My playlists page - Tools layer - Bottom bar

package com.example.supercast.ui.pages.collectionsmyplaylists.layers.tools.components.bottombar

import androidx.compose.runtime.Composable

import com.example.supercast.ui.components.bottombar.BottomBar as BottomBarComponent



private const val textDestination = "collections"



@Composable
fun BottomBar () {

    BottomBarComponent (
        destination = textDestination
    )

}