// Playlist page - Main layer

package com.example.supercast.ui.pages.playlist.layers.main

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

import com.example.supercast.ui.pages.playlist.layers.main.components.controllerblock.ControllerBlock
import com.example.supercast.ui.pages.playlist.layers.main.components.podcastseguelist.PodcastSegueList

import com.example.supercast.ui.pages.playlist.types.PodcastSegue



private val _picPlaylistPreview_ = Pics.__image_5__

private const val _textPlaylistTitle_ = "Для путешествий и не только"
private const val _textPlaylistAuthor_ = "Одинокий Рокер"

private const val _numPlaylistPodcasts_ = 27
private const val _numPlaylistDuration_ = 783649

private const val _boolIsSaved_ = true
private const val _boolIsPlaying_ = false

private val _dataPodcasts_ = arrayOf (
    PodcastSegue (
        preview = Pics.__image_3__,
        title = "My Shit",
        author = "A Boogie With a Hoodie",
        duration = 50585
    ),
    PodcastSegue (
        preview = Pics.__image_2__,
        title = "Hoyoverse",
        author = "Mi-Ho-Yo",
        duration = 50585
    ),
    PodcastSegue (
        preview = Pics.__image_6__,
        title = "One",
        author = "god",
        duration = 50585
    ),
    PodcastSegue (
        preview = Pics.__image_4__,
        title = "Я хочу быть собой",
        author = "li",
        duration = 50585
    ),
    PodcastSegue (
        preview = Pics.__image_4__,
        title = "Лимооооооооны",
        author = "li",
        duration = 50585
    ),
    PodcastSegue (
        preview = Pics.__image_8__,
        title = "Радуга]",
        author = "eto_y",
        duration = 50585
    ),
    PodcastSegue (
        preview = Pics.__image_7__,
        title = "Свобода",
        author = "y",
        duration = 50585
    ),
    PodcastSegue (
        preview = Pics.__image_1__,
        title = "Покой",
        author = "rainbow",
        duration = 50585
    )
)



@Composable
fun Main () {

    Box (
        modifier = Modifier.fillMaxSize ()
    ) {

        Column (
            modifier = Modifier
                .verticalScroll (rememberScrollState ())
                .statusBarsPadding ()
                .padding (vertical = 65.5.dp)
                .fillMaxWidth ()
        ) {

            Height (11/2)

            Height (25)

            ControllerBlock (
                preview = _picPlaylistPreview_,
                title = _textPlaylistTitle_,
                author = _textPlaylistAuthor_,
                numPodcasts = _numPlaylistPodcasts_,
                duration = _numPlaylistDuration_,
                isSaved = _boolIsSaved_,
                isPlaying = _boolIsPlaying_
            )

            Height (25)

            PodcastSegueList (
                podcasts = _dataPodcasts_,
                modifier = Modifier.padding (horizontal = 4.dp)
            )

            Height (25)

            Height (11/2)

        }

    }

}