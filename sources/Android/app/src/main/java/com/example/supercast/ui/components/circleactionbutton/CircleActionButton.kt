// Global components - Circle action button

package com.example.supercast.ui.components.circleactionbutton

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.colors.Colors



private val colorBack = Colors.Olive

private const val textPicCircleActionButtonDescription = "[button pic]"



@Composable
fun CircleActionButton (
    pic: Int,
    onPress: () -> Unit
) {

    Image (
        painter = painterResource (pic),
        contentDescription = textPicCircleActionButtonDescription,
        modifier = Modifier
            .clickable (onClick = onPress)
            .clip (RoundedCornerShape (100))
            .background (colorBack)
            .padding (7.625.dp)
            .size (17.75.dp)
    )

}