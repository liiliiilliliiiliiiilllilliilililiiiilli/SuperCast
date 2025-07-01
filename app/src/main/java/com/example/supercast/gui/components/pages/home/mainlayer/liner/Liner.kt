// Main page - Main layer - Liner

package com.example.supercast.gui.components.pages.home.mainlayer.liner

import androidx.compose.runtime.Composable
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.global.mainlayer.liner.Liner as LinerComponent



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