// My comments page - Main layer - Comment soap - Main content - Content

package com.example.supercast.gui.components.pages.mycomments.mainlayer.commentsoap.mainblock.content

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts



private val color = Colors.Grey
private val font = Fonts.ArchivoBold



@Composable
fun Content (
	text: String
) {

	Text (
		text = text,
		fontSize = 14.5.sp,
		color = color,
		fontFamily = font,
		modifier = Modifier.padding (end = 10.dp)
	)

}