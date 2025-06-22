// My playlists page - Main layer - Liner

package com.example.supercast.gui.components.pages.myplaylists.mainlayer.liner

import androidx.compose.runtime.Composable
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.global.mainlayer.liner.Liner as LinerComponent



private const val textTotal = "всего"

private val picFilter = Pics.FilterLight



@Composable
fun Liner (
    num: Int,
) {

    val text = "$num $textTotal"


    LinerComponent (
        text = text,
        isWrapped = false,
        buttPicRight = arrayOf (picFilter),
        picRightOnPress = {}
    )

}