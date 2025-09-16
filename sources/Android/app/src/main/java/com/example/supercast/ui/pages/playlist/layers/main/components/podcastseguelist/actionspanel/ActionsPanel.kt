// Playlist page - Main layer - Podcasts segue list - Actions panel

package com.example.supercast.ui.pages.playlist.layers.main.components.podcastseguelist.actionspanel

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.spaces.Space

import com.example.supercast.ui.components.actiontext.ActionText



private val colorActionEdit = Colors.ActionText
private val colorActionAdd = Colors.Olive

private val picActionEdit = Pics.PenOrdinaryGreyLight
private val picActionAdd = Pics.PlusSharpOlive

private const val textActionEdit = "Редактировать"
private const val textActionAdd = "Добавить"



@Composable
fun ActionsPanel () {

	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.fillMaxWidth ()
			.padding (horizontal = 31.dp, vertical = 17.dp)
	) {

		ActionText (
			isReversed = true,
			text = textActionEdit,
			color = colorActionEdit,
			pic = picActionEdit,
			onPress = {}
		)

		Space (modifier = Modifier.weight (1f))

//		ActionText (
//			isReversed = true,
//			text = textActionAdd,
//			color = colorActionAdd,
//			pic = picActionAdd,
//			onPress = {}
//		)

	}

}