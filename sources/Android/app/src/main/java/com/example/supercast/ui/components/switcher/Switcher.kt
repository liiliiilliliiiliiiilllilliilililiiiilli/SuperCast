// Global components - Switcher

package com.example.supercast.ui.components.switcher

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts

import com.example.supercast.ui.components.spaces.Width



private val colorChosen = Colors.Olive
private val colorNotChosen = Colors.OliveMonochromic

private val fontSwitcher = Fonts.ArimoBold

private const val textDescription = "Описание"
private const val textAboutAuthor = "Об авторе"



@Composable
fun Switcher (
    switch_1: String,
    switch_2: String,
    chosenSwitch: String,
    setChosenSwitch: (String) -> Unit
) {

    val isChosenDescription = chosenSwitch == textDescription
    val isChosenAboutAuthor = (chosenSwitch == textAboutAuthor)

    val onPressDescription  = {setChosenSwitch (textDescription)}
    val onPressAboutAuthor = {setChosenSwitch (textAboutAuthor)}


    @Composable
    fun SwitchButton (
        text: String,
        isChosen: Boolean,
        onPress: () -> Unit
    ) {

        val color = if (isChosen) colorChosen else colorNotChosen


        Text (
            text = text,
            fontSize = 15.5.sp,
            color = color,
            fontFamily = fontSwitcher,
            modifier = Modifier
                .clickable (onClick = onPress)
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
            .height (50.dp)
            .fillMaxWidth ()
    ) {

        SwitchButton (
            text = switch_1,
            isChosen = isChosenDescription,
            onPress = onPressDescription
        )

        Width (10)

        SwitchButton (
            text = switch_2,
            isChosen = isChosenAboutAuthor,
            onPress = onPressAboutAuthor
        )

    }

}