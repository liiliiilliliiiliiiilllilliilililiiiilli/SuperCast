// Global components - Main layer - Play button

package com.example.supercast.gui.components.global.mainlayer.playbutton

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
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
private val colorShadow = Color (0x88000000)

private val picTriangleLight = Pics.TrianglePlayLight
private val picTriangleDark = Pics.TrianglePlayDark

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
                .background (colorShadow)

        else

            Modifier


    Image (
        painter = painterResource (picTriangle),
        contentDescription = textPicTriangleDescription,
        modifier = Modifier
            .clickable (onClick = {onPress ()})
            .clip (RoundedCornerShape (100))
            .background (colorBack) .then (modifier)
            .padding (((37 * scale - 19)/2).dp)
            .size (19.dp)
            .padding (start = 2.25.dp)
    )

}