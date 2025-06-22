// Global components - Main layer - Post - MainBlock - ContextPlot - Oration

package com.example.supercast.gui.components.global.mainlayer.post.mainblock.contextplot.oration

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts



private val color = Colors.PreWhite
private val font = Fonts.ArchivoRegular



@Composable
fun Oration (
	text: String
) {

	Text (
		text = text,
		fontSize = 14.5.sp,
		color = color,
		fontFamily = font,
		modifier = Modifier.padding (start = 16.dp, end = 16.dp, bottom = 2.5.dp)
	)

}