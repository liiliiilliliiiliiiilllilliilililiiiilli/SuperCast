// Global components - MainLayer - Comment - Segues

package com.example.supercast.gui.components.global.mainlayer.comment.segues

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

import com.example.supercast.gui.components.distinctive.spaces.Width

import com.example.supercast.gui.components.global.mainlayer.starsbutton.StarsButton

import com.example.supercast.ui.colors.Colors
import com.example.supercast.ui.fonts.Fonts



private val colorSegueLight = Colors.Olive
private val colorSegueDark = Colors.DitleDark

private val fontSegues = Fonts.ArchivoSemiBold

private const val textComments = "комментариев"
private const val textComment = "Комментировать"
private const val textCitates = "цитат"
private const val textCitate = "Цитировать"



@Composable
fun Segues (
	comments: Int,
	citates: Int,
	stars: Int
) {

	val (isPressedStarsButton, setPressedStarsButton) = remember {mutableStateOf (false)}


	val colorComments = if (comments > 0) colorSegueLight else colorSegueDark
	val colorCitates = if (citates > 0) colorSegueLight else colorSegueDark

	val textComments = if (comments > 0) "$comments $textComments" else textComment
	val textCitates = if (citates > 0) "$citates $textCitates" else textCitate


	Row (
		verticalAlignment = Alignment.CenterVertically,
		modifier = Modifier.fillMaxWidth ()
	) {

		Text (
			text = textComments,
			fontSize = 14.sp,
			color = colorComments,
			fontFamily = fontSegues
		)

		Width (19)

		Text (
			text = textCitates,
			fontSize = 14.sp,
			color = colorCitates,
			fontFamily = fontSegues
		)

		Width (19)

		StarsButton (
			value = stars,
			isPressed = isPressedStarsButton,
			setIsPressed = setPressedStarsButton,
		)

	}

}