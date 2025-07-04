// Global components - Comment context - Blab

package com.example.supercast.gui.components.global.mainlayer.commentcontext.blab

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts

import com.example.supercast.gui.components.global.mainlayer.commentcontext._types_.Blab



val colorBlab = Colors.Text

val fontBlab = Fonts.ArchivoSemiBold



@Composable
fun Blab (
	data: Blab
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