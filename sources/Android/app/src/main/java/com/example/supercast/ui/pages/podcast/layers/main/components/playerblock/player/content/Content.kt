// Podcast page - Main layer - Player block - Player - Content

package com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.player.content

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.colors.Colors

import com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.player.content.main.Main
import com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.player.content.controller.Controller

import com.example.supercast.ui.pages.podcast._types_.Player



private val colorBack = Colors.Blocks



@Composable
fun Content (
	data: Player.Content
) {

	val ditle = data.ditle
	val preview = data.preview
	val track = data.track


	Row (
		horizontalArrangement = Arrangement.Center,
		modifier = Modifier
			.height (600.dp)
			.fillMaxWidth ()
			.clip (shape = RoundedCornerShape (topStart = 14.dp, topEnd = 14.dp))
			.background (color = colorBack)
			.padding (top = 5.dp, bottom = 8.dp)
	) {

		Main(
			ditle = ditle,
			preview = preview
		)

		Controller(
			track = track
		)

	}

}