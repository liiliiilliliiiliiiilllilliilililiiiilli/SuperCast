// Subscribers page - Main layer - Liner

package com.example.supercast.gui.components.pages.subscribers.mainlayer.liner

import androidx.compose.runtime.Composable

import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.global.mainlayer.liner.Liner as LinerComponent



private val picSearch = Pics.SearchGrey
private val picFilter = Pics.FilterGreyLight

private const val textButtonList = "5 слушателей"



@Composable
fun Liner () {

    val picRightOnPress = {}


    LinerComponent (
        text = textButtonList,
        buttonPicRight = arrayOf (picSearch, picFilter),
        buttonPicRightOnPress = picRightOnPress
    )

}