// Global components - Distinctive - Spaces

// These components are for layout creation proccess shortcutting

package com.example.supercast.ui.components.common.spaces

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.compose.foundation.layout.Spacer



@Composable
fun Space (
    modifier: Modifier
) {

    Spacer (
        modifier = modifier
    )

}



@Composable
fun Size (
    size: Int
) {

    Spacer (
        modifier = Modifier.size (size.dp)
    )

}



@Composable
fun Size (
    size: Double
) {

    Spacer (
        modifier = Modifier.size (size.dp)
    )

}



@Composable
fun Height (
    height: Double
) {

    Spacer (
        modifier = Modifier.height (height.dp)
    )

}



@Composable
fun Height (
    height: Int
) {

    Spacer (
        modifier = Modifier.height (height.dp)
    )

}



@Composable
fun Width (
    width: Int
) {

    Spacer (
        modifier = Modifier.width (width.dp)
    )

}



@Composable
fun Width (
    width: Double
) {

    Spacer (
        modifier = Modifier.width (width.dp)
    )

}