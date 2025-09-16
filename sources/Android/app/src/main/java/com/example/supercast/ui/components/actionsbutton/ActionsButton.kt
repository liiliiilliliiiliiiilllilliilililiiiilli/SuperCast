// Global components - Actions button

package com.example.supercast.ui.components.actionsbutton

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
import com.example.supercast.lib.pics.Pics



private val colorBack = Colors.Button

private val picDots = Pics.DotsTwoGreyLight

private const val textPicDotsDescription = "[dots pic]"



@Composable
fun ActionsButton (
    onPress: () -> Unit,
    modifier: Modifier = Modifier
) {

    Image (
        painter = painterResource (picDots),
        contentDescription = textPicDotsDescription,
        modifier = Modifier
            .then (modifier)
            .clickable (onClick = {onPress ()})
            .clip (RoundedCornerShape (100))
            .background (colorBack)
            .padding (vertical = 10.dp, horizontal = 5.dp)
            .size (15.dp)
    )

}