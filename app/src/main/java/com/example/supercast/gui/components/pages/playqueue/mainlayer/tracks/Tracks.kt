// Play queue page - Main layer - Tracks

package com.example.supercast.gui.components.pages.playqueue.mainlayer.tracks

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.gui.components.pages.playqueue.mainlayer.tracks.playlistsegue.PlaylistSegue as PlaylistSegueComponent
import com.example.supercast.gui.components.pages.playqueue.mainlayer.tracks.podcastsegue.PodcastSegue as PodcastSegueComponent

import com.example.supercast.gui.components.pages.playqueue._types_.PlaylistSegue
import com.example.supercast.gui.components.pages.playqueue._types_.PodcastSegue



@Composable
fun Tracks (
	tracks: Array <Any>
) {

	Column (
		modifier = Modifier
			.fillMaxWidth ()
//			.clip (RoundedCornerShape (14.dp))
//			.background (color = colorBack)
			.padding (vertical = 10.dp)
	) {

		tracks.forEachIndexed {index, track ->

			if (track is PlaylistSegue) {

				val preview = track.preview
				val title = track.title
				val numPodcasts = track.numPodcasts
				val duration = track.duration


				PlaylistSegueComponent (
					preview = preview,
					title = title,
					numPodcasts = numPodcasts,
					duration = duration
				)

			}

			else if (track is PodcastSegue) {

				val preview = track.preview
				val title = track.title
				val author = track.author
				val duration = track.duration


				PodcastSegueComponent (
					preview = preview,
					title = title,
					author = author,
					duration = duration
				)

			}

		}

	}

}