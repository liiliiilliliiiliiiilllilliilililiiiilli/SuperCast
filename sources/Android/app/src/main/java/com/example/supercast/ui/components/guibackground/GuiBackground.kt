// Global components - Ui background

// This is App's Ui's background. It is stretched with the color themes

package com.example.supercast.ui.components.uibackground

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import com.example.supercast.lib.colors.Colors



private val colorBack = Colors.Black



@Composable
fun UiBackground (
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