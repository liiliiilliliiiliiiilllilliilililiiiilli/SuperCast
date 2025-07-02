// Collections page - My comments page - Main layer - Liner

package com.example.supercast.gui.components.pages.collectionsmycomments.mainlayer.liner

import androidx.compose.runtime.Composable

import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.global.mainlayer.liner.Liner as LinerComponent



private val picFilter = Pics.FilterGreyLight

private const val textTotal = "всего"



@Composable
fun Liner (
    num: Int
) {

    val text = "$num $textTotal"


    LinerComponent (
        text = text,
        buttonPicRight = arrayOf (picFilter),
        buttonPicRightOnPress = {}
    )

}