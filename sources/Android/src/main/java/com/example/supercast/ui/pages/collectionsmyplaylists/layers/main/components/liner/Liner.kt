// Collections page - My playlists page - Main layer - Liner

package com.example.supercast.ui.pages.collectionsmyplaylists.layers.main.components.liner

import androidx.compose.runtime.Composable

import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.layers.mainlayer.liner.Liner as LinerComponent



private val picFilter = Pics.FilterGreyLight

private const val textTotal = "всего"



@Composable
fun Liner (
    num: Int,
) {

    val text = "$num $textTotal"


    LinerComponent (
        text = text,
        buttonPicRight = arrayOf (picFilter),
        buttonPicRightOnPress = {}
    )

}