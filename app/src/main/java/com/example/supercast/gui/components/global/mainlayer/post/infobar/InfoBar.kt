// Global components - Main layer - Post - Info bar

package com.example.supercast.gui.components.global.mainlayer.post.infobar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.colors.Colors

import com.example.supercast.gui.components.distinctive.spaces.Space
import com.example.supercast.gui.components.global.mainlayer.actiontext.ActionText



private val colorInfoBar = Colors.DarkGrey



@Composable
fun InfoBar (
	left: String = "",
	right: String = ""
) {

	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.height (43.dp)
			.fillMaxWidth ()
			.padding (horizontal = 25.dp)
	) {

		if (left != "") {

			ActionText (
				text = left,
				color = colorInfoBar
			)

		}

		Space (modifier = Modifier.weight (1f))

		if (right != "") {

			ActionText (
				text = right,
				color = colorInfoBar
			)

		}

	}

}