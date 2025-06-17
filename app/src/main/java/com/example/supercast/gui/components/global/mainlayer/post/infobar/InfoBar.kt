// Global components - Main layer - Post - InfoBar

package com.example.supercast.gui.components.global.mainlayer.post.infobar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.supercast.gui.components.distinctive.spaces.Space
import com.example.supercast.gui.components.global.mainlayer.actiontext.ActionText
import androidx.compose.ui.unit.dp
import com.example.supercast.ui.colors.Colors



private const val textLeft = "Редактировано"
private const val textRight = "Час назад"

private val colorText = Colors.DarkGrey



@Composable
fun InfoBar () {

	Row (
		modifier = Modifier
			.height (43.dp)
			.padding (horizontal = 25.dp)
	) {

		ActionText (
			text = textLeft,
			color = colorText
		)

		Space (
			modifier = Modifier.weight (1f)
		)

		ActionText (
			text = textRight,
			color = colorText
		)

	}

}