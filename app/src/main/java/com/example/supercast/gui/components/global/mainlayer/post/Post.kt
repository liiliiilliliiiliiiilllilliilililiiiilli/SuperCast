// Global components - Main layer - Post

package com.example.supercast.gui.components.global.mainlayer.post

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.scale
import androidx.compose.ui.Modifier

import com.example.supercast.gui.components.global.mainlayer.post.infobar.InfoBar
import com.example.supercast.gui.components.global.mainlayer.post.mainblock.MainBlock
import com.example.supercast.gui.components.global.mainlayer.post.seguebar.SegueBar

import com.example.supercast.gui.components.global.mainlayer.post._types_.Post



@Composable
fun Post (
    data: Post,
    isInner: Boolean = false,
    modifier: Modifier = Modifier
) {

    val scale = if (isInner) 0.915f else 1f

    val infoBar = data.infoBar
    val mainBlock = data.mainBlock
    val segueBar = data.segueBar


    Column (
        modifier = Modifier
            .then (modifier)
            .fillMaxWidth ()
            .scale (scale)
    ) {

        InfoBar (
            data = infoBar
        )

        MainBlock (
            data = mainBlock
        )

        SegueBar (
            data = segueBar
        )

    }

}