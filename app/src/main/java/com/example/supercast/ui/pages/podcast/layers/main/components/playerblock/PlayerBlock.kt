// Podcast page - Main layer - Player block

package com.example.supercast.ui.pages.podcast.layers.main.components.playerblock

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.supercast.ui.components.common.spaces.Height

import com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.player.Player
import com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.reactions.Reactions

import com.example.supercast.ui.pages.podcast.types.Player
import com.example.supercast.ui.pages.podcast.types.Reactions


@Composable
fun PlayerBlock (
	player: Player,
	reactions: Reactions
) {

	Column (
		modifier = Modifier.fillMaxWidth ()
	) {

		Player(
			data = player
		)

		Height (12)

		Reactions(
			data = reactions
		)

	}

}