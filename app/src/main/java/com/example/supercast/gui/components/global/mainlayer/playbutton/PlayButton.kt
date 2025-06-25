// Global components - Main layer - Play button

package com.example.supercast.gui.components.global.mainlayer.playbutton

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.pics.Pics



private val colorBack = Colors.Olive

private val picTriangleLight = Pics.PlayTriangleLight
private val picTriangleDark = Pics.PlayTriangleDark

private const val textPicTriangleDescription = "[triangle pic]"



@Composable
fun PlayButton (
    scale: Float = 1f,
    isLight: Boolean = false,
    pic: Int? = null,
    onPress: () -> Unit = {}
) {

    val picTriangle = if (isLight) picTriangleLight else picTriangleDark

    val modifier =

        if (pic != null)

            Modifier
                .paint (
                    painterResource (pic),
                    contentScale = ContentScale.FillBounds
                )
                .background (color = Color (0x88000000))

        else

            Modifier


    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clickable (onClick = {onPress()})
            .clip (RoundedCornerShape (100))
            .size ((37 * scale).dp)
            .background (color = colorBack)
            .then (modifier)

    ) {

        Image (
            painter = painterResource (picTriangle),
            contentDescription = textPicTriangleDescription,
            modifier = Modifier
                .size (19.dp)
                .padding (start = 2.25.dp)
        )

    }

}