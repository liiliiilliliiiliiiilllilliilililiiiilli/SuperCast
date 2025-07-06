// Podcast page - Main layer - Player block - Player - Separator

package com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.player.separator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.colors.Colors



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