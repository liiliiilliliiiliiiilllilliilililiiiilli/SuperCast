// Playlist page - Main layer - Controller block

package com.example.supercast.ui.pages.playlist.layers.main.components.controllerblock

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import com.example.supercast.ui.components.spaces.Height

import com.example.supercast.ui.pages.playlist.layers.main.components.controllerblock.actionsbutton.ActionsButton
import com.example.supercast.ui.pages.playlist.layers.main.components.controllerblock.preview.Preview
import com.example.supercast.ui.pages.playlist.layers.main.components.controllerblock.ditle.Ditle
import com.example.supercast.ui.pages.playlist.layers.main.components.controllerblock.controllerbuttons.ControllerButtons



@Composable
fun ControllerBlock (
	preview: Int,
	title: String,
	author: String,
	numPodcasts: Int,
	duration: Int,
	isSaved: Boolean,
	isPlaying: Boolean
) {

	Column (
		horizontalAlignment = Alignment.CenterHorizontally,
		modifier = Modifier.fillMaxWidth ()
	) {

		ActionsButton ()

		Preview (
			pic = preview
		)

		Height (32)

		Ditle (
			title = title,
			author = author,
			numPodcasts = numPodcasts,
			duration = duration
		)

		ControllerButtons (
			isSaved = isSaved,
			isPlaying = isPlaying
		)

	}

}