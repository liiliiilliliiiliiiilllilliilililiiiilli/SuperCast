// Podcast page - Main layer - Player block - Player

package com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.player

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.player.seguestop.SeguesTop
import com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.player.content.Content
import com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.player.separator.Separator
import com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.player.credits.Credits
import com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.player.seguesbottom.SeguesBottom

import com.example.supercast.ui.pages.podcast.types.Player



@Composable
fun Player (
	data: Player
) {

	val content = data.content
	val credits = data.credits


	Column (
		modifier = Modifier.padding (start = 1.dp, end = 1.dp)
	) {

		SeguesTop()

		Content(
			data = content
		)

		Separator()

		Credits(
			data = credits
		)

		SeguesBottom()

	}

}