// Global components - Comment - Blab

package com.example.supercast.ui.components.comment.blab

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts

import com.example.supercast.ui.components.comment._types_.Comment



val colorBlab = Colors.Text

val fontBlab = Fonts.ArchivoSemiBold



@Composable
fun Blab (
	data: Comment.Blab
) {

	val text = data.text


	Text (
		text = text,
		fontSize = 14.sp,
		color = colorBlab,
		fontFamily = fontBlab,
		modifier = Modifier
			.width (350.dp)
			.padding (end = 19.dp)
	)

}