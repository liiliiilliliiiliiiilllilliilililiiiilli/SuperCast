// Collections page - My listening history page - Main layer - Content

package com.example.supercast.ui.pages.collectionsmyhistory.layers.main.components.timeseparator

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts

import com.example.supercast.ui.components.common.spaces.Space



private val colorTimeSeparator = Colors.DarkGrey

private val fontTimeSeparator = Fonts.ArimoBold



@Composable
fun TimeSeparator (
	text: String
) {

	Row (
		modifier = Modifier
			.fillMaxWidth ()
			.padding (top = 30.dp, bottom = 8.dp, start = 56.dp)
	) {

		Space (modifier = Modifier.weight (1f))

		Text (
			text = text,
			fontSize = 14.sp,
			color = colorTimeSeparator,
			fontFamily = fontTimeSeparator,
			modifier = Modifier.padding (end = 50.dp)
		)

	}

}