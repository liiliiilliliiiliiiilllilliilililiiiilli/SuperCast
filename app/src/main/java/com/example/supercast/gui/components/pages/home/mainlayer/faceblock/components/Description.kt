package com.example.supercast.gui.components.pages.home.mainlayer.faceblock.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.supercast.ui.Colors

import com.example.supercast.gui.components.global.mainlayer.Switcher



private const val switch_1 = "Описание"
private const val switch_2 = "Об авторе"
private const val chosenSwitch = "Описание"

private val colorDescriptionBack = Colors.Blocks



@Composable
fun Description () {

    Column (
        modifier = Modifier.fillMaxWidth ()
    ) {

        Switcher (
            switch_1 = switch_1,
            switch_2 = switch_2,
            chosenSwitch = chosenSwitch
        )

        Box (
            modifier = Modifier
                .clip (RoundedCornerShape (14.dp))
                .background (color = colorDescriptionBack)
                .height (100.dp)
                .fillMaxWidth ()
        )

        Spacer (
            modifier = Modifier.height (24.dp)
        )

    }

}