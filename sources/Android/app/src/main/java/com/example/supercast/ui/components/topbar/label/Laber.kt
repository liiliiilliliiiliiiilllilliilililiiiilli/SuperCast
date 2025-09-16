// Global components - Top bar - Label

package com.example.supercast.ui.components.topbar.label

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts



private val colorLabel = Colors.PreWhite

private val fontLabel = Fonts.FredokaSemiBold



@Composable
fun Label (
	text: String,
	fontSize: Int = 23
) {

	Text (
		text = text,
		fontSize = fontSize.sp,
		color = colorLabel,
		fontFamily = fontLabel,
		modifier = Modifier.padding (start = 18.5.dp, end = 25.dp)
	)

}