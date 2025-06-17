// Global components - Main layer - Post - MainBlock - ContextPlot - Oration

package com.example.supercast.gui.components.global.mainlayer.post.mainblock.contextplot.oration

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.R
import com.example.supercast.ui.colors.Colors



@Composable
fun Oration (
	text: String
) {

	Text (
		text = text,
		fontSize = 14.5.sp,
		fontFamily = FontFamily (Font (R.font.archivo_regular)),
		color = Colors.PreWhite,
		modifier = Modifier.padding (start = 16.dp, end = 16.dp, bottom = 2.5.dp)
	)

}