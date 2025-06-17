// Global components - Main layer - Post

package com.example.supercast.gui.components.global.mainlayer.post

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.gui.components.global.mainlayer.post.infobar.InfoBar
import com.example.supercast.gui.components.global.mainlayer.post.mainblock.MainBlock
import com.example.supercast.gui.components.global.mainlayer.post.actionsbar.ActionsBar



@Composable
fun Post (
    data: String
) {

//    val info = data.info
//    val content = data.content
//    val segue = data.segue


    Column (
        modifier = Modifier
            .fillMaxWidth ()
//            .background (color = Colors.)
    ) {

        InfoBar (
//            data = {info}
        )

        MainBlock (
//            data = {content}
        )

        ActionsBar (
//            data = {segue}
        )

    }

}