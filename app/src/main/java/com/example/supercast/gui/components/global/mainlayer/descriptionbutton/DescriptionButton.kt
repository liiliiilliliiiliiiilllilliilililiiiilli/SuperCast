// Global components - Main layer - DescriptionButton

package com.example.supercast.gui.components.global.mainlayer.descriptionbutton

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.pics.Pics



private val colorOpened = Colors.CircleButton
private val colorClosed = Colors.Button

private val picOpened = Pics.PlusSmoothDark
private val picClosed = Pics.ArrowCompactDownGreyLight

private const val textPicDescriptionButtonDescription = "[wrapper pic]"



@Composable
fun DescriptionButton (
    isOpened: Boolean,
    setIsOpened: (Boolean) -> Unit
) {

    val colorBack = if (isOpened) colorOpened else colorClosed
    val pic = if (isOpened) picOpened else picClosed

    val toggleIsOpened = {setIsOpened (!isOpened)}

    val picModifier =

        if (isOpened)

            Modifier
                .size (17.75.dp)
                .rotate (45f)

        else

            Modifier
                .size (14.dp)
                .offset (y = 1.25.dp)


    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clickable (onClick = toggleIsOpened)
            .clip (RoundedCornerShape (100))
            .background (color = colorBack)
            .size (33.dp)
    ) {

        Image (
            painter = painterResource (pic),
            contentDescription = textPicDescriptionButtonDescription,
            modifier = picModifier
        )

    }

}