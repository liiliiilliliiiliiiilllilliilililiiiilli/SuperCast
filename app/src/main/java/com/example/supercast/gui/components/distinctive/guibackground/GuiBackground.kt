// Global components - Distinctive - Gui background   •   This is App's Gui's background, it's stretched with the color themes :]

package com.example.supercast.gui.components.distinctive.guibackground

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.supercast.ui.colors.Colors



private val colorBack = Colors.Black



@Composable
fun GuiBackground (
    content: @Composable () -> Unit = @Composable {Box {}}
) {

    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .background (color = colorBack)
            .fillMaxSize ()
    ) {

        content ()

    }

}