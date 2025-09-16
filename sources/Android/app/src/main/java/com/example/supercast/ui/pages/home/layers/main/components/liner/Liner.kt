// Home page - Main layer - Liner

package com.example.supercast.ui.pages.home.layers.main.components.liner

import androidx.compose.runtime.Composable

import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.liner.Liner as LinerComponent



private val picButtonRight = Pics.FilterGreyLight

private const val textButtonList = "Все"



@Composable
fun Liner () {

    val picRightOnPress = {}


    LinerComponent (
        textWrap = textButtonList,
        buttonPicRight = arrayOf (picButtonRight),
        buttonPicRightOnPress = picRightOnPress
    )

}