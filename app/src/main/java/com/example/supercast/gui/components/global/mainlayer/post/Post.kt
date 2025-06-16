// Global components - Main layer - Post

package com.example.supercast.gui.components.global.mainlayer.post

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable

import com.example.supercast.gui.components.global.mainlayer.post.infobar.InfoBar
import com.example.supercast.gui.components.global.mainlayer.post.mainblock.MainBlock
import com.example.supercast.gui.components.global.mainlayer.post.actionsbar.ActionsBar



@Composable
fun Post (
//    data: String
) {

//    val info = data.info
//    val content = data.content
//    val segue = data.segue


    Box () {

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