// Podcast page - Main layer - Player block - Player - Top segues

package com.example.supercast.ui.pages.podcast.layers.main.components.playerblock.player.seguestop

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.actiontext.ActionText



private val colorSegue = Colors.OliveLight

private val picSearch = Pics.SearchLime

private const val textToPublication = "К публикации"



@Composable
fun SeguesTop () {

	val action = {}


	Box (
		contentAlignment = Alignment.Center,
		modifier = Modifier
			.height (43.dp)
			.fillMaxWidth ()
			.padding (horizontal = 25.dp)
	) {

		ActionText (
			text = textToPublication,
			color = colorSegue,
			pic = picSearch,
			onPress = action
		)

	}

}