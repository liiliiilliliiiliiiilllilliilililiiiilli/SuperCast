// Playlist page - Main layer - Podcasts segue list

package com.example.supercast.ui.pages.playlist.layers.main.components.podcastseguelist

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.pages.playlist.layers.main.components.podcastseguelist.actionspanel.ActionsPanel
import com.example.supercast.ui.pages.playlist.layers.main.components.podcastseguelist.podcasts.Podcasts

import com.example.supercast.ui.pages.playlist._types_.PodcastSegue



@Composable
fun PodcastSegueList (
	podcasts: Array <PodcastSegue>,
	modifier: Modifier
) {

	Column (
		modifier = Modifier
			.then (modifier)
			.fillMaxWidth ()
	) {

		ActionsPanel ()

		Podcasts (
			podcasts = podcasts
		)

	}

}