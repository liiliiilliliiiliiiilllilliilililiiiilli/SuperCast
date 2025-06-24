// Global components - Main layer - Circle action button

package com.example.supercast.gui.components.global.mainlayer.circleactionbutton

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.supercast.ui.colors.Colors



private val colorBack = Colors.Olive
private const val textPicCircleActionButtonDescription = "[button pic]"



@Composable
fun CircleActionButton (
    pic: Int,
    onPress: () -> Unit
) {

    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clickable (onClick = onPress)
            .clip (RoundedCornerShape (100))
            .background (color = colorBack)
            .size (33.dp)
    ) {

        Image (
            painter = painterResource (pic),
            contentDescription = textPicCircleActionButtonDescription,
            modifier = Modifier.size (17.75.dp)
        )

    }

}