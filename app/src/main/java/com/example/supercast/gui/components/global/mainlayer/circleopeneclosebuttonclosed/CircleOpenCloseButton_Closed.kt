// Global components - Main layer - Closed circle open-close button

package com.example.supercast.gui.components.global.mainlayer.circleopeneclosebuttonclosed

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.pics.Pics



private val colorBack = Colors.CircleButton

private val picPlus = Pics.PlusSmoothDark

private const val textPicPlusDescription = "[button pic]"



@Composable
fun CircleOpenCloseButton_Closed (
    onPress: () -> Unit
) {

    Image (
        painter = painterResource (picPlus),
        contentDescription = textPicPlusDescription,
        modifier = Modifier
            .clickable (onClick = onPress)
            .clip (RoundedCornerShape (100))
            .background (colorBack)
            .padding (7.75.dp)
            .size (17.75.dp)
            .rotate (45f)
    )

}