// Collections page - My listening history page - Tools layer - Bottom bar

package com.example.supercast.ui.pages.collectionsmyhistory.layers.tools.components.bottombar

import androidx.compose.runtime.Composable

import com.example.supercast.ui.components.bottombar.BottomBar as BottomBarComponent



private const val textDestination = "collections"



@Composable
fun BottomBar () {

    BottomBarComponent (
        destination = textDestination
    )

}