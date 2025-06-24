// Global components - Main layer - Actions button

package com.example.supercast.gui.components.global.mainlayer.actionsbutton

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
import com.example.supercast.ui.pics.Pics



private val colorBack = Colors.Button
private val picDots = Pics.DotsDoubleGreyLight
private const val textPicDotsDescription = "[dots pic]"



@Composable
fun ActionsButton (
    onPress: () -> Unit,
    modifier: Modifier = Modifier
) {

    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .then (modifier)
            .clip (RoundedCornerShape (100))
            .size (25.dp, 35.dp)
            .background (colorBack)
            .clickable (onClick = onPress)
    ) {

        Image (
            painter = painterResource (picDots),
            contentDescription = textPicDotsDescription,
            modifier = Modifier.size (15.dp)
        )

    }

}