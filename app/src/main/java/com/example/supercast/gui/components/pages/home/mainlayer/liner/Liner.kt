// Main page - Main layer - Liner

package com.example.supercast.gui.components.pages.home.mainlayer.liner

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.supercast.ui.Colors



@Composable
fun Liner () {

    Box (
        modifier = Modifier
            .size (25.dp)
            .background (color = Colors.Sun)
    )

}