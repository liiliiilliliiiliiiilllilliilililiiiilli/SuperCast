// Global components - Distinctive - Spaces   •   This is for code shortcutting :]

package com.example.supercast.gui.components.distinctive.spaces

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp



@Composable
fun Space (
    modifier: Modifier
) {

    Spacer (
        modifier = modifier
    )

}



@Composable
fun Height (
    height: Dp
) {

    Spacer (
        modifier = Modifier.height (height)
    )

}



@Composable
fun Width (
    width: Dp
) {

    Spacer (
        modifier = Modifier.width (width)
    )

}



@Composable
fun Size (
    size: Dp
) {

    Spacer (
        modifier = Modifier.size (size)
    )

}