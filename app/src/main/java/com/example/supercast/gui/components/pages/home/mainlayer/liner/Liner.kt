// Main page - Main layer - Liner

package com.example.supercast.gui.components.pages.home.mainlayer.liner

import androidx.compose.runtime.Composable
import com.example.supercast.R

import com.example.supercast.gui.components.global.mainlayer.Liner as LinerComponent



@Composable
fun Liner () {

    val picRightOnPress = {}


    LinerComponent (
        text = "Все",
        buttPicRight = R.drawable.filter_light,
        picRightOnPress = {picRightOnPress ()}
    )

}