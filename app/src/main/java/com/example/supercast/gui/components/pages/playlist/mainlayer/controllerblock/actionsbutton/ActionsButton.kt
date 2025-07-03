// Playlist page - Main layer - Controller block - Actions button

package com.example.supercast.gui.components.pages.playlist.mainlayer.controllerblock.actionsbutton

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.gui.components.global.mainlayer.actionsbutton.ActionsButton as ActionsButtonComponent



@Composable
fun ActionsButton () {

	Row (
		horizontalArrangement = Arrangement.End,
		modifier = Modifier
			.fillMaxWidth ()
			.padding (end = 47.dp)
	) {

		ActionsButtonComponent (
			onPress = {}
		)

	}

}