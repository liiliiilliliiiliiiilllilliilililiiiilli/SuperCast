// Global components - MainLayer - Comment - Ditle

package com.example.supercast.ui.components.layers.mainlayer.comment.ditle

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

import com.example.supercast.ui.components.common.spaces.Width

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts



private val colorName = Colors.PreWhite
private val colorDate = Colors.DitleDark

private val fontName = Fonts.ArchivoBold
private val fontDate = Fonts.ArchivoBold



@Composable
fun Ditle (
	name: String,
	date: Int
) {

	val date = "$date"


	Row (
		verticalAlignment = Alignment.Bottom,
		modifier = Modifier.fillMaxWidth ()
	) {

		Text (
			text = name,
			fontSize = 14.sp,
			color = colorName,
			fontFamily = fontName
		)

		Width (8)

		Text (
			text = date,
			fontSize = 14.sp,
			color = colorDate,
			fontFamily = fontDate
		)

	}

}