// Subscriptions page - Main layer - liner

package com.example.supercast.gui.components.pages.subscrptions.mainlayer.liner

import androidx.compose.runtime.Composable
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.global.mainlayer.liner.Liner as LinerComponent



private val picFilter = Pics.FilterGreyLight
private val picSearch = Pics.SearchGrey

private const val textButtonList = "5 слушателей"



@Composable
fun Liner (
    isWrapped: Boolean = true
) {

    val picRightOnPress = {}


    LinerComponent (
        text = textButtonList,
        isWrapped = isWrapped,
        buttonPicRight = arrayOf (picSearch, picFilter),
        picRightOnPress = picRightOnPress
    )

}