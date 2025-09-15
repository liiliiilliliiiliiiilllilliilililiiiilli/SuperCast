// Collections page - My listening history page - Main layer

package com.example.supercast.ui.pages.collectionsmyhistory.layers.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.common.spaces.Height

import com.example.supercast.ui.pages.collectionsmyhistory.layers.main.components.timeseparator.TimeSeparator
import com.example.supercast.ui.components.layers.mainlayer.playlistsoap.PlaylistSoap
import com.example.supercast.ui.components.layers.mainlayer.tracksoap.TrackSoap


@Composable
fun Main () {

    Box (
        modifier = Modifier
            .fillMaxSize ()
    ) {

        Column (modifier = Modifier
            .verticalScroll (state = rememberScrollState ())
            .systemBarsPadding ()
            .padding (vertical = 65.5.dp)
            .fillMaxWidth ()
        ) {

            TimeSeparator(
				text = "2 дня назад"
			)

            PlaylistSoap (
                pic = Pics.__image_3__,
                title = "Чилл",
                tracks = 25,
                duration = 2378
            )

            TrackSoap (
                pic = Pics.__image_9__,
                title = "My Shit",
                author = "A Buggie With A Hoodie",
                duration = 5100
            )

            TrackSoap (
                pic = Pics.__image_9__,
                title = "My Shit",
                author = "A Buggie With A Hoodie",
                duration = 5100
            )

			TimeSeparator(
				text = "2 дня назад"
			)

            TrackSoap (
                pic = Pics.__image_9__,
                title = "My Shit",
                author = "A Buggie With A Hoodie",
                duration = 5100
            )

            TrackSoap (
                pic = Pics.__image_9__,
                title = "My Shit",
                author = "A Buggie With A Hoodie",
                duration = 5100
            )

			TimeSeparator(
				text = "2 дня назад"
			)

            PlaylistSoap (
                pic = Pics.__image_3__,
                title = "Чилл",
                tracks = 25,
                duration = 2378
            )

            PlaylistSoap (
                pic = Pics.__image_3__,
                title = "Чилл",
                tracks = 25,
                duration = 2378
            )

            TrackSoap (
                pic = Pics.__image_9__,
                title = "My Shit",
                author = "A Buggie With A Hoodie",
                duration = 5100
            )

            PlaylistSoap (
                pic = Pics.__image_3__,
                title = "Чилл",
                tracks = 25,
                duration = 2378
            )

            PlaylistSoap (
                pic = Pics.__image_3__,
                title = "Чилл",
                tracks = 25,
                duration = 2378
            )

            Height (25)

        }

    }

}