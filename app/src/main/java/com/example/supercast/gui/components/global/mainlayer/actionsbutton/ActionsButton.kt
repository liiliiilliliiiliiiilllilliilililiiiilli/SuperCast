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
import com.example.supercast.R
import com.example.supercast.ui.colors.Colors



@Composable
fun ActionsButton (
    onPress: () -> Unit
) {

    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip (RoundedCornerShape (100.dp))
            .size (25.dp, 35.dp)
            .background (Colors.Button)
            .clickable (onClick = {onPress ()})
    ) {

        Image (
            painter = painterResource (R.drawable.actions_dots_light),
            contentDescription = "",
            modifier = Modifier.size (15.dp)
        )

    }

}