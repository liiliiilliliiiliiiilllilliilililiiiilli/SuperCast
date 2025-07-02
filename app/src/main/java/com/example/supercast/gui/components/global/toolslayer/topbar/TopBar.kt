// Global components - Tools layer - Top bar

package com.example.supercast.gui.components.global.toolslayer.topbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.colors.Colors



private val colorBack = Colors.BarBackground
private val colorCorner = Colors.BarBorder



@Composable
fun TopBar (
    content: @Composable () -> Unit = @Composable {Box {}}
) {

    Box (
        modifier = Modifier
            .fillMaxWidth ()
            .background (colorBack)
            .statusBarsPadding ()
            .height (65.5.dp)
            .background (colorCorner)
            .padding (bottom = 2.dp)
            .background (colorBack)
    ) {

        content ()

    }

}