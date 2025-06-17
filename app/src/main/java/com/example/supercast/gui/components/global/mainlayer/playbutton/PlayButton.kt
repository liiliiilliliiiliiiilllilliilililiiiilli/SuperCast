// Global components - Main layer - Play button

package com.example.supercast.gui.components.global.mainlayer.playbutton

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.pics.Pics



private val colorBack = Colors.Olive
private val picTriangle = Pics.PlayDark

private const val picDescription = "[triangle image]"



@Composable
fun PlayButton (
    scale: Float
) {

    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .scale (scale)
            .clip (RoundedCornerShape (100))
            .size (37.dp)
            .background (color = colorBack)
    ) {

        Image (
            painter = painterResource (picTriangle),
            contentDescription = picDescription,
            modifier = Modifier
                .size (17.75.dp)
                .padding (start = 2.25.dp)
        )

    }

}