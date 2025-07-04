// Play queue page - Main layer - Actions panel

package com.example.supercast.gui.components.pages.playqueue.mainlayer.actionspanel

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.pics.Pics

import com.example.supercast.gui.components.distinctive.spaces.Space

import com.example.supercast.gui.components.global.mainlayer.actiontext.ActionText



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