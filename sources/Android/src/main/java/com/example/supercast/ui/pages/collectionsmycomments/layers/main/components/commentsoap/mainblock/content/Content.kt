// Collections page - My comments page - Main layer - Comment soap - Main content - Content

package com.example.supercast.ui.pages.collectionsmycomments.layers.main.components.commentsoap.mainblock.content

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts



private val colorContent = Colors.Grey

private val fontContent = Fonts.ArchivoBold



@Composable
fun Content (
	text: String
) {

	Text (
		text = text,
		fontSize = 14.5.sp,
		color = colorContent,
		fontFamily = fontContent,
		modifier = Modifier.padding (end = 10.dp)
	)

}