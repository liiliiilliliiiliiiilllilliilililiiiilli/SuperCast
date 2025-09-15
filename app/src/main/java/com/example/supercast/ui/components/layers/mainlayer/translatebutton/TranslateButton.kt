// Global components - Main layer - Translate button

package com.example.supercast.ui.components.layers.mainlayer.translatebutton

import androidx.compose.foundation.clickable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.pics.Pics



private val picTranslate = Pics.TranslateGreenLight

private const val textPicTranslateDescription = "[translate pic]"



@Composable
fun TranslateButton (
    onPress: () -> Unit = {}
) {

    Image (
        painter = painterResource (picTranslate),
        contentDescription = textPicTranslateDescription,
        modifier = Modifier
            .size (32.dp)
            .clickable (onClick = onPress)
    )

}