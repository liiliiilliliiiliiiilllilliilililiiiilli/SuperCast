// Global components - Main layer - Translate button

package com.example.supercast.gui.components.global.mainlayer.translatebutton

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.pics.Pics



@Composable
fun TranslateButton (
    onPress: () -> Unit = {}
) {

    Image (
        painter = painterResource (Pics.TranslateGreen),
        contentDescription = "",
        modifier = Modifier.size (32.dp)
    )

}