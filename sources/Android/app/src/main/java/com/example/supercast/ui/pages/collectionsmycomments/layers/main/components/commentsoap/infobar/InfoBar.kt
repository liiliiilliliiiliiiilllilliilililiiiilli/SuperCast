// Collections page - My comments page - Main layer - Info bar

package com.example.supercast.ui.pages.collectionsmycomments.layers.main.components.commentsoap.infobar

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts

import com.example.supercast.ui.components.spaces.Space



private val colorRegular = Colors.Olive
private val colorLight = Colors.OliveLight

private val fontInfoBar = Fonts.ArchivoBold

private const val textPublicationFrom = "→  [Публикация от "



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
			color = colorRegular,
			fontFamily = fontInfoBar
		)

		Text (
			text = "$text ]",
			fontSize = 12.sp,
			color = colorLight,
			fontFamily = fontInfoBar,
			modifier = Modifier.padding (end = 25.dp)
		)

	}

}