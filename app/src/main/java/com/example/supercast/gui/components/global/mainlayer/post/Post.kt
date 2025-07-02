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
    isInner: Boolean = false
) {

    val scale = if (isInner) 0.915f else 1f


    Column (
        modifier = Modifier
            .fillMaxWidth ()
            .scale (scale)
    ) {

        InfoBar (
            left = data.infoBar.left,
            right = data.infoBar.right
        )

        MainBlock (
            topBar = data.mainblock.topBar,
            contextPlot = data.mainblock.contextPlot,
            audioPlot = data.mainblock.audioPlot,
            isPostInner = data.mainblock.isPostInner
        )

        SegueBar (
            comments = data.segueBar.comments,
            citates = data.segueBar.citates
        )

    }

}