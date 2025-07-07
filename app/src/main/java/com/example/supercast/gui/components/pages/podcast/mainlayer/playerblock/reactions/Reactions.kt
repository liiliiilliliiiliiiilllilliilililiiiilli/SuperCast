// Podcast page - Main layer - Player block - Reactions

package com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.reactions

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.gui.components.distinctive.spaces.Space
import com.example.supercast.gui.components.distinctive.spaces.Height

import com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.reactions.list.List
import com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.reactions.expandtip.ExpandTip
import com.example.supercast.gui.components.pages.podcast.mainlayer.playerblock.reactions.addbutton.AddButton

import com.example.supercast.gui.components.pages.podcast._types_.Reactions



@Composable
fun Reactions (
	data: Reactions
) {

	val whichOpened = data.whichOpened
	val comments = data.comments
	val citates = data.citates


	Column (
		modifier = Modifier.fillMaxWidth ()
	) {

		List (
			whichOpened = whichOpened,
			comments = comments,
			citates = citates
		)

		Height (21)

		Row (
			verticalAlignment = Alignment.CenterVertically,
			modifier = Modifier
				.fillMaxWidth ()
				.padding (start = 37.dp, end = 14.dp)
		) {

			ExpandTip ()

			Space (modifier = Modifier.weight (1f))

			AddButton ()

		}

	}

}