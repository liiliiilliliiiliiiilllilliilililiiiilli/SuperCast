// Subscriptions page - Main layer - liner

package com.example.supercast.gui.components.pages.subscriptions.mainlayer.liner

import androidx.compose.runtime.Composable

import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.global.mainlayer.liner.Liner as LinerComponent



private val picFilter = Pics.FilterGreyLight
private val picSearch = Pics.SearchGrey

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