// Global components - Main layer - Post - Main block - Context plot - Oration

package com.example.supercast.ui.components.layers.mainlayer.post.mainblock.contextplot.oration

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts



private val colorOration = Colors.PreWhite

private val fontOration = Fonts.ArchivoRegular



@Composable
fun Oration (
	text: String
) {

	Text (
		text = text,
		fontSize = 14.5.sp,
		color = colorOration,
		fontFamily = fontOration,
		modifier = Modifier.padding (start = 16.dp, end = 16.dp, bottom = 2.5.dp)
	)

}