// Settings page - Subscriptions folders page - Main layer - FAQ comment

package com.example.supercast.ui.pages.settingsfolders.layers.main.components.faqcomment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts



private val colorBack = Colors.FaqBack
private val colorFaq = Colors.FaqText

private val fontFaq = Fonts.ArchivoSemiBold



@Composable
fun FaqComment (
	text: String
) {

	Text (
		text = text,
		fontSize = 18.sp,
		color = colorFaq,
		fontFamily = fontFaq,
		modifier = Modifier
			.fillMaxWidth ()
			.background (color = colorBack)
			.padding (vertical = 23.dp, horizontal = 37.dp)
	)

}