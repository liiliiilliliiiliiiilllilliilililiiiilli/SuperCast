// Collections page - My playlists page - Main layer

package com.example.supercast.ui.pages.collectionsmyplaylists.layers.main

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

import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.common.spaces.Height

import com.example.supercast.ui.pages.collectionsmyplaylists.layers.main.components.liner.Liner
import com.example.supercast.ui.components.layers.mainlayer.playlistsoap.PlaylistSoap



@Composable
fun Main () {

    val playlistsNum = 456

    val playlistsData = arrayOf (
        "",
        "",
        "",
        "",
        ""
    )


    Box (
        modifier = Modifier
            .fillMaxSize ()
    ) {

        Column (
            modifier = Modifier
                .verticalScroll (rememberScrollState ())
                .fillMaxWidth ()
                .statusBarsPadding ()
                .padding (vertical = 65.5.dp)
        ) {

            Height (25)

            Liner (
                num = playlistsNum
            )

            Height (17)

//        playlistsData.forEachIndexed {index, data ->

            PlaylistSoap (
                pic = Pics.__image_5__,
                title = "Для путешествий",
                tracks = 25,
                duration = 62356
            )

            PlaylistSoap (
                pic = Pics.__image_6__,
                title = "Остальное",
                tracks = 79,
                duration = 265247
            )

            PlaylistSoap (
                pic = Pics.__image_7__,
                title = "Рок",
                tracks = 47,
                duration = 86545
            )

            PlaylistSoap (
                pic = Pics.__image_8__,
                title = "Спокойное",
                tracks = 8,
                duration = 56
            )

            PlaylistSoap (
                pic = Pics.__image_9__,
                title = "Дождь",
                tracks = 5,
                duration = 128
            )

    //    }

        }

    }

}