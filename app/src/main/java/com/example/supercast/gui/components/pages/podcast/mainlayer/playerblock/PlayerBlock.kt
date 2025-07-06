// Podcast page - Main layer - Player block

package com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.gui.components.distinctive.spaces.Height

import com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.player.Player
import com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.reactions.Reactions

import com.example.supercast.gui.components.pages.podcast._types_.*



@Composable
fun PlayerBlock (
	player: Player,
	reactions: Reactions
) {

	Column (
		modifier = Modifier.fillMaxWidth ()
	) {

		Player (
			data = player
		)

		Height (12)

		Reactions (
			data = reactions
		)

	}

}