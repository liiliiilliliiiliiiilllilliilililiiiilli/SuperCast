// Global components - Distinctive - Gui background

// This is App's Gui's background, it's stretched with the color themes

package com.example.supercast.ui.components.common.guibackground

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import com.example.supercast.lib.colors.Colors



private val colorBack = Colors.Black



@Composable
fun GuiBackground (
    content: @Composable () -> Unit = @Composable {Box {}}
) {

    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .background (colorBack)
            .fillMaxSize ()
    ) {

        content ()

    }

}