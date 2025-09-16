// Collections page - My comments page - Main layer - Comment soap - Main content - Actions

package com.example.supercast.ui.pages.collectionsmycomments.layers.main.components.commentsoap.mainblock.actions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

import com.example.supercast.lib.methods.Methods

import com.example.supercast.lib.colors.Colors
import com.example.supercast.lib.fonts.Fonts

import com.example.supercast.ui.components.spaces.Space
import com.example.supercast.ui.components.spaces.Width

import com.example.supercast.ui.components.starsbutton.StarsButton



private val colorCommentsLight = Colors.Olive
private val colorCommentsDark = Colors.DarkGrey
private val colorCitatesLight = Colors.Olive
private val colorCitatesDark = Colors.DarkGrey

private val fontActions = Fonts.ArchivoBold

private const val textComments = "комментариев"
private const val textComment = "Комментировать"
private const val textCitates = "цитат"
private const val textCitate = "Цитировать"



@Composable
fun Actions (
	comments: Int,
	citates: Int,
	stars: Int
) {

	val (isStarsButtonPressed, setStarsButtonPressed) = remember {mutableStateOf (false)}


	val commentsFormatted = Methods.formatStarsNumber (comments)
	val citatesFormatted = Methods.formatStarsNumber (citates)

	val textComments = if (comments > 0) "$commentsFormatted $textComments" else textComment
	val colorTextComments = if (comments > 0) colorCommentsLight else colorCommentsDark

	val textCitates = if (citates > 0) "$citatesFormatted $textCitates" else textCitate
	val colorTextCitates = if (citates > 0) colorCitatesLight else colorCitatesDark


	Row (
		verticalAlignment = Alignment.CenterVertically,
		horizontalArrangement = Arrangement.SpaceEvenly,
		modifier = Modifier.fillMaxWidth ()
	) {

		Text (
			text = textComments,
			fontSize = 14.5.sp,
			color = colorTextComments,
			fontFamily = fontActions,
		)

		Width (14)

		Text (
			text = textCitates,
			fontSize = 14.5.sp,
			color = colorTextCitates,
			fontFamily = fontActions,
		)

		Space (modifier = Modifier.weight (1f))

		StarsButton (
			scale = 0.92f,
			value = stars,
			isPressed = isStarsButtonPressed,
			setIsPressed = setStarsButtonPressed
		)

	}

}