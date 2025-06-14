// App's main background component

package com.example.supercast.gui.components.distinctive

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.supercast.ui.Colors



private val colorBack = Colors.Black



@Composable
fun AppBackground (
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