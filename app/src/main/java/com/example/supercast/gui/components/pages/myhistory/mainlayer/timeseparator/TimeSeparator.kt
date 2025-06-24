// My listening history page - Main layer - Content

package com.example.supercast.gui.components.pages.myhistory.mainlayer.timeseparator

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts

import com.example.supercast.gui.components.distinctive.spaces.Space



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