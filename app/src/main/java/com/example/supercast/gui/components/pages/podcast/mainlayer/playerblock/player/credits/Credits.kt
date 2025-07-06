// Podcast page - Main layer - Player block - Player - Credits

package com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.player.credits

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.colors.Colors

import com.example.supercast.gui.components.distinctive.spaces.Space
import com.example.supercast.gui.components.distinctive.spaces.Height

import com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.player.credits.creator.Creator
import com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.player.credits.chatters.Chatters
import com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.player.credits.stats.Stats
import com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.player.credits.descriptionbutton.DescriptionButton

import com.example.supercast.gui.components.pages.podcast._types_.Player



@Composable
fun Credits (
	data: Player.Credits
) {

	val creator = data.creator
	val chatters = data.chatters
	val stats = data.stats
	val description = data.description


	Column (
		modifier = Modifier
			.clip (shape = RoundedCornerShape (bottomStart = 14.dp, bottomEnd = 14.dp))
			.background (color = Colors.Blocks)
			.padding (top = 12.dp, bottom = 17.dp)
	) {

		Row (
			verticalAlignment = Alignment.CenterVertically
		) {

			Creator (
				data = creator
			)

			Space (modifier = Modifier.weight (1f))

			Chatters (
				data = chatters
			)

		}

		Height (12)

		Row (
			verticalAlignment = Alignment.CenterVertically,
			modifier = Modifier.padding (horizontal = 32.dp)
		) {

			Stats (
				data = stats
			)

			Space (modifier = Modifier.weight (1f))

			DescriptionButton (
				data = description
			)

		}

	}

}