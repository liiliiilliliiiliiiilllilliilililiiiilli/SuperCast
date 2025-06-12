// Common components - Top bar component

package com.example.supercast.gui.components.global.toolslayer

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.supercast.ui.Colors



@Composable
fun TopBar (
    someParams: String = "",
    content: @Composable () -> Unit = @Composable {Box {}}
) {

    Box (
        modifier = Modifier
            .fillMaxWidth ()
            .background (Colors.BarBackground)
            .statusBarsPadding ()
            .height (65.5.dp)
            .background (Colors.BarBorder)
            .padding (bottom = 2.dp)
            .background (Colors.BarBackground)
    ) {

        content ()

    }

}