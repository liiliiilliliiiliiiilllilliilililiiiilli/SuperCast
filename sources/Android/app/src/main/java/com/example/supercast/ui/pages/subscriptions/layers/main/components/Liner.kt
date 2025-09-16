// Subscriptions page - Main layer - liner

package com.example.supercast.ui.pages.subscriptions.layers.main.components.liner

import androidx.compose.runtime.Composable

import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.liner.Liner as LinerComponent



private val picSearch = Pics.SearchGrey
private val picFilter = Pics.FilterGreyLight

private const val textButtonList = "5 авторов"



@Composable
fun Liner () {

    val picRightOnPress = {}


    LinerComponent (
        text = textButtonList,
        buttonPicRight = arrayOf (picSearch, picFilter),
        buttonPicRightOnPress = picRightOnPress
    )

}