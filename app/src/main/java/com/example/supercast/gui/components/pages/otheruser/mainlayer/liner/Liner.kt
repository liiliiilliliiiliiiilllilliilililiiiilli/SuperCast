// Other user page - Main layer - Liner

package com.example.supercast.gui.components.pages.otheruser.mainlayer.liner

import androidx.compose.runtime.Composable

import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.global.mainlayer.liner.Liner as LinerComponent



private val picButtonPicRight = Pics.FilterGreyLight

private const val textButtonList = "Все"



@Composable
fun Liner () {

    val picRightOnPress = {}


    LinerComponent (
        text = textButtonList,
        buttonPicRight = arrayOf (picButtonPicRight),
        picRightOnPress = picRightOnPress
    )

}