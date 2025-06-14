package com.example.supercast.gui.components.global.mainlayer

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.ui.Colors
import com.example.supercast.R



private const val textDescription = "Описание"
private const val textAboutAuthor = "Об авторе"

private val textFont = FontFamily (Font (R.font.arimo_bold))
private val colorChosen = Colors.Olive
private val colorNotChosen = Colors.OliveMonochromic



@Composable
fun Switcher (
    switch_1: String,
    switch_2: String,
    chosenSwitch: String
) {

    var chosenSwitch by remember {mutableStateOf (chosenSwitch)}


    @Composable
    fun SwitchButton (
        text: String,
        isChosen: Boolean,
        onPress: () -> Unit?
    ) {

        Text (
            text = text,
            fontSize = 15.5.sp,
            fontFamily = textFont,
            color = if (isChosen) colorChosen else colorNotChosen,
            modifier = Modifier
                .clickable (onClick = {onPress ()})
                .padding (horizontal = 8.dp)
                .drawBehind {
                    if (isChosen) drawLine (
                        color = colorChosen,
                        strokeWidth = 2.5.dp.toPx(),
                        start = Offset (0f, size.height + 3.5.sp.toPx()),
                        end = Offset (size.width, size.height + 3.5.sp.toPx())
                    )
                }
        )

    }


    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth ()
            .height (50.dp)
    ) {

        SwitchButton (
            text = switch_1,
            isChosen = (chosenSwitch == textDescription),
            onPress = {chosenSwitch = textDescription}
        )

        Spacer (
            modifier = Modifier.width (10.dp)
        )

        SwitchButton (
            text = switch_2,
            isChosen = (chosenSwitch == textAboutAuthor),
            onPress = {chosenSwitch = textAboutAuthor}
        )

    }

}