// Global components - Main layer - Post - Info bar

package com.example.supercast.ui.components.layers.mainlayer.post.infobar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.colors.Colors

import com.example.supercast.ui.components.common.spaces.Space

import com.example.supercast.ui.components.layers.mainlayer.actiontext.ActionText

import com.example.supercast.ui.components.layers.mainlayer.post._types_.Post



private val colorInfoBar = Colors.DarkGrey



@Composable
fun InfoBar (
	data: Post.InfoBar
) {

	val left = data.left
	val right = data.right


	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier
			.height (43.dp)
			.fillMaxWidth ()
			.padding (horizontal = 25.dp)
	) {

		if (left != null) {

			ActionText (
				text = left,
				color = colorInfoBar
			)

		}

		Space (modifier = Modifier.weight (1f))

		if (right != null) {

			ActionText (
				text = right,
				color = colorInfoBar
			)

		}

	}

}