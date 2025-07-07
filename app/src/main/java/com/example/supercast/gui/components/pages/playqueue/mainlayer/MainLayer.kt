// Play queue page - Main layer

package com.example.supercast.gui.components.pages.playqueue.mainlayer

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

import com.example.supercast.gui.components.pages.playqueue.mainlayer.actionspanel.ActionsPanel
import com.example.supercast.gui.components.pages.playqueue.mainlayer.tracks.Tracks

import com.example.supercast.gui.components.pages.playqueue._types_.PlaylistSegue
import com.example.supercast.gui.components.pages.playqueue._types_.PodcastSegue



private val _dataTracks_ = arrayOf (
    PlaylistSegue (
        preview = Pics.__image_3__,
        title = "My Shit",
        podcasts = 8,
        duration = 50585
    ),
    PlaylistSegue (
        preview = Pics.__image_2__,
        title = "Hoyoverse",
        podcasts = 3,
        duration = 50585
    ),
    PlaylistSegue (
        preview = Pics.__image_6__,
        title = "One",
        podcasts = 14,
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
        preview = Pics.__image_8__,
        title = "Радуга]",
        author = "eto_y",
        duration = 50585
    )
)



@Composable
fun MainLayer () {

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

            ActionsPanel ()

            Tracks (
                tracks = _dataTracks_
            )

            Height (25)

            Height (11/2)

        }

    }

}