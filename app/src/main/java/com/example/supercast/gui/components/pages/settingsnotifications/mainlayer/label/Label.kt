// Settings notifications page - Main layer - Label

package com.example.supercast.gui.components.pages.settingsnotifications.mainlayer.label

import androidx.compose.foundation.layout.padding
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
		fontSize = 17.sp,
		color = colorLabel,
		fontFamily = fontLabel,
		modifier = Modifier.padding (top = (30-11/2).dp, start = 44.dp, bottom = (17-11/2).dp)
	)

}