// Main page - Main layer - Liner

package com.example.supercast.gui.components.pages.otheruser.mainlayer.liner

import androidx.compose.runtime.Composable
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.global.mainlayer.liner.Liner as LinerComponent



private const val textButtonList = "Все"
private val picButtonRight = Pics.FilterGreyLight



@Composable
fun Liner () {

    val picRightOnPress = {}


    LinerComponent (
        text = textButtonList,
        buttPicRight = arrayOf (picButtonRight),
        picRightOnPress = picRightOnPress
    )

}