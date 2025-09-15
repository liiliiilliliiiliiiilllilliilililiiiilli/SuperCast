// Podcast page - Main layer - Player block - Player - Separator

package com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.player.separator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.colors.Colors



private val colorBack = Colors.Separator



@Composable
fun Separator () {

	Box (
		modifier = Modifier
			.height (6.dp)
			.fillMaxWidth ()
			.background (colorBack)
	)

}