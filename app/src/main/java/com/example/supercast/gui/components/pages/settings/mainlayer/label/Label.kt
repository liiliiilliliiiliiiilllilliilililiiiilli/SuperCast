// Settings page - Main layer - Label

package com.example.supercast.gui.components.pages.settings.mainlayer.label

import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts



private val colorLabel = Colors.Grey
private val fontLabel = Fonts.ArchivoSemiBold



@Composable
fun Label (
	text: String
) {

	Text (
		text = text,
		fontSize = 14.5.sp,
		color = colorLabel,
		fontFamily = fontLabel,
		modifier = Modifier.offset (x = 37.5.dp)
	)

}