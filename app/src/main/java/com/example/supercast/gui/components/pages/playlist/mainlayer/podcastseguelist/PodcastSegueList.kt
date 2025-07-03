// Playlist page - Main layer - Podcasts segue list

package com.example.supercast.gui.components.pages.playlist.mainlayer.podcastseguelist

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.gui.components.pages.playlist.mainlayer.podcastseguelist.actionspanel.ActionsPanel
import com.example.supercast.gui.components.pages.playlist.mainlayer.podcastseguelist.podcasts.Podcasts

import com.example.supercast.gui.components.pages.playlist._types_.PodcastSegue



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