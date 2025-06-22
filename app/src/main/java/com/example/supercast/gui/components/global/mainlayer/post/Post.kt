// Global components - Main layer - Post

package com.example.supercast.gui.components.global.mainlayer.post

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import kotlin.Int
import kotlin.String

import com.example.supercast.gui.components.global.mainlayer.post.infobar.InfoBar
import com.example.supercast.gui.components.global.mainlayer.post.mainblock.MainBlock
import com.example.supercast.gui.components.global.mainlayer.post.seguebar.SegueBar



@Composable
fun Post (
    InfoBar_left: String,
    InfoBar_right: String,
    MainBlock_Top_picAva: Int,
    MainBlock_Top_textDitleName: String,
    MainBlock_Top_textDitleTie: String,
    MainBlock_Top_numStars: Int,
    MainBlock_ContextPlot_orationData: Array <String>,
    MainBlock_ContextPlot_attachmentData: Array <String>,
    MainBlock_ContextPlot_isAttachmentOpened: Boolean,
    MainBlock_ContextPlot_textPublicationFromWho: String,
    MainBlock_ContextPlot_picsMedia: Array <Int>,
    MainBlock_AudioPlot_data: Array <String>,
    SegueBar_comments: Int,
    SegueBar_citates: Int,

    isInner: Boolean = false
) {

    Column (
        modifier = Modifier
            .fillMaxWidth ()
            .scale (if (isInner) 0.915f else 1f)
    ) {

        InfoBar (
            left = InfoBar_left,
            right = InfoBar_right
        )

        MainBlock (
            Top_picAva = MainBlock_Top_picAva,
            Top_textDitleName = MainBlock_Top_textDitleName,
            Top_textDitleTie = MainBlock_Top_textDitleTie,
            Top_numStars = MainBlock_Top_numStars,
            ContextPlot_orationData = MainBlock_ContextPlot_orationData,
            ContextPlot_attachmentData = MainBlock_ContextPlot_attachmentData,
            ContextPlot_isAttachmentOpenedState = MainBlock_ContextPlot_isAttachmentOpened,
            ContextPlot_textPublicationFromWho = MainBlock_ContextPlot_textPublicationFromWho,
            ContextPlot_picsMedia = MainBlock_ContextPlot_picsMedia,
            AudioPlot_data = MainBlock_AudioPlot_data,
            isPostInner = isInner
        )

        SegueBar (
            comments = SegueBar_comments,
            citates = SegueBar_citates
        )

    }

}