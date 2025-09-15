// Play queue page - Main layer - Actions panel

package com.example.supercast.ui.pages.playqueue.layers.main.components.actionspanel

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.pics.Pics

import com.example.supercast.ui.components.common.spaces.Space

import com.example.supercast.ui.components.layers.mainlayer.actiontext.ActionText



private val colorActionEdit = Colors.ActionText

private val picActionEdit = Pics.PenOrdinaryGreyLight

private const val textActionEdit = "Изменить"



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

	}

}