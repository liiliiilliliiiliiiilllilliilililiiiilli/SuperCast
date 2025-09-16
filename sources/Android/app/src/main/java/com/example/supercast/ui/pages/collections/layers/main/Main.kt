// Collections page - Main layer

package com.example.supercast.ui.pages.collections.layers.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.components.spaces.Height

import com.example.supercast.ui.pages.collections.layers.main.components.myhistory.MyHistory
import com.example.supercast.ui.pages.collections.layers.main.components.myplaylists.MyPlaylists
import com.example.supercast.ui.pages.collections.layers.main.components.mycomments.MyComments
import com.example.supercast.ui.pages.collections.layers.main.components.wrapable.Wrappable



@Composable
fun Main () {

    val dataMyHistory = ""
    val dataMyPlayLists = ""
    val dataMyComments = ""
    val dataWrappable = ""


    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        Column (
            modifier = Modifier
                .verticalScroll (rememberScrollState ())
                .fillMaxWidth ()
                .statusBarsPadding ()
                .padding (vertical = 65.5.dp)
        ) {

            Height (32)

            MyHistory (
                data = dataMyHistory,
                modifier = Modifier.padding (horizontal = 12.dp)
            )

            Height (32)

            MyPlaylists (
                data = dataMyPlayLists,
                modifier = Modifier.padding (horizontal = 12.dp)
            )

            Height (24)

            MyComments (
                data = dataMyComments,
                modifier = Modifier.padding (horizontal = 12.dp)
            )

            Height (32)

            Wrappable (
                data = dataWrappable,
                modifier = Modifier.padding (horizontal = 12.dp)
            )

            Height (25)

        }

    }

}