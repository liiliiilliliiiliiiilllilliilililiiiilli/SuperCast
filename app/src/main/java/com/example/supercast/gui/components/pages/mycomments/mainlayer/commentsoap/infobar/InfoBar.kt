// My comments page - Main layer - Info bar

package com.example.supercast.gui.components.pages.mycomments.mainlayer.commentsoap.infobar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts

import com.example.supercast.gui.components.distinctive.spaces.Space



private const val textPublicationFrom = "→  [Публикация от "

private val colorNormal = Colors.Olive
private val colorLight = Colors.OliveLight
private val fontInfoBar = Fonts.ArchivoBold



@Composable
fun InfoBar (
	text: String
) {

	Row (
		modifier = Modifier.padding (vertical = 17.dp)
	) {

		Space (modifier = Modifier.weight (1f))

		Text (
			text = textPublicationFrom,
			fontSize = 12.sp,
			color = colorNormal,
			fontFamily = fontInfoBar
		)

		Text (
			text = text + "]",
			fontSize = 12.sp,
			color = colorLight,
			fontFamily = fontInfoBar,
			modifier = Modifier.padding (end = 25.dp)
		)

	}

}