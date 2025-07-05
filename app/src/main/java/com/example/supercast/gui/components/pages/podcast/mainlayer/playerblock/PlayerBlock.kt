// Podcast page - Main layer - Player block

package com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

import com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.player.Player as PlayerComponent
import com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.reactions.Reactions as ReactionsComponent

import com.example.supercast.gui.components.pages.podcast._types_.Player
import com.example.supercast.gui.components.pages.podcast._types_.Reactions



@Composable
fun PlayerBlock (
	player: Player,
	reactions: Reactions
) {

	Column () {

		PlayerComponent (
			data = player
		)

		ReactionsComponent (
			data = reactions
		)

	}

}