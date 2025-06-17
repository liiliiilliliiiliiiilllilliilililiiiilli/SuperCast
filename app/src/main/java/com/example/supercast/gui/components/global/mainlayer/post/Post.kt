// Global components - Main layer - Post

package com.example.supercast.gui.components.global.mainlayer.post

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.gui.components.global.mainlayer.post.infobar.InfoBar
import com.example.supercast.gui.components.global.mainlayer.post.mainblock.MainBlock
import com.example.supercast.gui.components.global.mainlayer.post.actionsbar.ActionsBar
import com.example.supercast.ui.colors.Colors


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