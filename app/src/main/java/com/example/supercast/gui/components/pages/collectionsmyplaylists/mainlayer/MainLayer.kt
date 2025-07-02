// Collections page - My playlists page - Main layer

package com.example.supercast.gui.components.pages.collectionsmyplaylists.mainlayer

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

import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Height

import com.example.supercast.gui.components.pages.collectionsmyplaylists.mainlayer.liner.Liner
import com.example.supercast.gui.components.global.mainlayer.playlistsoap.PlaylistSoap



@Composable
fun MainLayer () {

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
                numOfTracks = 25,
                duration = 62356
            )

            PlaylistSoap (
                pic = Pics.__image_6__,
                title = "Остальное",
                numOfTracks = 79,
                duration = 265247
            )

            PlaylistSoap (
                pic = Pics.__image_7__,
                title = "Рок",
                numOfTracks = 47,
                duration = 86545
            )

            PlaylistSoap (
                pic = Pics.__image_8__,
                title = "Спокойное",
                numOfTracks = 8,
                duration = 56
            )

            PlaylistSoap (
                pic = Pics.__image_9__,
                title = "Дождь",
                numOfTracks = 5,
                duration = 128
            )

    //    }

        }

    }

}